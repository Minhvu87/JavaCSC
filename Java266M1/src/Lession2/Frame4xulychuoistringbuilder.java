package Lession2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Frame4xulychuoistringbuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txtsb;
	private JTextField txtsb1;
	private JTextField txtsb2;
	private JTextField txtchen;
	private JTextField txtdau;
	private JTextField txtcuoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4xulychuoistringbuilder frame = new Frame4xulychuoistringbuilder();
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
	public Frame4xulychuoistringbuilder() {
		setTitle("Xử lý String Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpSb = new JLabel("Chuỗi sb");
		lblNhpSb.setBounds(47, 45, 90, 15);
		contentPane.add(lblNhpSb);
		
		JLabel lblNhpSb_1 = new JLabel("Chuỗi sb1");
		lblNhpSb_1.setBounds(47, 98, 90, 15);
		contentPane.add(lblNhpSb_1);
		
		JLabel lblNewLabel = new JLabel("Chuỗi sb2");
		lblNewLabel.setBounds(47, 146, 90, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblVTrChn = new JLabel("Vị trí chèn");
		lblVTrChn.setBounds(47, 198, 90, 15);
		contentPane.add(lblVTrChn);
		
		JLabel lblVTru = new JLabel("Vị trí đầu");
		lblVTru.setBounds(47, 248, 90, 15);
		contentPane.add(lblVTru);
		
		JLabel lblVTrCui = new JLabel("Vị trí cuối");
		lblVTrCui.setBounds(47, 305, 90, 15);
		contentPane.add(lblVTrCui);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setBounds(47, 376, 90, 15);
		contentPane.add(lblKtQu);
		
		txtsb = new JTextField();
		txtsb.setBounds(179, 43, 244, 19);
		contentPane.add(txtsb);
		txtsb.setColumns(10);
		
		txtsb1 = new JTextField();
		txtsb1.setColumns(10);
		txtsb1.setBounds(179, 96, 244, 19);
		contentPane.add(txtsb1);
		
		txtsb2 = new JTextField();
		txtsb2.setColumns(10);
		txtsb2.setBounds(179, 144, 244, 19);
		contentPane.add(txtsb2);
		
		txtchen = new JTextField();
		txtchen.setColumns(10);
		txtchen.setBounds(179, 196, 244, 19);
		contentPane.add(txtchen);
		
		txtdau = new JTextField();
		txtdau.setColumns(10);
		txtdau.setBounds(179, 246, 244, 19);
		contentPane.add(txtdau);
		
		txtcuoi = new JTextField();
		txtcuoi.setColumns(10);
		txtcuoi.setBounds(179, 303, 244, 19);
		contentPane.add(txtcuoi);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		textArea.setLineWrap(true);
		textArea.setBounds(179, 376, 244, 98);
		contentPane.add(textArea);
		
		JButton btnXLChui = new JButton("Xử lý chuỗi");
		btnXLChui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Lấy chuỗi từ bàn phím
				String sb = txtsb.getText().trim();
				String sb1 = txtsb1.getText().trim();
				String sb2 = txtsb2.getText().trim();
				int viTri = Integer.parseInt(txtchen.getText().trim());
				int batDau = Integer.parseInt(txtdau.getText().trim());
				int ketThuc = Integer.parseInt(txtcuoi.getText().trim());
				
				//Khai báo biến kiểu ketQua để nhận các kết quả xuất ra TextArea
				String ketQua = "Kết Quả";
				// Khai báo biến kiểu String Builder str > đưa vào, tính chiều dài > đưa sb1 vào,
				//tính chiều dài > chèn sb2 vào str tại viTri > xóa str từ vị trí batDau đến vị trí ketThuc > đảo ngược
				// chuỗi str
				StringBuilder str = new StringBuilder(200);
				str.append(sb);
				ketQua += "\n Chuỗi sb:" +str;
				ketQua += "\n Chiều dài: "+str.length();
				str.append(sb1);
				ketQua += "\n Chuỗi sb sau khi nỗi sb1:" +str;
				ketQua += "\n Chiều dài: "+str.length();
				str.insert(viTri, sb2);
				ketQua += "\n Sau khi chèn sb2 vào vị trí" + viTri + ": \n"+str;
				str.delete(batDau, ketThuc);
				ketQua += "\n Sau khi xóa: \n"+str;
				str.reverse();
				ketQua += "\n Sau khi đảo ngược: \n"+str;
				//Xuất kết quả ra màn hình
				textArea.setText(ketQua);
			}
		});
		btnXLChui.setBounds(165, 334, 117, 25);
		contentPane.add(btnXLChui);
	}
}
