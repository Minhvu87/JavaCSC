package Lession1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameTinhTien extends JFrame {

	private JPanel contentPane;
	private JTextField txtSL;
	private JTextField txtDG;
	private JTextField txtTT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTinhTien frame = new FrameTinhTien();
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
	public FrameTinhTien() {
		setTitle("Tính Giá Trị Hóa Đơn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnhGiTr = new JLabel("Tính giá trị hóa đơn");
		lblTnhGiTr.setBounds(100, 33, 170, 15);
		contentPane.add(lblTnhGiTr);
		
		JLabel lblSLng = new JLabel("Số Lượng:");
		lblSLng.setBounds(61, 74, 92, 15);
		contentPane.add(lblSLng);
		
		JLabel lblnGi = new JLabel("Đơn Giá:");
		lblnGi.setBounds(61, 123, 92, 15);
		contentPane.add(lblnGi);
		
		JLabel lblThnhTin = new JLabel("Thành tiền:");
		lblThnhTin.setBounds(61, 183, 92, 15);
		contentPane.add(lblThnhTin);
		
		txtSL = new JTextField();
		txtSL.setBounds(219, 72, 114, 19);
		contentPane.add(txtSL);
		txtSL.setColumns(10);
		
		txtDG = new JTextField();
		txtDG.setBounds(219, 121, 114, 19);
		contentPane.add(txtDG);
		txtDG.setColumns(10);
		
		txtTT = new JTextField();
		txtTT.setBounds(219, 181, 114, 19);
		contentPane.add(txtTT);
		txtTT.setColumns(10);
		
		JLabel lblvn = new JLabel("(VNĐ)");
		lblvn.setBounds(351, 123, 70, 15);
		contentPane.add(lblvn);
		
		JLabel lblVnd = new JLabel("(VNĐ)");
		lblVnd.setBounds(351, 183, 70, 15);
		contentPane.add(lblVnd);
		
		JButton btnTinh = new JButton("Tính Tiền");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Lay gia tri So luong, Don Gia
				String SL = txtSL.getText().trim();
				String DG = txtDG.getText().trim();
				
				Double so_luong = Double.valueOf(SL);
				Double don_gia = Double.valueOf(DG);
				
				//Tinh tien
				Double thanh_tien = so_luong * don_gia;
				txtTT.setText(String.valueOf(thanh_tien));
			}
		});
		btnTinh.setBounds(168, 233, 117, 25);
		contentPane.add(btnTinh);
	}
}
