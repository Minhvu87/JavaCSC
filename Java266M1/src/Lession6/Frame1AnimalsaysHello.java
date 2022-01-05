package Lession6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1AnimalsaysHello extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1AnimalsaysHello frame = new Frame1AnimalsaysHello();
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
	public Frame1AnimalsaysHello() {
		setTitle("Animal says hello");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(37, 35, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblAnimal = new JLabel("Animal");
		lblAnimal.setBounds(37, 85, 70, 15);
		contentPane.add(lblAnimal);
		
		txtName = new JTextField();
		txtName.setBounds(136, 33, 114, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JComboBox cbbAnimal = new JComboBox();
		cbbAnimal.setModel(new DefaultComboBoxModel(new String[] {"Dog", "Cat", "Pig"}));
		cbbAnimal.setBounds(136, 80, 114, 24);
		contentPane.add(cbbAnimal);
		
		JLabel lblHello = new JLabel("");
		lblHello.setBounds(37, 182, 213, 15);
		contentPane.add(lblHello);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(268, 33, 170, 164);
		contentPane.add(lblImage);
		
		JButton btnNewButton = new JButton("Say Hello");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtName.getText().trim();
				String imagePath = "src/resources1/image/";
				ImageIcon img = null;
				switch(cbbAnimal.getSelectedItem().toString()) {
					case "Dog":
						Dog d = new Dog(name, "tuat.jpg");
						lblHello.setText(d.name + "says"+d.sayHello());
						img = new ImageIcon(imagePath + d.getImage());
						lblImage.setIcon(img);
						break;
					case "Cat":
						Cat c = new Cat(name, "meo.jpg");
						lblHello.setText(c.name + "says"+c.sayHello());
						img = new ImageIcon(imagePath + c.getImage());
						lblImage.setIcon(img);
					break;
					default:
						Pig p = new Pig(name, "hoi.jpg");
						lblHello.setText(p.name + "says"+p.sayHello());
						img = new ImageIcon(imagePath + p.getImage());
						lblImage.setIcon(img);
						break;
				}
			}
		});
		btnNewButton.setBounds(136, 140, 117, 25);
		contentPane.add(btnNewButton);
	}
}
