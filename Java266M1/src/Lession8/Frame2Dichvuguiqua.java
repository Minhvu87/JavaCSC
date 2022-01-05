package Lession8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2Dichvuguiqua extends JFrame {

	private JPanel contentPane;
	private JTextField txthdhq;
	private JTextField txtmausac;
	private JTextField txttenqua;
	private JTextField txttrongluong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2Dichvuguiqua frame = new Frame2Dichvuguiqua();
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
	public Frame2Dichvuguiqua() {
		setTitle("Dịch vụ gửi quà");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin hộp quà");
		lblNewLabel.setBounds(39, 28, 138, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblHnhDngHp = new JLabel("Hình dáng hộp quà");
		lblHnhDngHp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHnhDngHp.setBounds(64, 74, 138, 15);
		contentPane.add(lblHnhDngHp);
		
		JLabel lblMuSc = new JLabel("Màu sắc");
		lblMuSc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMuSc.setBounds(64, 112, 138, 15);
		contentPane.add(lblMuSc);
		
		JLabel lblThngTinQu = new JLabel("Thông tin quà");
		lblThngTinQu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThngTinQu.setBounds(64, 162, 138, 15);
		contentPane.add(lblThngTinQu);
		
		JLabel lblTnQu = new JLabel("Tên quà");
		lblTnQu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTnQu.setBounds(64, 208, 138, 15);
		contentPane.add(lblTnQu);
		
		JLabel lblTrngLng = new JLabel("Trọng lượng");
		lblTrngLng.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTrngLng.setBounds(64, 256, 138, 15);
		contentPane.add(lblTrngLng);
		
		JLabel lblThngTinGi = new JLabel("Thông tin gửi quà");
		lblThngTinGi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThngTinGi.setBounds(64, 341, 138, 15);
		contentPane.add(lblThngTinGi);
		
		txthdhq = new JTextField();
		txthdhq.setBounds(265, 72, 195, 19);
		contentPane.add(txthdhq);
		txthdhq.setColumns(10);
		
		txtmausac = new JTextField();
		txtmausac.setColumns(10);
		txtmausac.setBounds(265, 110, 195, 19);
		contentPane.add(txtmausac);
		
		txttenqua = new JTextField();
		txttenqua.setColumns(10);
		txttenqua.setBounds(265, 206, 195, 19);
		contentPane.add(txttenqua);
		
		txttrongluong = new JTextField();
		txttrongluong.setColumns(10);
		txttrongluong.setBounds(265, 254, 195, 19);
		contentPane.add(txttrongluong);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(265, 341, 195, 116);
		contentPane.add(scrollPane);
		
		JTextArea txtthongtinguiqua = new JTextArea();
		scrollPane.setViewportView(txtthongtinguiqua);
		
		JButton btnNewButton = new JButton("Gửi quà");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GiftBox gb = new GiftBox(txthdhq.getText().trim(), txtmausac.getText().trim());
				GiftBox.Gift g = gb.new Gift(txttenqua.getText().trim(),
				Double.parseDouble(txttrongluong.getText().trim()));
				String thongTin = "Hộp quà: ";
				thongTin += "Có hình: " + gb.hinhDang + "\nvà giấy bao màu: " + gb.mauSac +
				",\nphí làm hộp " + String.valueOf(gb.phiLamHop) + "\n";
				thongTin += "Bên trong đựng quà: \n" + g.ten + "\n có trọng lượng " +
				String.valueOf(g.trongLuong) + "g\n";
				thongTin += "Tiền gửi quà: " + String.valueOf(g.tinhTienGui());
				txtthongtinguiqua.setText(thongTin);
			}
		});
		btnNewButton.setBounds(265, 297, 195, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("g");
		lblNewLabel_1.setBounds(469, 256, 31, 15);
		contentPane.add(lblNewLabel_1);
	}
}
