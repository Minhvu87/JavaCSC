package Lession1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Operator extends JFrame {

	private JPanel contentPane;
	private JTextField txtSH1;
	private JTextField txtSH2;
	private JTextField txtKq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operator frame = new Operator();
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
	public Operator() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Toán Tử");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chọn toán tử");
		lblNewLabel.setBounds(35, 12, 103, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số Hạng 1");
		lblNewLabel_1.setBounds(35, 51, 103, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số Hạng 2");
		lblNewLabel_2.setBounds(35, 90, 103, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kết Quả");
		lblNewLabel_3.setBounds(35, 161, 103, 15);
		contentPane.add(lblNewLabel_3);
		
		txtSH1 = new JTextField();
		txtSH1.setBounds(186, 49, 216, 19);
		contentPane.add(txtSH1);
		txtSH1.setColumns(10);
		
		txtSH2 = new JTextField();
		txtSH2.setBounds(186, 88, 216, 19);
		contentPane.add(txtSH2);
		txtSH2.setColumns(10);
		
		JComboBox cbbOperator = new JComboBox();
		cbbOperator.setModel(new DefaultComboBoxModel(new String[] {"--Chọn--", "+", "-", "*", "/"}));
		cbbOperator.setBounds(193, 7, 209, 24);
		contentPane.add(cbbOperator);
		
		txtKq = new JTextField();
		txtKq.setBounds(188, 159, 214, 19);
		contentPane.add(txtKq);
		txtKq.setColumns(10);
		
		JButton btnNewButton = new JButton("Tính");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Lay gia tri 2 toan hang
				String SH1 = txtSH1.getText().trim();
				String SH2 = txtSH2.getText().trim();
				
				Double sSH1 = Double.valueOf(SH1);
				Double sSH2 = Double.parseDouble(SH2);
				
				//Lay toan tu ma nguoi dung chon
				String operator = cbbOperator.getSelectedItem().toString();
				//Thuc hien tinh toan
				double kq = 0;
				if("+".equals(operator)) {
					kq = sSH1 + sSH2;
				}else if("-".equals(operator)) {
					kq = sSH1 - sSH2;
				}else if("*".equals(operator)) {
					kq = sSH1 * sSH2;
				}else if("/".equals(operator)) {
					kq = sSH1 / sSH2;
				}else {
					JOptionPane.showMessageDialog(null, "Bạn phải chọn toán tử để thực hiện");
				}
				txtKq.setText(String.valueOf(kq));
				
			}
		});
		btnNewButton.setBounds(148, 119, 117, 25);
		contentPane.add(btnNewButton);
		
		
	}
}
