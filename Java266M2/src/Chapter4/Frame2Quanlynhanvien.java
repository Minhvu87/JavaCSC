package Chapter4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;



public class Frame2Quanlynhanvien extends JFrame {

	private JPanel contentPane;
	private JTable tblnhanvien;
	private JComboBox cbbDonvi;
	
	private List<NhanVien> listOfNhanVien = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2Quanlynhanvien frame = new Frame2Quanlynhanvien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame2Quanlynhanvien() {
		setTitle("Quản lý nhân viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đơn vị");
		lblNewLabel.setBounds(95, 64, 70, 15);
		contentPane.add(lblNewLabel);
		
		cbbDonvi = new JComboBox();
		cbbDonvi.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				DonVi donVi = (DonVi) cbbDonvi.getSelectedItem();
				if (donVi.getId() != 0) {
					System.out.println("=========================");
					updateTable();
				}
			}
		});

		cbbDonvi.setBounds(205, 59, 319, 24);
		contentPane.add(cbbDonvi);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 107, 554, 131);
		contentPane.add(scrollPane);
		
		
		tblnhanvien = new JTable();
		tblnhanvien.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "Họ tên",
				"Giới tính", "Ngày sinh", "Mức lương", "Địa chỉ" }));
		tblnhanvien.getColumnModel().getColumn(0).setPreferredWidth(36);
		scrollPane.setViewportView(tblnhanvien);
		
		// Nap danh sach don vi cho cbbDonvi
		initDataForCbbDonVi();
		
		// Danh sách nhân viên
		listOfNhanVien = readXMLByNhanVien();

		}
		
		protected void updateTable() {

			// Đơn vị được chọn
			DonVi donVi = (DonVi) cbbDonvi.getSelectedItem();
			
			// Lọc danh sách nhân viên theo đơn vị đã chọn
			List<NhanVien> listNhanVienAfterFilter = listOfNhanVien.stream().filter(nhanVien -> nhanVien.getIdDonVi() == donVi.getId()).collect(Collectors.toList());
			System.out.println("2=============" + listNhanVienAfterFilter.size());
			
			// Hiển thị danh sách nhân viên đã lọc lên frame
			DefaultTableModel model = (DefaultTableModel) tblnhanvien.getModel();
		    
			// Xóa dữ liệu trước đó
			while (model.getRowCount() > 0) {
				model.removeRow(model.getRowCount() - 1);
			}
			
			listNhanVienAfterFilter.forEach(nv -> {
				model.addRow(new Object[] {nv.getId(), nv.getName(), nv.getGender(), nv.getBirthday(), nv.getSalary(), nv.getAddress()});
			});
			tblnhanvien.setModel(model);
			
		}

		private List<NhanVien> readXMLByNhanVien() {
			List<NhanVien> listOfNhanVien = new ArrayList<NhanVien>();

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			Document doc;
			try {
				builder = factory.newDocumentBuilder();
				doc = builder.parse(new FileInputStream("./src/Chapter4/nhan_vien.xml"));

				NodeList nhanViens = doc.getElementsByTagName("nhan_vien");
				for (int idx = 0; idx < nhanViens.getLength(); idx++) {
					NhanVien nhanVien = new NhanVien();
					Element nhanVienXML = (Element) nhanViens.item(idx);

					nhanVien.setId(Long.parseLong(nhanVienXML.getElementsByTagName("id").item(0).getTextContent()));
					nhanVien.setName(nhanVienXML.getElementsByTagName("ho_ten").item(0).getTextContent());
					nhanVien.setGender("1".equals(nhanVienXML.getElementsByTagName("gioi_tinh").item(0).getTextContent())?"Nam":"Nữ");
					nhanVien.setBirthday(nhanVienXML.getElementsByTagName("ngay_sinh").item(0).getTextContent());
					nhanVien.setSalary(Long.parseLong(nhanVienXML.getElementsByTagName("muc_luong").item(0).getTextContent()));
					nhanVien.setAddress(nhanVienXML.getElementsByTagName("dia_chi").item(0).getTextContent());
					nhanVien.setIdDonVi(Long.parseLong(nhanVienXML.getElementsByTagName("id_don_vi").item(0).getTextContent()));
					
					listOfNhanVien.add(nhanVien);
				}

			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return listOfNhanVien;
		}

		private void initDataForCbbDonVi() {

			// Lấy danh sách đơn vị từ file bai2_don_vi.xml
			List<DonVi> listOfDonVi = readXMLByDonVi();

			// Nạp danh sách đơn vị vào CbbDonVi
			DefaultComboBoxModel<DonVi> model = new DefaultComboBoxModel<DonVi>();
			DonVi donVi = new DonVi(0L, "--- Chọn đơn vị ---");
			model.addElement(donVi);

			for (DonVi donvi : listOfDonVi) {
				model.addElement(donvi);
			}
			cbbDonvi.setModel(model);

		}

		private List<DonVi> readXMLByDonVi() {
			List<DonVi> listOfDonvi = new ArrayList<DonVi>();

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			Document doc;
			try {
				builder = factory.newDocumentBuilder();
				doc = builder.parse(new FileInputStream("./src/Chapter4/don_vi.xml"));

				NodeList donVis = doc.getElementsByTagName("don_vi");
				for (int idx = 0; idx < donVis.getLength(); idx++) {
					Element donViXML = (Element) donVis.item(idx);

					String id = donViXML.getElementsByTagName("id").item(0).getTextContent();
					String name = donViXML.getElementsByTagName("ten").item(0).getTextContent();

					DonVi donVi = new DonVi(Long.parseLong(id), name);
					listOfDonvi.add(donVi);
				}

			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return listOfDonvi;
		}

	
}
