package Chapter4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Frame1Thongtinlienhe extends JFrame {

	private JPanel contentPane;
	private JTextField txtTen;
	private JTextField txtDtdd;
	private JTextField txtHinhAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1Thongtinlienhe frame = new Frame1Thongtinlienhe();
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
	public Frame1Thongtinlienhe() {
		setTitle("Thêm mới liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThmMiLin = new JLabel("Thêm mới liên hệ");
		lblThmMiLin.setBounds(29, 35, 124, 15);
		contentPane.add(lblThmMiLin);
		
		JLabel lblHTn = new JLabel("Họ tên");
		lblHTn.setBounds(29, 62, 95, 15);
		contentPane.add(lblHTn);
		
		JLabel lbltd = new JLabel("ĐTDĐ");
		lbltd.setBounds(29, 103, 95, 15);
		contentPane.add(lbltd);
		
		JLabel lblHnhnh = new JLabel("Hình ảnh");
		lblHnhnh.setBounds(29, 155, 95, 15);
		contentPane.add(lblHnhnh);
		
		txtTen = new JTextField();
		txtTen.setBounds(127, 62, 114, 19);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtDtdd = new JTextField();
		txtDtdd.setColumns(10);
		txtDtdd.setBounds(127, 101, 114, 19);
		contentPane.add(txtDtdd);
		
		txtHinhAnh = new JTextField();
		txtHinhAnh.setColumns(10);
		txtHinhAnh.setBounds(127, 153, 114, 19);
		contentPane.add(txtHinhAnh);
		
		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setBounds(300, 62, 138, 180);
		contentPane.add(lblHinhAnh);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hiển thị JFileChooser để chọn hình
				JFileChooser fcs = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				fcs.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				if (fcs.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File fileSelected = fcs.getSelectedFile();
					txtHinhAnh.setText(fileSelected.getAbsolutePath());
					
					ImageIcon icon = new ImageIcon(fileSelected.getAbsolutePath());
					lblHinhAnh.setIcon(icon);
					lblHinhAnh.setBounds(300, 62, 138, 180);
				};
			}
		});
		btnNewButton.setBounds(263, 150, 32, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thêm mới");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = txtTen.getText().trim();
				String dtdd = txtDtdd.getText().trim();
				File f = new File(txtHinhAnh.getText());
				String hinhAnh = f.getName();
				
				try {
					DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
					
					// rôt elements
					Document doc = docBuilder.newDocument();
					Element rootElement = doc.createElement("lienhes");
					doc.appendChild(rootElement);
					
					//lienhe
					Element lienhe = doc.createElement("lienhe");
					rootElement.appendChild(lienhe);
					
					//hoten element
					Element hoten = doc.createElement("hoten");
					hoten.appendChild(doc.createTextNode(ten));
					lienhe.appendChild(hoten);
					
					// dtdd element
					Element dtdd1 = doc.createElement("dtdd");
					dtdd1.appendChild(doc.createTextNode(dtdd));
					lienhe.appendChild(dtdd1);
					
					//hinhanh element
					Element hinh = doc.createElement("hinhanh");
					hinh.appendChild(doc.createTextNode(hinhAnh));
					lienhe.appendChild(hinh);
					
					//write the contten into xml file
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource source = new DOMSource(doc);
					StreamResult result = new StreamResult(new File("src/Chapter4/lienhe.xml"));
					
					transformer.transform(source, result);
					JOptionPane.showMessageDialog(rootPane,"Đã thêm liên hệ");
					
				}catch(ParserConfigurationException | TransformerException pce) {
					System.out.println(pce.getMessage());
					JOptionPane.showMessageDialog(rootPane, "Không thể thêm liên hệ");
				}
			}
		});
		btnNewButton_1.setBounds(124, 198, 117, 25);
		contentPane.add(btnNewButton_1);
	}
}
