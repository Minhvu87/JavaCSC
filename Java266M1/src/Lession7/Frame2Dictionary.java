package Lession7;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SingleSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Frame2Dictionary extends JFrame {

	private JPanel contentPane;
	private JTextField txtWord;
	private JTextField txtMeaning;
	private JTextField txtWordSearch;
	private JTextField txtMeaningSearch;
	ArrayList<Dictionary> listDic = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2Dictionary frame = new Frame2Dictionary();
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
	public Frame2Dictionary() {
		setTitle("Dictionary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 0, 546, 338);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Show-Insert Word", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word");
		lblNewLabel.setBounds(30, 39, 70, 15);
		panel.add(lblNewLabel);
		
		JLabel lblMeaning = new JLabel("Meaning");
		lblMeaning.setBounds(237, 39, 70, 15);
		panel.add(lblMeaning);
		
		txtWord = new JTextField();
		txtWord.setBounds(98, 37, 121, 19);
		panel.add(txtWord);
		txtWord.setColumns(10);
		
		txtMeaning = new JTextField();
		txtMeaning.setColumns(10);
		txtMeaning.setBounds(312, 37, 121, 19);
		panel.add(txtMeaning);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 68, 406, 231);
		panel.add(scrollPane);
		
		JList lstWordList = new JList();
		scrollPane.setViewportView(lstWordList);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dictionary dic = new Dictionary(txtWord.getText().trim(), txtMeaning.getText().trim());
				listDic.add(dic);
				Collections.sort(listDic);//Sap xep cac tu trong List
				//Dua cac tu trong List vao dieu khien List tren form
				DefaultListModel listModel = new DefaultListModel();
				int i = 0;
				for (Dictionary x : listDic) {
					Object t = new String(x.word + " :" + x.meaning);
					listModel.add(i, t);
					i++;
				}
				lstWordList.setModel(listModel);
			}
		});
		btnInsert.setBounds(445, 34, 84, 25);
		panel.add(btnInsert);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Word");
		lblNewLabel_1.setBounds(56, 49, 70, 15);
		panel_1.add(lblNewLabel_1);
		
		txtWordSearch = new JTextField();
		txtWordSearch.setColumns(10);
		txtWordSearch.setBounds(166, 47, 121, 19);
		panel_1.add(txtWordSearch);
		
		txtMeaningSearch = new JTextField();
		txtMeaningSearch.setColumns(10);
		txtMeaningSearch.setBounds(166, 112, 121, 19);
		panel_1.add(txtMeaningSearch);
		
		JLabel lblNewLabel_2 = new JLabel("Meaning");
		lblNewLabel_2.setBounds(56, 114, 70, 15);
		panel_1.add(lblNewLabel_2);
		
		JButton btnSearch = new JButton("");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//TODO add your handling code here;
				String word = new String(txtWordSearch.getText().trim());
				String meaning = "";
				boolean result = false;
				for(Dictionary d : listDic) {
					if(d.word.equals(word)){
						result = true;
						meaning = d.meaning;
						break;
					
					}
				}
				if(!result) {
					JOptionPane.showMessageDialog(rootPane, "Sorry, cannot find this word!");
					
				}
				txtMeaningSearch.setText(meaning);
			}
		});
		btnSearch.setIcon(new ImageIcon(Frame2Dictionary.class.getResource("/resources1/image/Cart-icon.png")));
		btnSearch.setBounds(315, 44, 34, 25);
		panel_1.add(btnSearch);
	}
}
