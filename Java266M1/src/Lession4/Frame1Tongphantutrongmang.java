package Lession4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;

public class Frame1Tongphantutrongmang extends JFrame {

	private JPanel contentPane;
	private JTextField txtn;
	private JTextField txttong;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1Tongphantutrongmang frame = new Frame1Tongphantutrongmang();
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
	public Frame1Tongphantutrongmang() {
		setTitle("Tính tổng các phần tử có giá trị ngẫu nhiên trong mảng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpN = new JLabel("Nhập n:");
		lblNhpN.setBounds(50, 49, 173, 15);
		contentPane.add(lblNhpN);
		
		JLabel lblMngcPht = new JLabel("Mảng được phát sinh:");
		lblMngcPht.setBounds(50, 106, 173, 15);
		contentPane.add(lblMngcPht);
		
		JLabel lblTng = new JLabel("Tổng:");
		lblTng.setBounds(50, 268, 173, 15);
		contentPane.add(lblTng);
		
		txtn = new JTextField();
		txtn.setBounds(255, 47, 227, 19);
		contentPane.add(txtn);
		txtn.setColumns(10);
		
		txttong = new JTextField();
		txttong.setBounds(255, 266, 227, 19);
		contentPane.add(txttong);
		txttong.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(255, 118, 230, 136);
		contentPane.add(scrollPane);
		
		JTextArea txtmang = new JTextArea();
		txtmang.setLineWrap(true);
		txtmang.setEditable(false);
		scrollPane.setViewportView(txtmang);
		
		
		JButton btnTnhTng = new JButton("Tính tổng");
		btnTnhTng.addActionListener(new ActionListener() {
			//Xay dung phuong thuc tao mang cac so ngau nhien <= 100 bang cach su dung Random
			private int[] mang(int n) {
				//Tạo giá trị ngẫu nhiên
				//int number=(int)(Math.random()) * 100
				int[] mang = new int[n];
				Random random = new Random();
				for(int i = 0; i < n; i++) {
					mang[i] = random.nextInt(100);
				}
				return mang;
			}
			//Xay dung phuong thuc xuat mang
			private String mangChuoi(int[] mang) {
				String chuoi = "";
				for(int i:mang) {
					chuoi += i + " "; 
					if(i%10 == 0) {
						System.out.println("\n");
					}
				}
				return chuoi;
			}
			//Xay dung phuong thuc tinh tong cac phan tu trong mang
			private int Tong(int[] mang) {
				int tong = 0;
				for(int i:mang) {
					tong += i;
				}
				return tong;
			}
			public void actionPerformed(ActionEvent arg0) {
				//Nhap n tu ban phim
				int n = Integer.parseInt(txtn.getText().trim());
				int[] array = mang(n);
				txtmang.setText(mangChuoi(array));
				txttong.setText(String.valueOf(Tong(array)));
				
			}
		});
		btnTnhTng.setBounds(201, 333, 117, 25);
		contentPane.add(btnTnhTng);
		
	}
}
