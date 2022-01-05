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
import java.awt.event.ActionEvent;

public class Frame4Quan_ly_thu_cung extends JFrame {

	private JPanel contentPane;
	private JTextField txtDogs;
	private JTextField txtCats;
	PetManager<Dog> managerDog = new PetManager<Dog>();
	PetManager<Cat> managerCat = new PetManager<Cat>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4Quan_ly_thu_cung frame = new Frame4Quan_ly_thu_cung();
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
	public Frame4Quan_ly_thu_cung() {
		setTitle("Quản lý cửa hàng thú cưng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Các bạn Dog được nhập về");
		lblNewLabel.setBounds(32, 48, 202, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblCcBnCat = new JLabel("Các bạn Cat được nhập về");
		lblCcBnCat.setBounds(32, 102, 202, 15);
		contentPane.add(lblCcBnCat);
		
		txtDogs = new JTextField();
		txtDogs.setBounds(271, 46, 280, 19);
		contentPane.add(txtDogs);
		txtDogs.setColumns(10);
		
		txtCats = new JTextField();
		txtCats.setColumns(10);
		txtCats.setBounds(271, 100, 280, 19);
		contentPane.add(txtCats);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 182, 522, 256);
		contentPane.add(scrollPane);
		
		JList lstDogCats = new JList();
		scrollPane.setViewportView(lstDogCats);
		
		JButton btnAdd = new JButton("Thêm mới");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Dogs = txtDogs.getText();
				String Cats = txtCats.getText();
				String DogNames[] = Dogs.split(",");
				String CatNames[] = Cats.split(",");
				for(String Dogname : DogNames){
				managerDog.getPets().add(new Dog(Dogname));
				}
				for(String Catname : CatNames){
				managerCat.getPets().add(new Cat(Catname));
				}
				DefaultListModel lst = new DefaultListModel();
				if(managerDog!=null && !managerDog.getPets().isEmpty()){
					for(int i=0;i<managerDog.getPets().size();i++){
						lst.addElement(managerDog.getPets().get(i));
					}
				}
				if(managerCat!=null && !managerCat.getPets().isEmpty()){
					for(int i=0;i<managerCat.getPets().size();i++){
						lst.addElement(managerCat.getPets().get(i));
					}
				}
				lstDogCats.setModel(lst);
				}
		});
		btnAdd.setBounds(151, 142, 117, 25);
		contentPane.add(btnAdd);
		
		JButton btnContinue = new JButton("Tiếp tục");
		btnContinue.setBounds(337, 142, 117, 25);
		contentPane.add(btnContinue);
	}

}
