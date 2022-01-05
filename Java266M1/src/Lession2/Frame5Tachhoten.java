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

import java.util.*;

public class Frame5Tachhoten extends JFrame {

	private JPanel contentPane;
	private JTextField txthoten;
	private JTextField txtho;
	private JTextField txttendem;
	private JTextField txtten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5Tachhoten frame = new Frame5Tachhoten();
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
	public Frame5Tachhoten() {
		setTitle("Tách họ tên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHVTn = new JLabel("Họ và tên");
		lblHVTn.setBounds(59, 52, 70, 15);
		contentPane.add(lblHVTn);
		
		JLabel lblH = new JLabel("Họ");
		lblH.setBounds(59, 98, 70, 15);
		contentPane.add(lblH);
		
		JLabel lblTnm = new JLabel("Tên đệm");
		lblTnm.setBounds(59, 155, 70, 15);
		contentPane.add(lblTnm);
		
		JLabel lblTn = new JLabel("Tên");
		lblTn.setBounds(59, 214, 70, 15);
		contentPane.add(lblTn);
		
		txthoten = new JTextField();
		txthoten.setBounds(196, 50, 184, 19);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		txtho = new JTextField();
		txtho.setColumns(10);
		txtho.setBounds(196, 96, 184, 19);
		contentPane.add(txtho);
		
		txttendem = new JTextField();
		txttendem.setColumns(10);
		txttendem.setBounds(196, 153, 184, 19);
		contentPane.add(txttendem);
		
		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBounds(196, 212, 184, 19);
		contentPane.add(txtten);
		
		JButton btnTchHTn = new JButton("Tách họ tên");
		btnTchHTn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hoten = txthoten.getText().trim();
				StringTokenizer st = new StringTokenizer(hoten);
				int count = st.countTokens();
				switch(count) {
					case 2:
						txtho.setText(st.nextToken());
						txtten.setText(st.nextToken());
					break;
					case 3:
						txtho.setText(st.nextToken());
						txttendem.setText(st.nextToken());
						txtten.setText(st.nextToken());
					break;
					case 4:
						txtho.setText(st.nextToken());
						txttendem.setText(st.nextToken()+" "+st.nextToken());
						txtten.setText(st.nextToken());
					break;
					case 5:
						txtho.setText(st.nextToken());
						txttendem.setText(st.nextToken()+" "+st.nextToken()+" "+st.nextToken());
						txtten.setText(st.nextToken());
					break;
				}
			}
		});
		btnTchHTn.setBounds(152, 283, 117, 25);
		contentPane.add(btnTchHTn);
	}

}
