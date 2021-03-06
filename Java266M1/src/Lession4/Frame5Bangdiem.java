package Lession4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class Frame5Bangdiem extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtScore;
	private JTextField txtSearch;
	private JList lstMain;

	private String arr[] = new String[100];
	private int currentIdx = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5Bangdiem frame = new Frame5Bangdiem();
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
	public Frame5Bangdiem() {
		setTitle("Score Board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(6, 17, 61, 16);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(79, 12, 154, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(251, 17, 61, 16);
		contentPane.add(lblScore);
		
		txtScore = new JTextField();
		txtScore.setBounds(321, 12, 96, 26);
		contentPane.add(txtScore);
		txtScore.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 53, 408, 301);
		contentPane.add(scrollPane);
		
		lstMain = new JList();
		scrollPane.setViewportView(lstMain);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Goi h??m th??m m???i ph???n t??? 
				add();
			}
		});
		btnAdd.setBounds(429, 12, 107, 57);
		contentPane.add(btnAdd);
		
		JButton btnSortName = new JButton("Sort Name");
		btnSortName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortByName();
			}
		});
		btnSortName.setBounds(429, 81, 107, 57);
		contentPane.add(btnSortName);
		
		JButton btnSortScore = new JButton("Sort Score");
		btnSortScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortByScore();
			}
		});
		btnSortScore.setBounds(426, 150, 110, 57);
		contentPane.add(btnSortScore);
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				find();
			}
		});
		btnFind.setBounds(429, 264, 107, 57);
		contentPane.add(btnFind);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(426, 219, 110, 26);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
	}

	/**
	 * L???y d??? li???u t??m ki???m.
	 * Th???c hi???n t??m ki???m tr??n m???ng t???m
	 */
	protected void find() {
		String search = txtSearch.getText().trim();
		
		String[] temp = new String[currentIdx];
		for (int idx = 0; idx < currentIdx; idx++) {
			temp[idx] = arr[idx];
		}
		
		// Th???c hi???n t??m ki???m trong m???ng v?? hi???n th??? ra JList
		// duy???t ph???n t??? trong m???ng v?? th??m m???i v??o jList
		DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) lstMain.getModel();
		model.removeAllElements();
		
		for (String element: temp) {
			if (element.toLowerCase().contains(search.toLowerCase())) {
				model.addElement(element);
			}
		}
		lstMain.setModel(model);
		
	}

	/**
	 * L???y m???ng g???m c??c gi?? tr??? hi???n t???i (lo???i null) -> T???o ra m???ng t???m ????? sort.
	 * D??ng l???p Arrays.sort.
	 * Hi???n th??? l???i JList.
	 */
	protected void sortByName() {
		
		String[] temp = new String[currentIdx];
		for (int idx = 0; idx < currentIdx; idx++) {
			temp[idx] = arr[idx];
		}
		
		Arrays.sort(temp);
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(temp);
		lstMain.setModel(model);
	}
	
	/**
	 * L???y m???ng g???m c??c gi?? tr??? hi???n t???i (lo???i null) -> T???o ra m???ng t???m ????? sort.
	 * D??ng l???p Arrays.sort -> ?????nh ngh??a l???i ti??u ch?? sort theo Score
	 * Hi???n th??? l???i JList.
	 */
	protected void sortByScore() {
		String[] temp = new String[currentIdx];
		for (int idx = 0; idx < currentIdx; idx++) {
			temp[idx] = arr[idx];
		}
		
		Arrays.sort(temp, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				// T??ch 1 chu???i th??nh 2 ph???n: name v?? score
				StringTokenizer st1 = new StringTokenizer(o1);
				String name1 = st1.nextToken();
				String score1 = st1.nextToken();
				
				String[] st2 = o2.split(" ");

				// So s??nh score -> name
				double diff = Float.valueOf(score1) - Float.valueOf(st2[1]);
				if (diff == 0) {
					return name1.compareTo(st2[0]);
				}
				return (int)diff;
			}
			
		});
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(temp);
		lstMain.setModel(model);
	}

	/**
	 * Th???c hi???n gi???i thu???t th??m m???i m???t ph???n t??? v?? hi???n th??? trong list
	 *   <ul>
	 *    <li>B?????c 1: L???y gi?? tr??? ng?????i d??ng nh???p v??o</li>
	 *    <li>B?????c 2: L??u gi?? tr??? v??o M???ng to??n c???c</li>
	 *    <li>B?????c 2: Hi???n th??? ra JList</li>
	 *   </ul>
	 */
	protected void add() {
		String name = txtName.getText().trim();
		// Chuy???n ?????i ki???u: String -> Float (Float.valueOf ho???c Float.parseFloat)
		float score = Float.valueOf(txtScore.getText().trim()); 
		
		arr[currentIdx] = name + " " + score;
		currentIdx++;
		
		// Hi???n th??? d??? li???u cho JList -> T????ng t?? nh?? c??ch hi???n th??? cho Combobox
		String[] temp = new String[currentIdx];
		for (int idx = 0; idx < currentIdx; idx++) {
			temp[idx] = arr[idx];
		}
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(temp);
		lstMain.setModel(model);
		
	}

}
