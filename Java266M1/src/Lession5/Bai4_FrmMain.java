package Lession5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Bai4_FrmMain extends JFrame {

	private JPanel contentPane;

	private boolean[] arrSelect = new boolean[4];
	private Bai4_Product[] arrProduct = new Bai4_Product[4];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4_FrmMain frame = new Bai4_FrmMain();
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
	public Bai4_FrmMain() {
		setTitle("Click to buy");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblProduct1 = new JLabel("");
		lblProduct1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selectOrNot(1);
			}
		});
		lblProduct1.setIcon(new ImageIcon(Bai4_FrmMain.class.getResource("/resources1/image/Whey-stand.jpg")));
		lblProduct1.setBounds(10, 11, 200, 200);
		contentPane.add(lblProduct1);
		
		JLabel lblProduct2 = new JLabel("");
		lblProduct2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectOrNot(2);
			}
		});
		lblProduct2.setIcon(new ImageIcon(Bai4_FrmMain.class.getResource("/resources1/image/anabolic-whey.jpg")));
		lblProduct2.setBounds(224, 11, 200, 200);
		contentPane.add(lblProduct2);
		
		JLabel lblProduct3 = new JLabel("");
		lblProduct3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectOrNot(3);
			}
		});
		lblProduct3.setIcon(new ImageIcon(Bai4_FrmMain.class.getResource("/resources1/image/Hydro-Whey-1590-.jpg")));
		lblProduct3.setBounds(10, 226, 200, 200);
		contentPane.add(lblProduct3);
		
		JLabel lblProduct4 = new JLabel("");
		lblProduct4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectOrNot(4);
			}
		});
		lblProduct4.setIcon(new ImageIcon(Bai4_FrmMain.class.getResource("/resources1/image/bsn-syntha-6-whey.jpg")));
		lblProduct4.setBounds(224, 226, 200, 200);
		contentPane.add(lblProduct4);
		
		JButton btnNewButton = new JButton("Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addCart();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setIcon(new ImageIcon(Bai4_FrmMain.class.getResource("/resources1/image/Cart-icon.png")));
		btnNewButton.setBounds(10, 450, 414, 39);
		contentPane.add(btnNewButton);
		
		// Khoi tao danh sach san pham
		arrProduct[0] = new Bai4_Product("Gold Standard Whey" , 70000);
		arrProduct[1] = new Bai4_Product("Anabolic whey" , 130000);
		arrProduct[2] = new Bai4_Product("Platinum Hydro Whey" , 150000);
		arrProduct[3] = new Bai4_Product("Sytha-6" , 200000);
	}
	
	protected void addCart() {
		
		// Neu nhu khong co san pham duoc chon -> dua ra thong bao
		if (!arrSelect[0] && !arrSelect[1] && !arrSelect[2] && !arrSelect[3]) {
			JOptionPane.showMessageDialog(contentPane, "Please select a product.");
			return;
		}
		
		// Co chon san pham
		StringBuilder message = new StringBuilder("Do you want to buy");
		for (int idx = 0; idx < 4; idx++) {
			if (arrSelect[idx]) {
				message.append(", " + arrProduct[idx].getName());
			}
		}
		
		if (JOptionPane.showConfirmDialog(contentPane, message.toString().replaceFirst(",", ""), "Confirm", 
				JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
			// Mo man hinh hien thi danh sach da chon
			Bai4_FrmCart frm = new Bai4_FrmCart();
			frm.setVisible(true);
		}
		
	}

	private void selectOrNot(int no) {
		arrSelect[no - 1] = !arrSelect[no - 1]; 

	}

}
