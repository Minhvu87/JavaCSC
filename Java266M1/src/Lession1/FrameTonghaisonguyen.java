package Lession1;

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

public class FrameTonghaisonguyen extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTonghaisonguyen frame = new FrameTonghaisonguyen();
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
	public FrameTonghaisonguyen() {
		setTitle("Tính tổng hai số nguyên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnhTngHai = new JLabel("Tính tổng hai số nguyên");
		lblTnhTngHai.setBounds(92, 41, 211, 15);
		contentPane.add(lblTnhTngHai);
		
		JLabel lblSNguynTh = new JLabel("Số nguyên thứ nhất: ");
		lblSNguynTh.setBounds(53, 98, 164, 15);
		contentPane.add(lblSNguynTh);
		
		JLabel lblSNguynTh_1 = new JLabel("Số nguyên thứ hai:");
		lblSNguynTh_1.setBounds(53, 150, 164, 15);
		contentPane.add(lblSNguynTh_1);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setBounds(53, 193, 164, 15);
		contentPane.add(lblKtQu);
		
		txt1 = new JTextField();
		txt1.setBounds(235, 96, 172, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(235, 148, 172, 19);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txtkq = new JTextField();
		txtkq.setBounds(235, 191, 172, 19);
		contentPane.add(txtkq);
		txtkq.setColumns(10);
		
		JButton btnTnhTng = new JButton("Tính tổng");
		btnTnhTng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Lay gia tri tung so hang
				String Number1 = txt1.getText().trim();
				String Number2 = txt2.getText().trim();
				
				Double num1 = Double.valueOf(Number1);
				Double num2 = Double.valueOf(Number2);
				
				//Tinh tong
				Double tong = num1 + num2;
				txtkq.setText(String.valueOf(tong));
			}
		});
		btnTnhTng.setBounds(158, 233, 117, 25);
		contentPane.add(btnTnhTng);
	}

}
