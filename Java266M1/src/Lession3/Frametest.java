package Lession3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Frametest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frametest frame = new Frametest();
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
	public Frametest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("ex1");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCau = new JMenuItem("Cau 1");
		mnNewMenu.add(mntmCau);
		
		JMenuItem mntmCau_1 = new JMenuItem("Cau 2");
		mnNewMenu.add(mntmCau_1);
		
		JMenu mnNewMenu_1 = new JMenu("ex2");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnEx = new JMenu("ex3");
		menuBar.add(mnEx);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
