package Chapter5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Frame2Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2Login frame = new Frame2Login();
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
	public Frame2Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(55, 71, 95, 15);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(55, 141, 95, 15);
		contentPane.add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(192, 69, 196, 19);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassWord = new JTextField();
		txtPassWord.setColumns(10);
		txtPassWord.setBounds(192, 139, 196, 19);
		contentPane.add(txtPassWord);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QLCSDL qlcsdl = new QLCSDL();
				String username = txtUserName.getText().trim();
				String password = String.valueOf(txtPassWord.getText().trim());
				try {
					User user = qlcsdl.timUser(username, password);
					if(user==null){
						JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
					}else{
						JOptionPane.showMessageDialog(null, "Login is successfully!");
					}
				} catch (SQLException |ClassNotFoundException|HeadlessException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnNewButton.setBounds(165, 201, 117, 25);
		contentPane.add(btnNewButton);
	}
}
