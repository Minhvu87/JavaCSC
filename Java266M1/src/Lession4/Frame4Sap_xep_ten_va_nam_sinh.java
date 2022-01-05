package Lession4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;

import java.util.*;
import javax.swing.JScrollPane;

public class Frame4Sap_xep_ten_va_nam_sinh extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtbirth;
	
	private String[] arr = new String[100];
	private int currentSize = 0;
	private JList lstMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4Sap_xep_ten_va_nam_sinh frame = new Frame4Sap_xep_ten_va_nam_sinh();
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
	public Frame4Sap_xep_ten_va_nam_sinh() {
		setTitle("Sort by Age");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(24, 27, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Birth");
		lblNewLabel.setBounds(24, 70, 70, 15);
		contentPane.add(lblNewLabel);
		
		txtname = new JTextField();
		txtname.setBounds(112, 25, 199, 19);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtbirth = new JTextField();
		txtbirth.setBounds(112, 68, 199, 19);
		contentPane.add(txtbirth);
		txtbirth.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 97, 426, 189);
		contentPane.add(scrollPane);
		
		JList lstMain = new JList();
		scrollPane.setViewportView(lstMain);
		lstMain.setModel(new DefaultListModel<String>());
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// B1: lay thong tin Ten va nam sinh
				String name = txtname.getText().trim();
				String birth = txtbirth.getText().trim();
				// B2: Thêm thông tin vào mảng arr
				arr[currentSize++] = name + " " + birth;
				// B3: Sắp xếp lại ar theo năm sinh tăng(tuổi giảm)
				//=> tạo ra mảng tạm loại bỏ những phần tử null trước khi sắp xếp
				String [] tempArr = new String[currentSize];
				for(int idx = 0; idx < currentSize; idx++) {
					tempArr[idx] = arr[idx];
				}
				Arrays.parallelSort(tempArr, new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						String [] split1 = o1.split(" ");
						String [] split2 = o2.split(" ");
						
						return Integer.parseInt(split1[1]) - Integer.parseInt(split2[1]);
					}
				});
				//B4 Hiển thị danh sách ra lstMain
				DefaultListModel<String> model = (DefaultListModel<String>) lstMain.getModel();
				model.removeAllElements();
				for(String element: tempArr) {
					model.addElement(element);
				}
				lstMain.setModel(model);
				// Creating a List

			}
		});
		btnNewButton.setBounds(321, 17, 117, 68);
		contentPane.add(btnNewButton);
		
		
	}
}
