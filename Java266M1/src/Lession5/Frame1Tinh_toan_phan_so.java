package Lession5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1Tinh_toan_phan_so extends JFrame {

	private JPanel contentPane;
	private JTextField txttuso1;
	private JTextField txtmauso1;
	private JTextField txttuso2;
	private JTextField txtmauso2;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1Tinh_toan_phan_so frame = new Frame1Tinh_toan_phan_so();
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
	public Frame1Tinh_toan_phan_so() {
		setTitle("Tính toán phân số");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPhnS = new JLabel("Phân số 1");
		lblPhnS.setBounds(99, 45, 70, 15);
		contentPane.add(lblPhnS);
		
		JLabel lblPhnS_2 = new JLabel("Phân số 2");
		lblPhnS_2.setBounds(403, 45, 70, 15);
		contentPane.add(lblPhnS_2);
		
		JLabel lblNewLabel = new JLabel("Tử số:");
		lblNewLabel.setBounds(12, 72, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblTS = new JLabel("Tử số:");
		lblTS.setBounds(323, 72, 70, 15);
		contentPane.add(lblTS);
		
		JLabel lblMuS = new JLabel("Mẫu số:");
		lblMuS.setBounds(12, 110, 70, 15);
		contentPane.add(lblMuS);
		
		JLabel lblMuS_1 = new JLabel("Mẫu số:");
		lblMuS_1.setBounds(323, 110, 70, 15);
		contentPane.add(lblMuS_1);
		
		txttuso1 = new JTextField();
		txttuso1.setBounds(99, 70, 114, 19);
		contentPane.add(txttuso1);
		txttuso1.setColumns(10);
		
		txtmauso1 = new JTextField();
		txtmauso1.setColumns(10);
		txtmauso1.setBounds(99, 108, 114, 19);
		contentPane.add(txtmauso1);
		
		txttuso2 = new JTextField();
		txttuso2.setColumns(10);
		txttuso2.setBounds(401, 70, 114, 19);
		contentPane.add(txttuso2);
		
		txtmauso2 = new JTextField();
		txtmauso2.setColumns(10);
		txtmauso2.setBounds(401, 108, 114, 19);
		contentPane.add(txtmauso2);
		
		JComboBox cbbOperator = new JComboBox();
		cbbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
		cbbOperator.setBounds(263, 77, 41, 24);
		contentPane.add(cbbOperator);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setBounds(12, 172, 70, 15);
		contentPane.add(lblKtQu);
		
		txtkq = new JTextField();
		txtkq.setEditable(false);
		txtkq.setBounds(99, 170, 114, 19);
		contentPane.add(txtkq);
		txtkq.setColumns(10);
		
		JButton btnTnh = new JButton("Tính");
		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tuSo1 = Integer.parseInt(txttuso1.getText().trim());
				int mauSo1 = Integer.parseInt(txtmauso1.getText().trim());
				PhanSo ps1 = new PhanSo(tuSo1, mauSo1);
				
				PhanSo ps2 = new PhanSo(Integer.parseInt(txttuso2.getText().trim()), Integer.parseInt(txtmauso2.getText().trim()));
			
				// Kiểm tra tác vụ người dùng chọn và thực tác vụ đó
				PhanSo kq = null;
				if ("+".equals(cbbOperator.getSelectedItem())) {
					kq = ps1.CongPhanSo(ps2);
				} else if ("-".equals(cbbOperator.getSelectedItem())) {
					kq = ps1.TruPhanSo(ps2);
				} else if ("*".equals(cbbOperator.getSelectedItem())) {
					kq = ps1.NhanPhanSo(ps2); 
				} else if ("/".equals(cbbOperator.getSelectedItem())) {
					kq = ps1.ChiaPhanSo(ps2); 
				}
				
				// Hiển thị kết quả
				txtkq.setText(kq.toString());

			}
		});
		btnTnh.setBounds(99, 219, 117, 25);
		contentPane.add(btnTnh);
		
		JButton btnLmLi = new JButton("Làm lại");
		btnLmLi.setBounds(323, 219, 117, 25);
		contentPane.add(btnLmLi);
	}
}
