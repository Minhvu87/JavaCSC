package Lession2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Frame7Tinhamlichtuduonglich extends JFrame {

	private JPanel contentPane;
	private JTextField txtnam;
	private JLabel lblhinhanh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame7Tinhamlichtuduonglich frame = new Frame7Tinhamlichtuduonglich();
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
	public Frame7Tinhamlichtuduonglich() {
		setTitle("Zodiac");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYearOfBirth = new JLabel("Year of birth:");
		lblYearOfBirth.setBounds(92, 27, 110, 15);
		contentPane.add(lblYearOfBirth);
		
		txtnam = new JTextField();
		txtnam.setBounds(244, 25, 132, 19);
		contentPane.add(txtnam);
		txtnam.setColumns(10);
		
		JLabel lblcan = new JLabel("");
		lblcan.setBounds(160, 363, 70, 15);
		contentPane.add(lblcan);
		
		JLabel lblchi = new JLabel("");
		lblchi.setBounds(244, 363, 70, 15);
		contentPane.add(lblchi);
		
		lblhinhanh = new JLabel("");
		lblhinhanh.setIcon(new ImageIcon(Frame7Tinhamlichtuduonglich.class.getResource("/resources/image/10_dau.jpg")));
		lblhinhanh.setLabelFor(lblhinhanh);
		lblhinhanh.setBounds(92, 81, 299, 248);
		contentPane.add(lblhinhanh);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int nam = Integer.parseInt(txtnam.getText().trim());
				int can = nam % 10;
				int chi = nam % 12;
				switch(can) {
					case 0: 
						lblcan.setText("Canh");
						break;
					case 1: 
						lblcan.setText("Tân");
						break;
					case 2: 
						lblcan.setText("Nhâm");
						break;
					case 3: 
						lblcan.setText("Quý");
						break;
					case 4: 
						lblcan.setText("Giáp");
						break;
					case 5: 
						lblcan.setText("Ất");
						break;
					case 6: 
						lblcan.setText("Bính");
						break;
					case 7: 
						lblcan.setText("Đinh");
						break;
					case 8: 
						lblcan.setText("Mậu");
						break;
					case 9: 
						lblcan.setText("Kỷ");
						break;
				}
				switch(chi) {
					case 0:
						lblchi.setText("Thân");
						break;
					case 1:
						lblchi.setText("Dậu");
					
						break;
					case 2:
						lblchi.setText("Tuất");
						
						break;
					case 3:
						lblchi.setText("Hợi");
				
						break;
					case 4:
						lblchi.setText("Tí");
						break;
					case 5:
						lblchi.setText("Sửu");
						break;
					case 6:
						lblchi.setText("Dần");
						break;
					case 7:
						lblchi.setText("Mão");
						break;
					case 8:
						lblchi.setText("Thìn");
						break;
					case 9:
						lblchi.setText("Tỵ");
						break;
					case 10:
						lblchi.setText("Ngọ");
						break;
					case 11:
						lblchi.setText("Mùi");
						break;
				}
				
			}
		});
		btnNewButton.setBounds(12, 54, 415, 15);
		contentPane.add(btnNewButton);
	}

}
