package Lession3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utils.ReadOrWriteFile;
import utils.ImageRender;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Frame6_Dat_ve_xem_phim extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeats;
	private JTextField txtName;
	private JComboBox cbbMovies;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6_Dat_ve_xem_phim frame = new Frame6_Dat_ve_xem_phim();
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
	public Frame6_Dat_ve_xem_phim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeat = new JLabel("Seat(s)");
		lblSeat.setForeground(Color.RED);
		lblSeat.setBounds(33, 26, 70, 15);
		contentPane.add(lblSeat);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.RED);
		lblName.setBounds(33, 88, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblMovies = new JLabel("Movies");
		lblMovies.setForeground(Color.RED);
		lblMovies.setBounds(33, 145, 70, 15);
		contentPane.add(lblMovies);
		
		txtSeats = new JTextField();
		txtSeats.setBounds(146, 24, 114, 19);
		contentPane.add(txtSeats);
		txtSeats.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(146, 86, 226, 19);
		contentPane.add(txtName);
		
		
		
		//B1: Lay danh sach Film tu file
		String [] data = getListFilm();
		Integer[] idx = new Integer[data.length];
		for (int i = 0; i < data.length; i++) {
			idx[i] = i;
		}
		cbbMovies = new JComboBox(idx);
		cbbMovies.setRenderer(new ImageRender(data));
		cbbMovies.setBounds(146, 140, 154, 101);
		contentPane.add(cbbMovies);
		
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String seats = txtSeats.getText().trim();
				String name = txtName.getText().trim();
				String movies = data[cbbMovies.getSelectedIndex()];
				
				// Truyen du lieu qua Dialog
				DlgBai7_MessageBox dlg = new DlgBai7_MessageBox(seats, name, movies);
				dlg.setVisible(true);
				
				//
			}
		});
		
		btnBook.setForeground(Color.RED);
		btnBook.setBackground(Color.WHITE);
		btnBook.setBounds(156, 253, 117, 25);
		contentPane.add(btnBook);
	}

	private String[] getListFilm() {
		File file = new File("src/FilmList.txt");
		try {
			String content = ReadOrWriteFile.readTXT(file);
			
			return content.split("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	private void initModelOfCombobox() {
		// B1. Tao ra mang doi tuong (String, Department,..)
		String[] arr = {"Big Hero", "Avatar"};
		
		// B2. Tao doi tuong thuoc DefaultComboboxModel
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(arr);
		// B3. Thiet lap thuoc tinh model
		cbbMovies.setModel(model);
		}
}
