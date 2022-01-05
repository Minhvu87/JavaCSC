package Lession6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class Frame2Tinh_luong_nhan_vien extends JFrame {

	private JPanel contentPane;
	private JTextField txtHesoluong;
	private JTextField txt3;
	private JTextField txtLuong;
	private JLabel lbl3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2Tinh_luong_nhan_vien frame = new Frame2Tinh_luong_nhan_vien();
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
	public Frame2Tinh_luong_nhan_vien() {
		setTitle("Tính lương nhân viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoiNv = new JLabel("Loại NV");
		lblLoiNv.setBounds(61, 37, 101, 15);
		contentPane.add(lblLoiNv);
		
		JLabel lblHSLng = new JLabel("Hệ số lương");
		lblHSLng.setBounds(61, 90, 101, 15);
		contentPane.add(lblHSLng);
		
		JLabel lbl3 = new JLabel("Phụ cấp");
		lbl3.setBounds(61, 137, 101, 15);
		contentPane.add(lbl3);
		
		JLabel lblLng = new JLabel("Lương");
		lblLng.setBounds(61, 224, 101, 15);
		contentPane.add(lblLng);
		
		JComboBox cbbLoaiNV = new JComboBox();
		cbbLoaiNV.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (cbbLoaiNV.getSelectedIndex() == 0) {// Hanh Chanh
					lbl3.setVisible(true);
					txt3.setVisible(true);
					lbl3.setText("Phụ cấp");
				} else if (cbbLoaiNV.getSelectedIndex() == 1) { // Ky thuat
					lbl3.setVisible(true);
					txt3.setVisible(true);
					lbl3.setText("Số dự án");
				} else if (cbbLoaiNV.getSelectedIndex() == 2) { // Kinh doanh
					lbl3.setVisible(true);
					txt3.setVisible(true);
					lbl3.setText("Số sản phẩm");
				} else if (cbbLoaiNV.getSelectedIndex() == 3) { // Lanh dao
					lbl3.setVisible(false);
					txt3.setVisible(false);
				}
			}
		});

		cbbLoaiNV.setModel(new DefaultComboBoxModel(new String[] {"Hành Chính", "Kỹ Thuật", "Kinh Doanh", "Lãnh Đạo"}));
		cbbLoaiNV.setBounds(223, 32, 164, 24);
		contentPane.add(cbbLoaiNV);
		
		txtHesoluong = new JTextField();
		txtHesoluong.setBounds(223, 88, 164, 19);
		contentPane.add(txtHesoluong);
		txtHesoluong.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(223, 135, 164, 19);
		contentPane.add(txt3);
		
		txtLuong = new JTextField();
		txtLuong.setColumns(10);
		txtLuong.setBounds(223, 222, 164, 19);
		contentPane.add(txtLuong);
		
		JButton btnNewButton = new JButton("Tính lương");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double hesoLuong = Double.parseDouble(txtHesoluong.getText().trim());
				Double thongso = Double.parseDouble(txt3.getText().trim());
				NhanVien nhanVien = null;
				if (cbbLoaiNV.getSelectedIndex() == 0) {// Hanh Chanh
					nhanVien = new HanhChinh(thongso,hesoLuong);
				} else if (cbbLoaiNV.getSelectedIndex() == 1) { // Ky thuat
					nhanVien = new KyThuat(thongso, hesoLuong);
				} else if (cbbLoaiNV.getSelectedIndex() == 2) { // Kinh doanh
					nhanVien = new KinhDoanh(thongso, hesoLuong);
				} else if (cbbLoaiNV.getSelectedIndex() == 3) { // Lanh dao
					nhanVien = new LanhDao(hesoLuong);
				}
				txtLuong.setText(String.valueOf(nhanVien.tinhLuong()));

			}
		});
		btnNewButton.setBounds(223, 174, 164, 25);
		contentPane.add(btnNewButton);
	}
}
