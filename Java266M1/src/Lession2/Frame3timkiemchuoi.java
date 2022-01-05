package Lession2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3timkiemchuoi extends JFrame {

	private JPanel contentPane;
	private JTextField txtchuoi1;
	private JTextField txtchuoi2;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3timkiemchuoi frame = new Frame3timkiemchuoi();
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
	public Frame3timkiemchuoi() {
		setTitle("Tìm kiễm chuỗi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTmKimChui = new JLabel("Tìm kiếm chuỗi");
		lblTmKimChui.setBounds(87, 33, 115, 15);
		contentPane.add(lblTmKimChui);
		
		JLabel lblNhpChui = new JLabel("Nhập chuỗi 1:");
		lblNhpChui.setBounds(54, 76, 111, 15);
		contentPane.add(lblNhpChui);
		
		JLabel lblNhpChui_1 = new JLabel("Nhập chuỗi 2:");
		lblNhpChui_1.setBounds(54, 142, 111, 15);
		contentPane.add(lblNhpChui_1);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setBounds(54, 200, 111, 15);
		contentPane.add(lblKtQu);
		
		txtchuoi1 = new JTextField();
		txtchuoi1.setBounds(213, 74, 210, 19);
		contentPane.add(txtchuoi1);
		txtchuoi1.setColumns(10);
		
		txtchuoi2 = new JTextField();
		txtchuoi2.setBounds(213, 140, 210, 19);
		contentPane.add(txtchuoi2);
		txtchuoi2.setColumns(10);
		
		txtkq = new JTextField();
		txtkq.setBounds(213, 198, 210, 19);
		contentPane.add(txtkq);
		txtkq.setColumns(10);
		
		JButton btnTmKim = new JButton("Tìm kiếm");
		btnTmKim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoi1 = txtchuoi1.getText().trim();
				String chuoi2 = txtchuoi2.getText().trim();
				boolean kq = false;
				if(chuoi1.contains(chuoi2)) {
					kq = true;
				}
				String ketqua = new String();
				if(kq==true) {
					ketqua = "Chuỗi 2 nằm trong chuỗi 1";
				}else ketqua = "Chuỗi 2 không nằm trong chuỗi 1";
				txtkq.setText(ketqua);
			}
		});
		btnTmKim.setBounds(164, 233, 117, 25);
		contentPane.add(btnTmKim);
	}
}
