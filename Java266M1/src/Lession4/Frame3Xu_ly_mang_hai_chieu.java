package Lession4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Frame3Xu_ly_mang_hai_chieu extends JFrame {

	private JPanel contentPane;
	private JTextField txtdong;
	private JTextField txtcot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3Xu_ly_mang_hai_chieu frame = new Frame3Xu_ly_mang_hai_chieu();
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
	public Frame3Xu_ly_mang_hai_chieu() {
		setTitle("Xử lý mảng hai chiều");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập m(dòng):");
		lblNewLabel.setBounds(43, 43, 170, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpNdng = new JLabel("Nhập n(cột):");
		lblNhpNdng.setBounds(43, 86, 170, 15);
		contentPane.add(lblNhpNdng);
		
		JLabel lblMngcPht = new JLabel("Mảng được phát sinh:");
		lblMngcPht.setBounds(43, 170, 170, 15);
		contentPane.add(lblMngcPht);
		
		JLabel lblKtQuX = new JLabel("Kết quả xử lý:");
		lblKtQuX.setBounds(43, 285, 170, 15);
		contentPane.add(lblKtQuX);
		
		txtdong = new JTextField();
		txtdong.setBounds(217, 41, 114, 19);
		contentPane.add(txtdong);
		txtdong.setColumns(10);
		
		txtcot = new JTextField();
		txtcot.setColumns(10);
		txtcot.setBounds(217, 84, 114, 19);
		contentPane.add(txtcot);
		
		JTextArea txtmang = new JTextArea();
		txtmang.setEditable(false);
		txtmang.setLineWrap(true);
		txtmang.setBounds(212, 170, 163, 103);
		contentPane.add(txtmang);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(210, 285, 165, 121);
		contentPane.add(scrollPane);
		
		JTextArea txtkq = new JTextArea();
		txtkq.setWrapStyleWord(true);
		scrollPane.setViewportView(txtkq);
		
		JButton btnPhtSinhV = new JButton("Phát sinh và xử lý");
		btnPhtSinhV.addActionListener(new ActionListener() {
			// Tao mang 2 chieu
			private int[][] mang(int n, int m){
				int[][] mang = new int[n][m];
				Random random = new Random();
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++) {
						mang[i][j] = random.nextInt(100);
					}
				}
				return mang;
			}
			//Xuat mang 2 chieu 
			private String mangChuoi(int[][] mang) {
				String chuoi = "";
				for(int i = 0; i< mang.length; i++) {
					for(int j = 0; j < mang[i].length; j++) {
						chuoi += mang[i][j]+" ";
					}
					chuoi += "\n";
				}
				return chuoi;
			}
			// Viet phuong thuc xu ly mang 2 chieu voi ket qua tra ve la mot mang chua cac ket qua duoc yeu cau
			private int[] xulyMangHaiChieu(int[][]mang) {
				int[] mangKQ = new int[6];
				int soPTchan = 0;
				int soPTle = 0;
				int tongchan=0;
				int tongle=0;
				int max = mang[0][0];
				int min = mang[0][0];
				
				for(int i = 0; i < mang.length; i++) {
					for(int j = 0; j < mang.length; j++) {
						if(mang[i][j] % 2 ==0) {
							soPTchan++;
							tongchan += mang[i][j];
						}
						if(mang[i][j] %2 ==1) {
							soPTle++;
							tongle += mang[i][j];
						}
						if(max < mang[i][j]) {
							max = mang[i][j];
						}
						if(min > mang[i][j]) {
							min = mang[i][j];
						}
					}
				}
				mangKQ[0] = soPTchan;
				mangKQ[1] = soPTle;
				mangKQ[2] = tongchan;
				mangKQ[3] = tongle;
				mangKQ[4] = max;
				mangKQ[5] = min;
				return mangKQ;
			}
			public void actionPerformed(ActionEvent arg0) {
				// Xu ly dong cot tu ban phim
				Integer m = Integer.parseInt(txtdong.getText().trim());
				Integer n = Integer.parseInt(txtcot.getText().trim());
				int[][] mang = mang(n,m);
				txtmang.setText(mangChuoi(mang));
				int [] mangKQ = xulyMangHaiChieu(mang);
				float tbchan = (float) mangKQ[2] / mangKQ[0];
				float tble = (float) mangKQ[3] / mangKQ[1];
				String kq = "";
				kq += "Số phần tử chẵn = " +mangKQ[0] + "\n";
				kq += "Số phần tử lẻ = " + mangKQ[2] +"\n";
				kq += "Trung bình chẵn = "+ tbchan +"\n";
				kq += "Trung bình lẻ = " + tble + "\n";
				kq += "GT max =" + mangKQ[4] + "\n";
				kq += "GT min =" + mangKQ[5] +"\n";
				txtkq.setText(kq);
			}
		});
		btnPhtSinhV.setBounds(119, 133, 163, 25);
		contentPane.add(btnPhtSinhV);
	}

}
