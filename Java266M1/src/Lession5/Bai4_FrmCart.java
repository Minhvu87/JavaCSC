package Lession5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;


public class Bai4_FrmCart extends JFrame {

	private JPanel contentPane;
	private JTable tblProduct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4_FrmCart frame = new Bai4_FrmCart();
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
	public Bai4_FrmCart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 6, 422, 221);
		contentPane.add(scrollPane);
		
		tblProduct = new JTable();
		tblProduct.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Price"
			}
		));
		tblProduct.getColumnModel().getColumn(0).setPreferredWidth(254);
		tblProduct.getColumnModel().getColumn(1).setPreferredWidth(194);
		scrollPane.setViewportView(tblProduct);
		
		JButton btnNewButton = new JButton("Payment");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(132, 239, 159, 34);
		contentPane.add(btnNewButton);

	}

}
