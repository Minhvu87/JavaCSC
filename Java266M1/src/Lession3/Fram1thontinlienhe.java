package Lession3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Label;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fram1thontinlienhe extends JFrame {

	private JPanel contentPane;
	private JTextField txthoten;
	private JTextField txtdtdd;
	private JTextField txthinhanh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fram1thontinlienhe frame = new Fram1thontinlienhe();
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
	public Fram1thontinlienhe() {
		setTitle("Thông tin liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThngTinLin = new JLabel("Thông tin liên hệ");
		lblThngTinLin.setBounds(100, 27, 163, 15);
		contentPane.add(lblThngTinLin);
		
		JLabel lblHTn = new JLabel("Họ tên");
		lblHTn.setBounds(50, 54, 70, 15);
		contentPane.add(lblHTn);
		
		JLabel lblDtd = new JLabel("DTDĐ");
		lblDtd.setBounds(50, 106, 70, 15);
		contentPane.add(lblDtd);
		
		JLabel lblHnhnh = new JLabel("Hình ảnh");
		lblHnhnh.setBounds(50, 160, 70, 15);
		contentPane.add(lblHnhnh);
		
		txthoten = new JTextField();
		txthoten.setBounds(169, 52, 240, 19);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		txtdtdd = new JTextField();
		txtdtdd.setColumns(10);
		txtdtdd.setBounds(169, 104, 240, 19);
		contentPane.add(txtdtdd);
		
		txthinhanh = new JTextField();
		txthinhanh.setColumns(10);
		txthinhanh.setBounds(169, 158, 240, 19);
		contentPane.add(txthinhanh);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 227, 363, 231);
		contentPane.add(separator);
		
		JLabel lblHTn_1 = new JLabel("Họ tên");
		lblHTn_1.setBounds(50, 247, 70, 15);
		contentPane.add(lblHTn_1);
		
		JLabel lbltd = new JLabel("ĐTDĐ");
		lbltd.setBounds(50, 297, 70, 15);
		contentPane.add(lbltd);
		
		JLabel lblHnhnh_1 = new JLabel("Hình ảnh");
		lblHnhnh_1.setBounds(50, 348, 70, 15);
		contentPane.add(lblHnhnh_1);
		
		JLabel lblhienthihoten = new JLabel("");
		lblhienthihoten.setBounds(169, 247, 210, 15);
		contentPane.add(lblhienthihoten);
		
		JLabel lblhienthidtdd = new JLabel("");
		lblhienthidtdd.setBounds(169, 297, 240, 15);
		contentPane.add(lblhienthidtdd);
		
		JLabel lblhienthihinhanh = new JLabel("");
		lblhienthihinhanh.setBounds(169, 348, 210, 110);
		contentPane.add(lblhienthihinhanh);
		
		JButton btnHinTh = new JButton("Hiển thị");
		btnHinTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Lay thong tin tu ban phim
				String name = txthoten.getText().trim();
				String phone = txtdtdd.getText().trim();
				String image = txthinhanh.getText().trim();
				ImageIcon icon = new ImageIcon(image);
				//Xuat ket qua
				lblhienthihoten.setText(name);
				lblhienthidtdd.setText(phone);
				lblhienthihinhanh.setIcon(icon);
			}
		});
		btnHinTh.setBounds(169, 189, 117, 25);
		contentPane.add(btnHinTh);
	}
}
