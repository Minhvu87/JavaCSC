package Lession6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame6PhuongTiengiaothong extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuangDuong;
	private JTextField txtThoiGian;
	private JTextField txtNhienLieu;
	private JTextField txtTenXe;
	private JTextField txtHangSanXuat;
	private JTextField txtTrongLuong;
	private JTextField txtSucTai;
	private JTextField txtVTXD;
	private JTextField txtVTND;
	private JTextField txtNLTH;
	private JTextField txtVT;
	private JTextField txtNLTT;
	private ButtonGroup genderGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6PhuongTiengiaothong frame = new Frame6PhuongTiengiaothong();
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
	public Frame6PhuongTiengiaothong() {
		setTitle("Phương tiện giao thông - động cơ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin chung");
		lblNewLabel.setBounds(28, 27, 121, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblQungngkm = new JLabel("Quãng đường(km)");
		lblQungngkm.setBounds(28, 76, 132, 15);
		contentPane.add(lblQungngkm);
		
		JLabel lblTh = new JLabel("Thời gian(giờ)");
		lblTh.setBounds(278, 76, 100, 15);
		contentPane.add(lblTh);
		
		JLabel lblThiGian = new JLabel("Nhiên liệu (lít)");
		lblThiGian.setBounds(509, 76, 100, 15);
		contentPane.add(lblThiGian);
		
		txtQuangDuong = new JTextField();
		txtQuangDuong.setBounds(164, 74, 104, 19);
		contentPane.add(txtQuangDuong);
		txtQuangDuong.setColumns(10);
		
		txtThoiGian = new JTextField();
		txtThoiGian.setColumns(10);
		txtThoiGian.setBounds(382, 74, 109, 19);
		contentPane.add(txtThoiGian);
		
		txtNhienLieu = new JTextField();
		txtNhienLieu.setColumns(10);
		txtNhienLieu.setBounds(627, 74, 111, 19);
		contentPane.add(txtNhienLieu);
		
		JRadioButton rdbtXeHoi = new JRadioButton("Xe hơi");
		rdbtXeHoi.setBounds(71, 99, 149, 23);
		contentPane.add(rdbtXeHoi);
		genderGroup.add(rdbtXeHoi);
		
		JRadioButton rdbtTauThuy = new JRadioButton("Tàu thủy");
		rdbtTauThuy.setBounds(371, 99, 149, 23);
		contentPane.add(rdbtTauThuy);
		genderGroup.add(rdbtTauThuy);
		
		JLabel lblTnXe = new JLabel("Tên xe");
		lblTnXe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnXe.setBounds(28, 136, 104, 15);
		contentPane.add(lblTnXe);
		
		JLabel lblHngSnXut = new JLabel("Hãng sản xuất");
		lblHngSnXut.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHngSnXut.setBounds(28, 179, 104, 15);
		contentPane.add(lblHngSnXut);
		
		txtTenXe = new JTextField();
		txtTenXe.setBounds(164, 132, 104, 19);
		contentPane.add(txtTenXe);
		txtTenXe.setColumns(10);
		
		txtHangSanXuat = new JTextField();
		txtHangSanXuat.setColumns(10);
		txtHangSanXuat.setBounds(164, 177, 104, 19);
		contentPane.add(txtHangSanXuat);
		
		JLabel lblTrngLng = new JLabel("Trọng lượng(kg)");
		lblTrngLng.setBounds(381, 136, 121, 15);
		contentPane.add(lblTrngLng);
		
		JLabel lblScTi = new JLabel("Sức tải(kg)");
		lblScTi.setBounds(381, 179, 121, 15);
		contentPane.add(lblScTi);
		
		JLabel lblV = new JLabel("Vận tốc nước xuôi dòng(km/h)");
		lblV.setBounds(381, 236, 221, 15);
		contentPane.add(lblV);
		
		JLabel lblVnTcNc = new JLabel("Vận tốc nước ngược dòng(km/h)");
		lblVnTcNc.setBounds(381, 284, 221, 15);
		contentPane.add(lblVnTcNc);
		
		JLabel lblNhinLiuTiu = new JLabel("Nhiên liệu tiêu hao(lít)");
		lblNhinLiuTiu.setBounds(381, 336, 221, 15);
		contentPane.add(lblNhinLiuTiu);
		
		txtTrongLuong = new JTextField();
		txtTrongLuong.setBounds(624, 134, 114, 19);
		contentPane.add(txtTrongLuong);
		txtTrongLuong.setColumns(10);
		
		txtSucTai = new JTextField();
		txtSucTai.setColumns(10);
		txtSucTai.setBounds(624, 177, 114, 19);
		contentPane.add(txtSucTai);
		
		txtVTXD = new JTextField();
		txtVTXD.setColumns(10);
		txtVTXD.setBounds(624, 234, 114, 19);
		contentPane.add(txtVTXD);
		
		txtVTND = new JTextField();
		txtVTND.setColumns(10);
		txtVTND.setBounds(624, 282, 114, 19);
		contentPane.add(txtVTND);
		
		txtNLTH = new JTextField();
		txtNLTH.setColumns(10);
		txtNLTH.setBounds(624, 334, 114, 19);
		contentPane.add(txtNLTH);
		
		JLabel lblVnTc = new JLabel("Vận tốc(km/h)");
		lblVnTc.setBounds(39, 441, 110, 15);
		contentPane.add(lblVnTc);
		
		JLabel lblkmh = new JLabel("Nhiên liệu tiêu thụ(km/lít)");
		lblkmh.setBounds(383, 441, 196, 15);
		contentPane.add(lblkmh);
		
		txtVT = new JTextField();
		txtVT.setBounds(164, 439, 114, 19);
		contentPane.add(txtVT);
		txtVT.setColumns(10);
		
		txtNLTT = new JTextField();
		txtNLTT.setColumns(10);
		txtNLTT.setBounds(627, 439, 114, 19);
		contentPane.add(txtNLTT);
		
		JButton btnNewButton = new JButton("Tính vận tốc - Tiêu thụ nguyên liệu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double QuangDuong = Double.parseDouble(txtQuangDuong.getText().trim());
				Double ThoiGian = Double.parseDouble(txtThoiGian.getText().trim());
				Double SoLit = Double.parseDouble(txtNhienLieu.getText().trim());
				if(rdbtXeHoi.isSelected()) {
					String TenXe = txtTenXe.getText().trim();
					String HangSanXuat = txtHangSanXuat.getText().trim();
					XeHoi xehoi = new XeHoi(TenXe, HangSanXuat);
					txtVT.setText(String.valueOf(xehoi.tinhVanToc(QuangDuong, ThoiGian)));
					txtNLTT.setText(String.valueOf(xehoi.tinhTieuThuNhienLieu(QuangDuong, SoLit)));
				}
				if(rdbtTauThuy.isSelected()) {
					Double TrongLuong = Double.parseDouble(txtTrongLuong.getText().trim());
					Integer SucTai = Integer.parseInt(txtSucTai.getText().trim());
					Double VTXD = Double.parseDouble(txtVTXD.getText().trim());
					Double VTND = Double.parseDouble(txtVTND.getText().trim());
					Double NLTH = Double.parseDouble(txtNLTH.getText().trim());
					TauThuy tauthuy = new TauThuy(TrongLuong, SucTai, VTXD, VTND,NLTH);
					txtVT.setText(String.valueOf(tauthuy.tinhVanToc(QuangDuong, ThoiGian)));
					txtNLTT.setText(String.valueOf(tauthuy.tinhTieuThuNhienLieu(QuangDuong, SoLit)));
				}
			}
		});
		btnNewButton.setBounds(208, 377, 283, 25);
		contentPane.add(btnNewButton);
	}
}
