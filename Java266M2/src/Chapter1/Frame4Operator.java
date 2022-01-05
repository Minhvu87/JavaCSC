package Chapter1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame4Operator extends JFrame {

	private JPanel contentPane;
	private JTextField txtSo1;
	private JTextField txtSo2;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4Operator frame = new Frame4Operator();
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
	public Frame4Operator() {
		setTitle("Phép tính");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số thứ nhất");
		lblNewLabel.setBounds(54, 53, 104, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblSThHai = new JLabel("Số thứ hai");
		lblSThHai.setBounds(54, 121, 104, 15);
		contentPane.add(lblSThHai);
		
		JLabel lblKetQua = new JLabel("Kết quả");
		lblKetQua.setBounds(54, 188, 104, 15);
		contentPane.add(lblKetQua);
		
		txtSo1 = new JTextField();
		txtSo1.setBounds(201, 51, 114, 19);
		contentPane.add(txtSo1);
		txtSo1.setColumns(10);
		
		txtSo2 = new JTextField();
		txtSo2.setColumns(10);
		txtSo2.setBounds(201, 119, 114, 19);
		contentPane.add(txtSo2);
		
		txtKetQua = new JTextField();
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(201, 186, 114, 19);
		contentPane.add(txtKetQua);
		
		JButton btnNewButton = new JButton("Tổng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soThuNhat = Integer.parseInt(txtSo1.getText().trim());
				int soThuHai = Integer.parseInt(txtSo2.getText().trim());
				Operator op1 = (operand1, operand2) -> operand1 + operand2;
				int tong = op1.operate(soThuNhat, soThuHai);
				lblKetQua.setText("Tổng");
				txtKetQua.setText(String.valueOf(tong));
			}
		});
		btnNewButton.setBounds(363, 48, 92, 25);
		contentPane.add(btnNewButton);
		
		JButton btnHiu = new JButton("Hiệu");
		btnHiu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soThuNhat = Integer.parseInt(txtSo1.getText().trim());
				int soThuHai = Integer.parseInt(txtSo2.getText().trim());
				Operator op2 = (operand1, operand2) -> operand1 - operand2;
				int hieu = op2.operate(soThuNhat, soThuHai);
				lblKetQua.setText("Hiệu");
				txtKetQua.setText(String.valueOf(hieu));
			}
		});
		btnHiu.setBounds(497, 48, 92, 25);
		contentPane.add(btnHiu);
		
		JButton btnTch = new JButton("Tích");
		btnTch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soThuNhat = Integer.parseInt(txtSo1.getText().trim());
				int soThuHai = Integer.parseInt(txtSo2.getText().trim());
				Operator op3 = (operand1, operand2) -> operand1 * operand2;
				int tich = op3.operate(soThuNhat, soThuHai);
				lblKetQua.setText("Tích");
				txtKetQua.setText(String.valueOf(tich));
			}
		});
		btnTch.setBounds(363, 116, 92, 25);
		contentPane.add(btnTch);
		
		JButton btnThng = new JButton("Thương");
		btnThng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soThuNhat = Integer.parseInt(txtSo1.getText().trim());
				int soThuHai = Integer.parseInt(txtSo2.getText().trim());
				Operator op1 = (operand1, operand2) -> operand1 / operand2;
				int thuong = op1.operate(soThuNhat, soThuHai);
				lblKetQua.setText("Thương");
				txtKetQua.setText(String.valueOf(thuong));
			}
		});
		btnThng.setBounds(497, 116, 92, 25);
		contentPane.add(btnThng);
	}
}
