package Chapter6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Frame4DaNgonNgu extends JFrame {

	private JPanel contentPane;
	private JRadioButton rbtViet;
	private JRadioButton rbtEng;
	private ButtonGroup genderGroup = new ButtonGroup();
	private JList lstResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4DaNgonNgu frame = new Frame4DaNgonNgu();
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
	public Frame4DaNgonNgu() {
		setTitle("ResourceBundle Cho đa ngôn ngữ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChnNgnNg = new JLabel("Chọn ngôn ngữ");
		lblChnNgnNg.setBounds(54, 42, 126, 15);
		contentPane.add(lblChnNgnNg);
		
		rbtViet = new JRadioButton("Vietnamese");
		
		rbtViet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String languageCode = "vi";
				String countryCode = "VN";
				loadResouceBundle(languageCode, countryCode);
			}
		});
		rbtViet.setSelected(true);
		rbtViet.setBounds(203, 38, 149, 23);
		contentPane.add(rbtViet);
		genderGroup.add(rbtViet);
		
		rbtEng = new JRadioButton("English");
		rbtEng.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String languageCode = "en";
				String countryCode = "US";
				loadResouceBundle(languageCode, countryCode);
			}
		});

		rbtEng.setBounds(377, 38, 149, 23);
		contentPane.add(rbtEng);
		genderGroup.add(rbtEng);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 83, 450, 258);
		contentPane.add(scrollPane);
		
		lstResult = new JList();
		scrollPane.setViewportView(lstResult);
		
	}
	protected void loadResouceBundle(String languageCode, String countryCode) {
		Locale currentLocal = new Locale(languageCode, countryCode);
		
		ResourceBundle message = ResourceBundle.getBundle("Chapter6.resource", currentLocal);
		
		DefaultListModel<String> model = new DefaultListModel<>();
		
		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			
			model.addElement(value);
		}
		lstResult.setModel(model);
	}

		
}
