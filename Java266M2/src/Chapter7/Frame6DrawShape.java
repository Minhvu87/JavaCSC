package Chapter7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame6DrawShape extends JFrame {

	private JPanel contentPane;
	private JLabel lblShape;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6DrawShape frame = new Frame6DrawShape();
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
	public Frame6DrawShape() {
		setTitle("Draw Shape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShapeFactory shapeFactory = new ShapeFactory();
				//get an object of Circle and call its draw method.
				SHAPE shape1 = shapeFactory.getShape("CIRCLE");
				//call draw method of Circle
				lblShape.setIcon(shape1.draw());
			}
		});
		btnCircle.setBounds(34, 43, 117, 25);
		contentPane.add(btnCircle);
		
		JButton btnSquare = new JButton("Square");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShapeFactory shapeFactory = new ShapeFactory();
				SHAPE shape1 = shapeFactory.getShape("SQUARE");
				lblShape.setIcon(shape1.draw());
			}
		});
		btnSquare.setBounds(321, 43, 117, 25);
		contentPane.add(btnSquare);
		
		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShapeFactory shapeFactory = new ShapeFactory();
				SHAPE shape1 = shapeFactory.getShape("RECTANGLE");
				lblShape.setIcon(shape1.draw());
			}
		});
		btnRectangle.setBounds(582, 43, 117, 25);
		contentPane.add(btnRectangle);
		
		lblShape = new JLabel("");
		lblShape.setBounds(68, 83, 661, 532);
		contentPane.add(lblShape);
	}
}
