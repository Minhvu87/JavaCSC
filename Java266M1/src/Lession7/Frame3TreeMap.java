package Lession7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class Frame3TreeMap extends JFrame {

	private JPanel contentPane;
	private JTextField txtKey;
	private JTextField txtValue;
	Map DanhSach = new TreeMap();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3TreeMap frame = new Frame3TreeMap();
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
	public Frame3TreeMap() {
		setTitle("TreeMap");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Key");
		lblNewLabel.setBounds(12, 40, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setBounds(214, 40, 70, 15);
		contentPane.add(lblValue);
		
		txtKey = new JTextField();
		txtKey.setBounds(62, 38, 114, 19);
		contentPane.add(txtKey);
		txtKey.setColumns(10);
		
		txtValue = new JTextField();
		txtValue.setColumns(10);
		txtValue.setBounds(280, 38, 114, 19);
		contentPane.add(txtValue);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 124, 374, 224);
		contentPane.add(scrollPane);
		
		JList lstKeyValue = new JList();
		scrollPane.setViewportView(lstKeyValue);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// dua phan tu vao Danh Sach
				DanhSach.put(txtKey.getText().trim(), txtValue.getText().trim());
				// Xu ly duyet va xuat DanhSach ra lstKeyValue
				DefaultListModel lst = new DefaultListModel();
				int i = 0;
				for (Object key: DanhSach.keySet()) {
					Object value = new String(key.toString() + " : "+(String) DanhSach.get(key));
					lst.add(i, value);
					i++;
				}
				lstKeyValue.setModel(lst);
			}
		});
		btnAdd.setBounds(94, 87, 82, 25);
		contentPane.add(btnAdd);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnContinue.setBounds(214, 87, 106, 25);
		contentPane.add(btnContinue);
	}

}
