package Lession3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DlgBai7_MessageBox extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public DlgBai7_MessageBox(String seats, String name, String movies) {
		setTitle("Booking");
		setBounds(100, 100, 350, 155);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(DlgBai7_MessageBox.class.getResource("/resources1/image/Cart-icon.png")));
			label.setBounds(24, 11, 46, 30);
			contentPanel.add(label);
		}
		{
			JLabel lblSeats = new JLabel("");
			lblSeats.setBounds(80, 11, 137, 14);
			lblSeats.setText("Seats: " + seats);
			contentPanel.add(lblSeats);
		}
		{
			JLabel lblName = new JLabel("");
			lblName.setBounds(80, 36, 137, 14);
			lblName.setText("Name: " + name);
			contentPanel.add(lblName);
		}
		{
			JLabel lblMovies = new JLabel("");
			lblMovies.setText("Movies: " + movies);
			lblMovies.setBounds(80, 61, 215, 14);
			contentPanel.add(lblMovies);
		}
	}

}
