package Lession6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Frame3QuanLySach extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaSach;
	private JTextField txtNgayNhap;
	private JTextField txtDonGia;
	private JTextField txtTenSach;
	private JTextField txtNXB;
	private JTextField txtSoLuong;
	private JTextField txtThue;
	private JTextField txtTongThanhTien;
	private JTextField txtDonGiaTrungBinh;
	private JTextField textField_9;
	private JTextField textField_10;
	private ButtonGroup genderGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3QuanLySach frame = new Frame3QuanLySach();
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
	public Frame3QuanLySach() {
		setTitle("Quản lý sách");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin chung");
		lblNewLabel.setBounds(37, 28, 122, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblMSch = new JLabel("Mã sách");
		lblMSch.setBounds(37, 67, 122, 15);
		contentPane.add(lblMSch);
		
		JLabel lblnGi = new JLabel("Đơn giá");
		lblnGi.setBounds(37, 153, 122, 15);
		contentPane.add(lblnGi);
		
		JLabel lblNgyNhp = new JLabel("Ngày nhập");
		lblNgyNhp.setBounds(37, 106, 122, 15);
		contentPane.add(lblNgyNhp);
		
		JLabel lblTnSch = new JLabel("Tên sách");
		lblTnSch.setBounds(320, 67, 122, 15);
		contentPane.add(lblTnSch);
		
		JLabel lblNxb = new JLabel("NXB");
		lblNxb.setBounds(320, 106, 122, 15);
		contentPane.add(lblNxb);
		
		JLabel lblSLng = new JLabel("Số Lượng");
		lblSLng.setBounds(320, 153, 122, 15);
		contentPane.add(lblSLng);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sách Giáo Khoa");
		rdbtnNewRadioButton.setBounds(37, 189, 149, 23);
		contentPane.add(rdbtnNewRadioButton);
		genderGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSchThamKho = new JRadioButton("Sách Tham Khảo");
		rdbtnSchThamKho.setBounds(320, 189, 149, 23);
		contentPane.add(rdbtnSchThamKho);
		genderGroup.add(rdbtnSchThamKho);
		
		JLabel lblNewLabel_1 = new JLabel("Tình trạng");
		lblNewLabel_1.setBounds(37, 230, 98, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Thuế");
		lblNewLabel_2.setBounds(329, 230, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		txtMaSach = new JTextField();
		txtMaSach.setBounds(177, 65, 114, 19);
		contentPane.add(txtMaSach);
		txtMaSach.setColumns(10);
		
		txtNgayNhap = new JTextField();
		txtNgayNhap.setColumns(10);
		txtNgayNhap.setBounds(177, 104, 114, 19);
		contentPane.add(txtNgayNhap);
		
		txtDonGia = new JTextField();
		txtDonGia.setColumns(10);
		txtDonGia.setBounds(177, 151, 114, 19);
		contentPane.add(txtDonGia);
		
		txtTenSach = new JTextField();
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(448, 65, 114, 19);
		contentPane.add(txtTenSach);
		
		txtNXB = new JTextField();
		txtNXB.setColumns(10);
		txtNXB.setBounds(448, 104, 114, 19);
		contentPane.add(txtNXB);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(448, 151, 114, 19);
		contentPane.add(txtSoLuong);
		
		txtThue = new JTextField();
		txtThue.setColumns(10);
		txtThue.setBounds(448, 220, 114, 19);
		contentPane.add(txtThue);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cũ ", "Mới"}));
		comboBox.setBounds(177, 225, 80, 24);
		contentPane.add(comboBox);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 321, 566, 177);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Sách giáo khoa", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tổng thành tiền");
		lblNewLabel_3.setBounds(29, 12, 128, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Đơn giá trung bình");
		lblNewLabel_3_1.setBounds(299, 12, 148, 15);
		panel.add(lblNewLabel_3_1);
		
		txtTongThanhTien = new JTextField();
		txtTongThanhTien.setBounds(167, 10, 114, 19);
		panel.add(txtTongThanhTien);
		txtTongThanhTien.setColumns(10);
		
		txtDonGiaTrungBinh = new JTextField();
		txtDonGiaTrungBinh.setColumns(10);
		txtDonGiaTrungBinh.setBounds(435, 10, 114, 19);
		panel.add(txtDonGiaTrungBinh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 39, 510, 99);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setColumnHeaderView(list);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Sách tham khảo", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Tổng thành tiền");
		lblNewLabel_4.setBounds(12, 7, 113, 15);
		panel_1.add(lblNewLabel_4);
		
		textField_9 = new JTextField();
		textField_9.setBounds(142, 5, 114, 19);
		textField_9.setColumns(10);
		panel_1.add(textField_9);
		
		JLabel lblNewLabel_4_1 = new JLabel("Đơn giá trung bình");
		lblNewLabel_4_1.setBounds(261, 7, 131, 15);
		panel_1.add(lblNewLabel_4_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(410, 5, 114, 19);
		textField_10.setColumns(10);
		panel_1.add(textField_10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 34, 525, 104);
		panel_1.add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Nhập sách");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(140, 273, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnTipTc = new JButton("Tiếp tục");
		btnTipTc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTipTc.setBounds(320, 273, 117, 25);
		contentPane.add(btnTipTc);
	}
}
