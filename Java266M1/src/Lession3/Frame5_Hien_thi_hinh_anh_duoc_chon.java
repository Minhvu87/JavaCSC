package Lession3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame5_Hien_thi_hinh_anh_duoc_chon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5_Hien_thi_hinh_anh_duoc_chon frame = new Frame5_Hien_thi_hinh_anh_duoc_chon();
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
	public Frame5_Hien_thi_hinh_anh_duoc_chon() {
		setTitle("Image view");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhienthi = new JLabel("");
		lblhienthi.setBounds(160, 12, 249, 227);
		contentPane.add(lblhienthi);
		
		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(Frame5_Hien_thi_hinh_anh_duoc_chon.class.getResource("/resources1/image/icon-Doraemon.jpg")));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblhienthi.setIcon(new ImageIcon(Frame5_Hien_thi_hinh_anh_duoc_chon.class.getResource("/resources1/image/Doraemon.jpg")));
			}
		});
		btn1.setBounds(12, 12, 78, 70);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(Frame5_Hien_thi_hinh_anh_duoc_chon.class.getResource("/resources1/image/icon-Nobita.jpg")));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblhienthi.setIcon(new ImageIcon(Frame5_Hien_thi_hinh_anh_duoc_chon.class.getResource("/resources1/image/Nobita.jpeg")));
			}
		});
		btn2.setBounds(12, 94, 78, 70);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(Frame5_Hien_thi_hinh_anh_duoc_chon.class.getResource("/resources1/image/icon-Xuka.jpg")));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblhienthi.setIcon(new ImageIcon(Frame5_Hien_thi_hinh_anh_duoc_chon.class.getResource("/resources1/image/Xuka.jpg")));
			}
		});
		btn3.setBounds(12, 176, 78, 70);
		contentPane.add(btn3);
		
		
	}
}
