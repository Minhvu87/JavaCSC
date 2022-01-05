package Lession3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Frame2_Them_moi_lien_he extends JFrame {

	private JPanel contentPane;
	private JTextField txthoten;
	private JTextField txtdtdd;
	private JTextField txthinhanh;
	private JLabel lblhinhanh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2_Them_moi_lien_he frame = new Frame2_Them_moi_lien_he();
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
	public Frame2_Them_moi_lien_he() {
		setTitle("Thêm mới liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thêm mới liên hệ");
		lblNewLabel.setBounds(65, 27, 136, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblHVTn = new JLabel("Họ tên");
		lblHVTn.setBounds(50, 63, 84, 15);
		contentPane.add(lblHVTn);
		
		JLabel lblDtd = new JLabel("DTDĐ:");
		lblDtd.setBounds(50, 109, 84, 15);
		contentPane.add(lblDtd);
		
		JLabel lblHnhnh = new JLabel("Hình ảnh:");
		lblHnhnh.setBounds(50, 156, 84, 15);
		contentPane.add(lblHnhnh);
		
		txthoten = new JTextField();
		txthoten.setBounds(176, 61, 181, 19);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		txtdtdd = new JTextField();
		txtdtdd.setBounds(176, 107, 98, 19);
		contentPane.add(txtdtdd);
		txtdtdd.setColumns(10);
		
		txthinhanh = new JTextField();
		txthinhanh.setColumns(10);
		txthinhanh.setBounds(176, 154, 150, 19);
		contentPane.add(txthinhanh);
		
		lblhinhanh = new JLabel("");
		lblhinhanh.setEnabled(false);
		lblhinhanh.setBounds(390, 63, 116, 161);
		contentPane.add(lblhinhanh);
		
		JButton btnThmLinH = new JButton("Thêm liên hệ");
		btnThmLinH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnThmLinH.setBounds(157, 199, 136, 25);
		contentPane.add(btnThmLinH);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Hiển thị JFileChooser để chọn hình
				JFileChooser fcs = new JFileChooser();
				fcs.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if (fcs.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File fileSelected = fcs.getSelectedFile();
					txthinhanh.setText(fileSelected.getAbsolutePath());
					
					ImageIcon icon = new ImageIcon(fileSelected.getAbsolutePath());
					lblhinhanh.setIcon(icon);
					lblhinhanh.setBounds(392, 11, 134, 163);
				};
				
			}
		});
		btnNewButton.setBounds(338, 151, 33, 25);
		contentPane.add(btnNewButton);
		
		
	}
}
