package Lession7;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class Frame1InsoThucvaSoNguyen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1InsoThucvaSoNguyen frame = new Frame1InsoThucvaSoNguyen();
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
	public Frame1InsoThucvaSoNguyen() {
		setTitle("In mảng chuỗi, số nguyên, số thực");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loại mảng");
		lblNewLabel.setBounds(43, 33, 87, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpMngmiPhn = new JLabel("Nhập mảng(mỗi phần tử cách nhau bằng 1 khoảng trắng)");
		lblNhpMngmiPhn.setBounds(43, 79, 407, 15);
		contentPane.add(lblNhpMngmiPhn);
		
		JLabel lblMngSauKhi = new JLabel("Mảng sau khi sắp xếp");
		lblMngSauKhi.setBounds(43, 189, 407, 15);
		contentPane.add(lblMngSauKhi);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 106, 407, 77);
		contentPane.add(scrollPane);
		
		JTextArea txtNhapMang = new JTextArea();
		scrollPane.setViewportView(txtNhapMang);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(43, 210, 407, 77);
		contentPane.add(scrollPane_1);
		
		JTextArea txtSapXep = new JTextArea();
		scrollPane_1.setViewportView(txtSapXep);
		
		JComboBox cbbMang = new JComboBox();
		cbbMang.setModel(new DefaultComboBoxModel(new String[] {"Chuỗi", "Số nguyên", "Số thực"}));
		cbbMang.setBounds(167, 28, 283, 24);
		contentPane.add(cbbMang);
		
		JButton btnNewButton = new JButton("Sắp xếp tăng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// tạo mảng chuỗi
				String[] mang = txtNhapMang.getText().split(" ");
				// Khai bao List chua ket qua
				ArrayList lst = new ArrayList();
				// Xu ly tao mang tuy theo loai nguoi dung chon
				if(cbbMang.getSelectedIndex()==0) {
					lst.addAll(Arrays.asList(mang));
				}
				else if(cbbMang.getSelectedIndex()==1) {
					for(String i : mang) {
						lst.add(Integer.parseInt(i));
					}
				}
				else {
					for(String i : mang) {
						lst.add(Double.parseDouble(i));
					}
				}
				
				//Sap xep mang
				Collections.sort(lst);
				//In ket qua
				txtSapXep.setText(lst.toString());
			}
		});
		btnNewButton.setBounds(167, 308, 135, 25);
		contentPane.add(btnNewButton);
	}
}
