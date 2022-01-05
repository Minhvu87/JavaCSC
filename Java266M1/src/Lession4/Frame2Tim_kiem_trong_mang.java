package Lession4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Frame2Tim_kiem_trong_mang extends JFrame {

	private JPanel contentPane;
	private JTextField txtn;
	private JTextField txtx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2Tim_kiem_trong_mang frame = new Frame2Tim_kiem_trong_mang();
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
	public Frame2Tim_kiem_trong_mang() {
		setTitle("Tìm kiếm các phần tử ngẫu nhiên trong mảng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpN = new JLabel("Nhập n:");
		lblNhpN.setBounds(44, 31, 143, 15);
		contentPane.add(lblNhpN);
		
		JLabel lblNhpX = new JLabel("Nhập x:");
		lblNhpX.setBounds(44, 94, 143, 15);
		contentPane.add(lblNhpX);
		
		JLabel lblKtQuPht = new JLabel("Mảng được phát sinh:");
		lblKtQuPht.setBounds(44, 146, 143, 15);
		contentPane.add(lblKtQuPht);
		
		JLabel lblKtQuTm = new JLabel("Kết quả tìm kiếm:");
		lblKtQuTm.setBounds(44, 242, 143, 15);
		contentPane.add(lblKtQuTm);
		
		txtn = new JTextField();
		txtn.setBounds(220, 29, 114, 19);
		contentPane.add(txtn);
		txtn.setColumns(10);
		
		txtx = new JTextField();
		txtx.setColumns(10);
		txtx.setBounds(220, 92, 114, 19);
		contentPane.add(txtx);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(220, 146, 168, 94);
		contentPane.add(scrollPane);
		
		JTextArea txtmang = new JTextArea();
		txtmang.setLineWrap(true);
		txtmang.setEditable(false);
		scrollPane.setViewportView(txtmang);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(220, 242, 168, 123);
		contentPane.add(scrollPane_1);
		
		JTextArea txtKq = new JTextArea();
		txtKq.setEditable(false);
		scrollPane_1.setViewportView(txtKq);
		
		JButton btnTi = new JButton("Tìm kiếm");
		btnTi.addActionListener(new ActionListener() {
			// Tao mang
			private int[] mang(int n) {
				int[] mang = new int[n];
				Random random = new Random();
				for(int i = 0; i < n; i++) {
					mang[i] = random.nextInt(100);
				}
				return mang;
			}
			// Xay dung phuong thuc xuat mang
			private String mangChuoi(int [] mang) {
				String chuoi = "";
				for(int i : mang) {
					chuoi += i + " ";
				}
				return chuoi;
			}
			// xay dung phuong thuc tim x trong mang
			private int timX(int x, int[] mang) {
				int vitri = -1;
				for(int i = 0; i < mang.length; i++) {
					if(x == mang[i]) {
						vitri = i;
						break;
					}
				}
				return vitri;
			}
			// xay dung phuong thuc kiem tra x la so lon nhat
			private boolean xLonHon(int x, int[] mang) {
				boolean flag = true;
				for(int i : mang) {
					if(x<=0) {
						flag = false;
						break;
					}
				}
				return flag;
			}
			//Xay dung phuong thuc tim va in ra cac gia tri nho hon x trong mang
			private String xNhoHon(int x, int[] mang) {
				String kq = "";
				for(int i : mang) {
					if(x < i) kq += i + " ";
				}
				return kq;
			}
			public void actionPerformed(ActionEvent arg0) {
				//Nhap du lieu tu ban phim
				Integer n = Integer.parseInt(txtn.getText().trim());
				Integer x = Integer.parseInt(txtx.getText().trim());
				int[] mang = mang(n);
				String kq = "";
				txtmang.setText(mangChuoi(mang));
				int tim = timX(x,mang);
				kq += (tim == -1)?"Không tìm thấy":"Tìm thấy tại vị trí"+tim;
				kq += "\n";
				kq += (xLonHon(x,mang))?"X lớn hơn tất cả":"X không lớn hơn tất cả";
				kq += "\n";
				
				kq += "X nhỏ hớn:" +xNhoHon(x,mang);
				txtKq.setText(kq);
				
			}
		});
		btnTi.setBounds(166, 390, 117, 25);
		contentPane.add(btnTi);
	}
}
