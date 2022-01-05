package Lession1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameHello extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameHello frame = new FrameHello();
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
	public FrameHello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập Họ và Tên: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(57, 60, 118, 26);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(197, 67, 211, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(57, 113, 381, 15);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Xuất Lời Chào");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtName.getText();
				// Tao loi chao
				String Hello = "Xin Chào bạn "+ name+" đến với chương trình Java";
				lblNewLabel_1.setText(Hello);
			}
		});
		btnNewButton.setBounds(165, 171, 138, 25);
		contentPane.add(btnNewButton);
	}
}
