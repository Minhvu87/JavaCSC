package Chapter5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class Frame3Themlienhe extends JFrame {

	private JPanel contentPane;
	private JTextField txtTen;
	private JTextField txtDtdd;
	private JTextField txtHinhAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3Themlienhe frame = new Frame3Themlienhe();
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
	public Frame3Themlienhe() {
		setTitle("Thêm mới liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThmMiLin = new JLabel("Thêm mới liên hệ");
		lblThmMiLin.setBounds(45, 23, 176, 15);
		contentPane.add(lblThmMiLin);
		
		JLabel lblHTn = new JLabel("Họ tên");
		lblHTn.setBounds(45, 66, 70, 15);
		contentPane.add(lblHTn);
		
		JLabel lblDtdd = new JLabel("ĐTDĐ");
		lblDtdd.setBounds(45, 130, 70, 15);
		contentPane.add(lblDtdd);
		
		JLabel lblHnhnh = new JLabel("Hình ảnh");
		lblHnhnh.setBounds(45, 200, 70, 19);
		contentPane.add(lblHnhnh);
		
		txtTen = new JTextField();
		txtTen.setBounds(167, 66, 181, 19);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtDtdd = new JTextField();
		txtDtdd.setColumns(10);
		txtDtdd.setBounds(167, 128, 181, 19);
		contentPane.add(txtDtdd);
		
		txtHinhAnh = new JTextField();
		txtHinhAnh.setColumns(10);
		txtHinhAnh.setBounds(167, 200, 181, 19);
		contentPane.add(txtHinhAnh);
		
		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setBounds(438, 55, 180, 164);
		contentPane.add(lblHinhAnh);
		
		JButton btnHinhAnh = new JButton("...");
		btnHinhAnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Hiển thị JFileChooser để chọn hình
				JFileChooser fcs = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				fcs.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				if (fcs.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File fileSelected = fcs.getSelectedFile();
					txtHinhAnh.setText(fileSelected.getAbsolutePath());
					
					ImageIcon icon = new ImageIcon(fileSelected.getAbsolutePath());
					lblHinhAnh.setIcon(icon);
					lblHinhAnh.setBounds(300, 62, 138, 180);
				};
			}
		});
		btnHinhAnh.setBounds(360, 197, 41, 25);
		contentPane.add(btnHinhAnh);
		
		JButton btnThem = new JButton("Thêm mới");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				String hoten = txtTen.getText().trim();
				String dtdd = txtDtdd.getText().trim();
				File f = new File(txtHinhAnh.getText());
				String hinhAnh = f.getName();
				QLCSDL qlcsdl = new QLCSDL();
				LienHe c = new LienHe(hoten, dtdd, hinhAnh);
				if (qlcsdl.themLienHe(c)) {
					JOptionPane.showMessageDialog(rootPane, "Đã thêm liên hệ!");
				} else {
					JOptionPane.showMessageDialog(rootPane, "Không thêm được liên hệ!");
				  	}
				}catch (SQLException | ClassNotFoundException | UnsupportedEncodingException ex) {
					Logger.getLogger(Frame3Themlienhe.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		btnThem.setBounds(167, 231, 117, 25);
		contentPane.add(btnThem);
	}
}
