package Lession5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame2_QuanlyCD extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaCD;
	private JTextField txtTenCD;
	private JTextField txtCaSi;
	private JTextField txtSoBaiHat;
	private JTextField txtGiaThanh;
	
	private String chuoiCD = "";
	private int tongGiaThanh = 0;
	private JTextArea txtaMang;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2_QuanlyCD frame = new Frame2_QuanlyCD();
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
	public Frame2_QuanlyCD() {
		setTitle("Quản lý CD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMCd = new JLabel("Mã CD");
		lblMCd.setBounds(10, 21, 46, 14);
		contentPane.add(lblMCd);
		
		txtMaCD = new JTextField();
		txtMaCD.setBounds(66, 18, 144, 20);
		contentPane.add(txtMaCD);
		txtMaCD.setColumns(10);
		
		JLabel lblTnCd = new JLabel("Tên CD");
		lblTnCd.setBounds(244, 21, 63, 14);
		contentPane.add(lblTnCd);
		
		txtTenCD = new JTextField();
		txtTenCD.setBounds(323, 19, 271, 20);
		contentPane.add(txtTenCD);
		txtTenCD.setColumns(10);
		
		JLabel lblCaS = new JLabel("Ca sĩ");
		lblCaS.setBounds(10, 56, 46, 14);
		contentPane.add(lblCaS);
		
		txtCaSi = new JTextField();
		txtCaSi.setBounds(66, 53, 167, 20);
		contentPane.add(txtCaSi);
		txtCaSi.setColumns(10);
		
		JLabel lblSBiHt = new JLabel("Số bài hát");
		lblSBiHt.setBounds(244, 56, 81, 14);
		contentPane.add(lblSBiHt);
		
		txtSoBaiHat = new JTextField();
		txtSoBaiHat.setBounds(317, 53, 63, 20);
		contentPane.add(txtSoBaiHat);
		txtSoBaiHat.setColumns(10);
		
		JLabel lblGiThnh = new JLabel("Giá thành");
		lblGiThnh.setBounds(390, 56, 81, 14);
		contentPane.add(lblGiThnh);
		
		txtGiaThanh = new JTextField();
		txtGiaThanh.setBounds(489, 54, 105, 20);
		contentPane.add(txtGiaThanh);
		txtGiaThanh.setColumns(10);
		
		JButton btnAdd = new JButton("Thêm mới");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CD cd = new CD(txtMaCD.getText(), txtTenCD.getText(), txtCaSi.getText(),
		Integer.parseInt(txtSoBaiHat.getText()),Double.parseDouble(txtGiaThanh.getText()));
				chuoiCD += cd.getMaCD() + " - " + cd.getTenCD() + " - " + cd.getCaSi() + " - " +
				cd.getSoBaiHat() + " - " + cd.getGiaThanh() + "\n";
				tongGiaThanh += cd.giaThanh;
				txtaMang.setText(chuoiCD + "\n Tổng giá thành = " + tongGiaThanh );
			}
		});
		btnAdd.setBounds(120, 99, 121, 23);
		contentPane.add(btnAdd);
		
		JButton btnClear = new JButton("Tiếp tục");
		btnClear.setBounds(274, 99, 121, 23);
		contentPane.add(btnClear);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 127, 589, 238);
		contentPane.add(scrollPane);
		
		txtaMang = new JTextArea();
		scrollPane.setViewportView(txtaMang);


	}

}
