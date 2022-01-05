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

public class Frame2Tinhthuaso extends JFrame {

	private JPanel contentPane;
	private JTextField txtx;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2Tinhthuaso frame = new Frame2Tinhthuaso();
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
	public Frame2Tinhthuaso() {
		setTitle("Tính thừa số");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnhGiaiTha = new JLabel("Tính giai thừa của x");
		lblTnhGiaiTha.setBounds(91, 36, 169, 15);
		contentPane.add(lblTnhGiaiTha);
		
		JLabel lblNhpX = new JLabel("Nhập x");
		lblNhpX.setBounds(53, 91, 70, 15);
		contentPane.add(lblNhpX);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setBounds(53, 146, 70, 15);
		contentPane.add(lblKtQu);
		
		txtx = new JTextField();
		txtx.setBounds(182, 89, 201, 19);
		contentPane.add(txtx);
		txtx.setColumns(10);
		
		txtkq = new JTextField();
		txtkq.setBounds(186, 142, 197, 19);
		contentPane.add(txtkq);
		txtkq.setColumns(10);
		
		JButton btnKtQu = new JButton("Kết quả");
		btnKtQu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x = Integer.parseInt(txtx.getText().trim());
				int ketqua = 1;
				for(int i=1; i <= x; i++) {
					ketqua *= i;
				}
				txtkq.setText(String.valueOf(ketqua));
			}
		});
		btnKtQu.setBounds(81, 207, 117, 25);
		contentPane.add(btnKtQu);
		
		JButton btnNhpLi = new JButton("Nhập lại");
		btnNhpLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtx.setText(null);
				txtkq.setText(null);
			}
		});
		btnNhpLi.setBounds(252, 207, 117, 25);
		contentPane.add(btnNhpLi);
	}
}
