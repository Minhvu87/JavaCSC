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

public class FrameScoreBoard extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtScore;
	private JTextField txtSearch;
	private JList lstMain;

	private String arr[] = new String[100];
	private int currentIdx = 0;
	protected String name = "";
	// Chuyển đổi kiểu: String -> Float (Float.valueOf hoặc Float.parseFloat)
	protected float score = 0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameScoreBoard frame = new FrameScoreBoard();
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
	public FrameScoreBoard() {
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
				// Goi hàm thêm mới phần tử 
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
	 * Lấy dữ liệu tìm kiếm.
	 * Thực hiện tìm kiếm trên mảng tạm
	 */
	protected void find() {
		String search = txtSearch.getText().trim();
		
		String[] temp = new String[currentIdx];
		for (int idx = 0; idx < currentIdx; idx++) {
			temp[idx] = arr[idx];
		}
		
		// Thực hiện tìm kiếm trong mảng và hiển thị ra JList
		// duyệt phần tử trong mảng và thêm mới vào jList
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
	 * Lấy mảng gồm các giá trị hiện tại (loại null) -> Tạo ra mảng tạm để sort.
	 * Dùng lớp Arrays.sort.
	 * Hiển thị lại JList.
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
	 * Lấy mảng gồm các giá trị hiện tại (loại null) -> Tạo ra mảng tạm để sort.
	 * Dùng lớp Arrays.sort -> Định nghĩa lại tiêu chí sort theo Score
	 * Hiển thị lại JList.
	 */
	protected void sortByScore() {
		String[] temp = new String[currentIdx];
		for (int idx = 0; idx < currentIdx; idx++) {
			temp[idx] = arr[idx];
		}
		
		Arrays.sort(temp, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				// Tách 1 chuỗi thành 2 phần: name và score
				StringTokenizer st1 = new StringTokenizer(o1);
				String name1 = st1.nextToken();
				String score1 = st1.nextToken();
				
				String[] st2 = o2.split(" ");

				// So sánh score -> name
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
	 * Thực hiện giải thuật thêm mới một phần tử và hiển thị trong list
	 *   <ul>
	 *    <li>Bước 1: Lấy giá trị người dùng nhập vào</li>
	 *    <li>Bước 2: Lưu giá trị vào Mảng toàn cục</li>
	 *    <li>Bước 2: Hiển thị ra JList</li>
	 *   </ul>
	 */
	protected void add() {
		name = txtName.getText().trim();
		// Chuyển đổi kiểu: String -> Float (Float.valueOf hoặc Float.parseFloat)
		score = Float.valueOf(txtScore.getText().trim()); 
		ScoreBoard sb = new ScoreBoard(name,score);
		arr[currentIdx] = sb.getName() + " " + sb.getScore();
		currentIdx++;
		
		// Hiển thị dữ liệu cho JList -> Tương tư như cách hiển thị cho Combobox
		String[] temp = new String[currentIdx];
		for (int idx = 0; idx < currentIdx; idx++) {
			temp[idx] = arr[idx];
		}
		//DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(temp);
		//lstMain.setModel(model);

		
	}

}

