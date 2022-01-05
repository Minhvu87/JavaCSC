package Lession3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame7_Choose_Your_Color extends JFrame {

/**
	 * 
	 */
	
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JLabel lblImage;
	private JPanel pnColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame7_Choose_Your_Color frame = new Frame7_Choose_Your_Color();
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
	public Frame7_Choose_Your_Color() {
		setTitle("Choose your color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChooser = new JButton("Choose Color");
		btnChooser.setBounds(127, 0, 138, 33);
		contentPane.add(btnChooser);
		btnChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = new Color(0);//default color gray
				c = JColorChooser.showDialog(null, "Pick a color", c);
				btnChooser.setForeground(c);
				pnColor.setBackground(c);
				layeredPane.add(pnColor, 0);
			}
		});
		btnChooser.setIcon(new ImageIcon(Frame7_Choose_Your_Color.class.getResource("/resources1/image/color-chooser-icon.png")));
		
		lblImage = new JLabel("");
		lblImage.setBounds(0, 0, 399, 268);
		contentPane.add(lblImage);
		lblImage.setIcon(new ImageIcon(Frame7_Choose_Your_Color.class.getResource("/resources1/image/flower.png")));
		
		pnColor = new JPanel();
		pnColor.setBounds(0, 0, 388, 263);
		contentPane.add(pnColor);
		pnColor.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 260, 434, -256);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
	}
}
