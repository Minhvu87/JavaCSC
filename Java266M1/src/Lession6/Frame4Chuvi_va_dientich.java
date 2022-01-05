package Lession6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame4Chuvi_va_dientich extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txtRadius;
	private JTextField txtChuVi;
	private JTextField txtDienTich;
	private JTextField txtChieudai;
	private JTextField txtChieurong;
	private JTextField txtChuVi2;
	private JTextField txtDienTich2;
	private JTextField txtCanh;
	private JTextField txtChuVi3;
	private JTextField txtDienTich3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4Chuvi_va_dientich frame = new Frame4Chuvi_va_dientich();
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
	public Frame4Chuvi_va_dientich() {
		setTitle("Abstract Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane .setBounds(0, 0, 442, 273);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Hinh Tròn", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblBan = new JLabel("Bán kính");
		lblBan.setBounds(22, 46, 78, 15);
		panel.add(lblBan);
		
		JLabel lblChuVi = new JLabel("Chu vi");
		lblChuVi.setBounds(22, 103, 70, 15);
		panel.add(lblChuVi);
		
		JLabel lblDinTch = new JLabel("Diện tích");
		lblDinTch.setBounds(22, 157, 70, 15);
		panel.add(lblDinTch);
		
		txtRadius = new JTextField();
		txtRadius.setBounds(146, 44, 114, 19);
		panel.add(txtRadius);
		txtRadius.setColumns(10);
		
		txtChuVi = new JTextField();
		txtChuVi.setColumns(10);
		txtChuVi.setBounds(146, 101, 114, 19);
		panel.add(txtChuVi);
		
		txtDienTich = new JTextField();
		txtDienTich.setColumns(10);
		txtDienTich.setBounds(146, 155, 114, 19);
		panel.add(txtDienTich);
		
		JButton btnNewButton = new JButton("Tính chu vi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double r = Double.parseDouble(txtRadius.getText().trim());
				Circle tron = new Circle(r);
				txtChuVi.setText(String.valueOf(tron.perimeter()));
			}
		});
		btnNewButton.setBounds(296, 93, 129, 25);
		panel.add(btnNewButton);
		
		JButton btnTnhDinTch = new JButton("Tính diện tích");
		btnTnhDinTch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double r = Double.parseDouble(txtRadius.getText().trim());
				Circle tron = new Circle(r);
				txtDienTich.setText(String.valueOf(tron.area()));
			}
		});
		btnTnhDinTch.setBounds(296, 152, 129, 25);
		panel.add(btnTnhDinTch);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Hình chữ nhật", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblChiuDi = new JLabel("Chiều dài");
		lblChiuDi.setBounds(26, 22, 93, 15);
		panel_1.add(lblChiuDi);
		
		JLabel lblChiuRng = new JLabel("Chiều rộng");
		lblChiuRng.setBounds(26, 75, 93, 15);
		panel_1.add(lblChiuRng);
		
		JLabel lblChuVi_1 = new JLabel("Chu vi");
		lblChuVi_1.setBounds(26, 134, 93, 15);
		panel_1.add(lblChuVi_1);
		
		JLabel lblDinTch_1 = new JLabel("Diện tích");
		lblDinTch_1.setBounds(26, 187, 93, 15);
		panel_1.add(lblDinTch_1);
		
		txtChieudai = new JTextField();
		txtChieudai.setBounds(162, 20, 114, 19);
		panel_1.add(txtChieudai);
		txtChieudai.setColumns(10);
		
		txtChieurong = new JTextField();
		txtChieurong.setColumns(10);
		txtChieurong.setBounds(162, 73, 114, 19);
		panel_1.add(txtChieurong);
		
		txtChuVi2 = new JTextField();
		txtChuVi2.setColumns(10);
		txtChuVi2.setBounds(162, 132, 114, 19);
		panel_1.add(txtChuVi2);
		
		txtDienTich2 = new JTextField();
		txtDienTich2.setColumns(10);
		txtDienTich2.setBounds(162, 185, 114, 19);
		panel_1.add(txtDienTich2);
		
		JButton btnTnhChuVi = new JButton("Tính chu vi");
		btnTnhChuVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double chieudai = Double.parseDouble(txtChieudai.getText().trim());
				Double chieurong = Double.parseDouble(txtChieurong.getText().trim());
				Rectangle hcn = new Rectangle(chieudai, chieurong);
				txtChuVi2.setText(String.valueOf(hcn.perimeter()));
			}
		});
		btnTnhChuVi.setBounds(293, 124, 132, 25);
		panel_1.add(btnTnhChuVi);
		
		JButton btnTnhDinTch_1 = new JButton("Tính diện tích");
		btnTnhDinTch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double chieudai = Double.parseDouble(txtChieudai.getText().trim());
				Double chieurong = Double.parseDouble(txtChieurong.getText().trim());
				Rectangle hcn = new Rectangle(chieudai, chieurong);
				txtDienTich2.setText(String.valueOf(hcn.area()));
			}
		});
		btnTnhDinTch_1.setBounds(293, 182, 132, 25);
		panel_1.add(btnTnhDinTch_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hình vuông", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblCnh = new JLabel("Cạnh");
		lblCnh.setBounds(27, 36, 70, 15);
		panel_2.add(lblCnh);
		
		JLabel lblChuVi_2 = new JLabel("Chu vi");
		lblChuVi_2.setBounds(27, 93, 70, 15);
		panel_2.add(lblChuVi_2);
		
		JLabel lblDinTch_2 = new JLabel("Diện tích");
		lblDinTch_2.setBounds(27, 150, 70, 15);
		panel_2.add(lblDinTch_2);
		
		txtCanh = new JTextField();
		txtCanh.setBounds(155, 34, 114, 19);
		panel_2.add(txtCanh);
		txtCanh.setColumns(10);
		
		txtChuVi3 = new JTextField();
		txtChuVi3.setColumns(10);
		txtChuVi3.setBounds(155, 91, 114, 19);
		panel_2.add(txtChuVi3);
		
		txtDienTich3 = new JTextField();
		txtDienTich3.setColumns(10);
		txtDienTich3.setBounds(155, 146, 114, 19);
		panel_2.add(txtDienTich3);
		
		JButton btnTnhChuVi_1 = new JButton("Tính chu vi");
		btnTnhChuVi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double canh = Double.parseDouble(txtCanh.getText().trim());
				Square hv = new Square(canh);
				txtChuVi3.setText(String.valueOf(hv.perimeter()));
			}
		});
		btnTnhChuVi_1.setBounds(293, 88, 132, 25);
		panel_2.add(btnTnhChuVi_1);
		
		JButton btnTnhChuVi_1_1 = new JButton("Tính diện tích");
		btnTnhChuVi_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double canh = Double.parseDouble(txtCanh.getText().trim());
				Square hv = new Square(canh);
				txtDienTich3.setText(String.valueOf(hv.area()));
			}
		});
		btnTnhChuVi_1_1.setBounds(293, 145, 132, 25);
		panel_2.add(btnTnhChuVi_1_1);


	}
}
