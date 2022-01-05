package Lession3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Frame4_He_thong_bai_tap_menubar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4_He_thong_bai_tap_menubar frame = new Frame4_He_thong_bai_tap_menubar();
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
	public Frame4_He_thong_bai_tap_menubar() {
		setTitle("Hệ thống bài tập module 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnBi = new JMenu("Bài 1");
		menuBar.add(mnBi);
		
		JMenu mnBi_1 = new JMenu("Bài 2");
		menuBar.add(mnBi_1);
		
		JMenu mnBi_2 = new JMenu("Bài 3");
		menuBar.add(mnBi_2);
		
		JMenu mnBi_3 = new JMenu("Bài 4");
		menuBar.add(mnBi_3);
		
		JMenu mnBi_4 = new JMenu("Bài 5");
		menuBar.add(mnBi_4);
		
		JMenu mnBi_5 = new JMenu("Bài 6");
		menuBar.add(mnBi_5);
		
		JMenu mnBi_6 = new JMenu("Bài 7");
		menuBar.add(mnBi_6);
		
		JMenu mnBi_7 = new JMenu("Bài 8");
		menuBar.add(mnBi_7);
		
		JMenu mnBi_8 = new JMenu("Bài 9");
		menuBar.add(mnBi_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
