package Lession5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3_Phim extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenPhim;
	private JTextField txtTheLoai;
	private JTextField txtNgayChieu;
	private JTextField txtRap;
	private Phim[] phim = new Phim[5];
	private int flag = 0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_Phim frame = new Frame3_Phim();
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
	public Frame3_Phim() {
		setTitle("Phim chiếu rạp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//lblHinhAnh = new JLabel("");
		//lblHinhAnh.setBounds(96, 38, 162, 169);
		//contentPane.add(lblHinhAnh);
		
		txtTenPhim = new JTextField();
		txtTenPhim.setBackground(Color.YELLOW);
		txtTenPhim.setBounds(302, 38, 162, 19);
		contentPane.add(txtTenPhim);
		txtTenPhim.setColumns(10);
		
		txtTheLoai = new JTextField();
		txtTheLoai.setBackground(Color.ORANGE);
		txtTheLoai.setColumns(10);
		txtTheLoai.setBounds(302, 85, 162, 19);
		contentPane.add(txtTheLoai);
		
		txtNgayChieu = new JTextField();
		txtNgayChieu.setBackground(Color.GREEN);
		txtNgayChieu.setColumns(10);
		txtNgayChieu.setBounds(302, 136, 162, 19);
		contentPane.add(txtNgayChieu);
		
		txtRap = new JTextField();
		txtRap.setBackground(Color.PINK);
		txtRap.setColumns(10);
		txtRap.setBounds(302, 188, 162, 19);
		contentPane.add(txtRap);
		
		Phim p1 = new Phim("Biệt đội chim cánh cụt", "Hoạt hình", "25/12/2014", "CineBox Hòa Bình");
		Phim p2 = new Phim("Big Heros 6", "Hoạt hình", "10/01/2015", "Galaxy Nguyễn Du");
		Phim p3 = new Phim("Chàng trai năm ấy", "Tình cảm", "15/01/2015", "CineBox Lý Chính Thắng");
		Phim p4 = new Phim("Cuộc chiến chống Pharaon", "Giả sử", "20/01/2015", "Galaxy Nguyễn Trãi");
		Phim p5 = new Phim("Để mai tính", "Hài", "25/01/2015", "Galaxy Quang Trung");
		phim[0] = p1;
		phim[1] = p2;
		phim[2] = p3;
		phim[3] = p4;
		phim[4] = p5;
		JButton btnNext = new JButton("-->");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flag < 4) {
						flag++;
						txtTenPhim.setText(phim[flag].getTenPhim());
						txtRap.setText(phim[flag].getRap());
						txtNgayChieu.setText(phim[flag].getNgayChieu());
						txtTheLoai.setText(phim[flag].getTheLoai());
	
					} else {
						JOptionPane.showMessageDialog(rootPane, 
								"Đã hết phim. Vui lòng nhấn <= để xem các phim phía trước!");
					}
			}
		});
		btnNext.setBounds(497, 85, 75, 57);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("<--");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flag == 0) {
					JOptionPane.showMessageDialog(rootPane, 
							"Đây là phim đầu tiên. Vui lòng nhấn =>để xem các phim phía sau!");
					} else {
						flag--;
						txtTenPhim.setText(phim[flag].getTenPhim());
						txtRap.setText(phim[flag].getRap());
						txtNgayChieu.setText(phim[flag].getNgayChieu());
						txtTheLoai.setText(phim[flag].getTheLoai());
						
					}
			}
		});
		btnBack.setBounds(12, 82, 75, 57);
		contentPane.add(btnBack);
	}
}
