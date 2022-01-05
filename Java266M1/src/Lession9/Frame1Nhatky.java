package Lession9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class Frame1Nhatky extends JFrame {

	private JPanel contentPane;
	private JTextField txtNgay;
	private JTextArea txtaNoiDung;
	private String ngay;
	private String noiDung;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1Nhatky frame = new Frame1Nhatky();
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
	
	public Frame1Nhatky() {
		//initComponents();
		
//		ngay = txtNgay.getText();
//		noiDung = txtaNoiDung.getText();
		
		


		setTitle("Nhật kí hàng ngày");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNgay = new JTextField();
		txtNgay.setBounds(441, 25, 213, 19);
		contentPane.add(txtNgay);
		txtNgay.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ngày và giờ");
		lblNewLabel.setBounds(324, 27, 102, 15);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(175, 48, 493, 330);
		contentPane.add(scrollPane);
		
		txtaNoiDung = new JTextArea();
		scrollPane.setViewportView(txtaNoiDung);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		txtNgay.setText(dateFormat.format(date));
		txtaNoiDung.setEditable(true);
		txtaNoiDung.setText("");
		
		JButton btnOpen = new JButton("");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nhatKy = "";
				String ngay;
				String noiDung;
				try(DataInputStream in = new DataInputStream(new
						BufferedInputStream(new FileInputStream("./src/Lession9/daily.txt")))){
					while(true) {
						ngay = in.readUTF();
						noiDung = in.readUTF();
						nhatKy += ngay +"\n"+noiDung+"\n\n";
					}
				}catch(EOFException e) {
					
				}catch(IOException ex) {
					Logger.getLogger(Frame1Nhatky.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
				}
				txtaNoiDung.setText(nhatKy);
				txtaNoiDung.setEditable(false);
			}
		});
		btnOpen.setIcon(new ImageIcon(Frame1Nhatky.class.getResource("/resources1/image/open-icon.png")));
		btnOpen.setBounds(61, 48, 88, 77);
		contentPane.add(btnOpen);
		
		JButton btnNew = new JButton("");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date date = new Date();
				txtNgay.setText(dateFormat.format(date));
				txtaNoiDung.setEditable(true);
				txtaNoiDung.setText("");
			}
		});
		btnNew.setIcon(new ImageIcon(Frame1Nhatky.class.getResource("/resources1/image/new-icon.png")));
		btnNew.setBounds(61, 172, 88, 77);
		contentPane.add(btnNew);
		
		JButton btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try (DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream (new FileOutputStream("./src/Lession9/daily.txt",true)))) 
				{
					String ngay = txtNgay.getText();
					String noiDung = txtaNoiDung.getText();
					out.writeUTF(ngay);
					out.writeUTF(noiDung);
					JOptionPane.showMessageDialog(rootPane, "Nhật ký đã được ghi.");
					out.close();
				} catch (FileNotFoundException ex) {
				Logger.getLogger(Frame1Nhatky.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
				} catch (IOException ex) {
				Logger.getLogger(Frame1Nhatky.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
				}
			}
		});
		btnSave.setIcon(new ImageIcon(Frame1Nhatky.class.getResource("/resources1/image/save-icon.png")));
		btnSave.setBounds(61, 301, 88, 77);
		contentPane.add(btnSave);
		
		
	}

}

