package Lession2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1Giaiphuongtrinh extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	private static String giaiphuongtrinhbacI(float a, float b) {
		String kq = null;
		if(a == 0) {
			if(b == 0) {
				kq = "Vô số nghiệm";
			}
			else {
				kq = "Vô nghiệm";
			}
		}
		else {
			kq = "Phương trình có nghiệm x="+String.valueOf(-b/a);
		}
		return kq;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1Giaiphuongtrinh frame = new Frame1Giaiphuongtrinh();
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
	public Frame1Giaiphuongtrinh() {
		setTitle("Giải phương trình bậc I");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGiiPhngTrnh = new JLabel("Giải phương trình bậc I");
		lblGiiPhngTrnh.setBounds(154, 35, 173, 15);
		contentPane.add(lblGiiPhngTrnh);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(68, 84, 133, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập b:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(68, 134, 133, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setHorizontalAlignment(SwingConstants.CENTER);
		lblKtQu.setBounds(68, 181, 133, 15);
		contentPane.add(lblKtQu);
		
		txta = new JTextField();
		txta.setBounds(244, 82, 114, 19);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(244, 132, 114, 19);
		contentPane.add(txtb);
		txtb.setColumns(10);
		
		txtkq = new JTextField();
		txtkq.setColumns(10);
		txtkq.setBounds(244, 179, 114, 19);
		contentPane.add(txtkq);
		
		JButton btnTnh = new JButton("Tính");
		btnTnh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				//Nhap so tu ban phim
				float a = Float.parseFloat(txta.getText().trim());
				float b = Float.parseFloat(txtb.getText().trim());
				String ketqua = giaiphuongtrinhbacI(a,b);
				txtkq.setText(ketqua);
			}
		});
		btnTnh.setBounds(108, 222, 117, 25);
		contentPane.add(btnTnh);
		
		JButton btnNhpLi = new JButton("Nhập lại");
		btnNhpLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txta.setText(null);
				txtb.setText(null);
				txtkq.setText(null);
			}
		});
		btnNhpLi.setBounds(260, 222, 117, 25);
		contentPane.add(btnNhpLi);
	}
}
