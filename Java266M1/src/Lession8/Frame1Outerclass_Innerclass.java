package Lession8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class Frame1Outerclass_Innerclass extends JFrame {

	private JPanel contentPane;
	private JButton btnShow;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1Outerclass_Innerclass frame = new Frame1Outerclass_Innerclass();
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
	
	public Frame1Outerclass_Innerclass() {
		setTitle("Demo lớp lồng cấp-Outer class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		btnShow = new JButton("Inner Class");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(rootPane,"Bạn vừa mới click vào button này");
			}
			
		});
		btnShow.setBounds(143, 117, 131, 43);
		contentPane.add(btnShow);
		
		
	}
	private void btnShowMouseEntered(MouseEvent evt) {
		btnShow.setToolTipText("Bạn đang di chuyển chuột lên button này");
	}
	
}

