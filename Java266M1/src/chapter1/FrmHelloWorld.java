package chapter1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmHelloWorld extends JFrame {

    private JPanel contentPane;
    private JTextField txtName;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmHelloWorld frame = new FrmHelloWorld();
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
    public FrmHelloWorld() {
        setTitle("Xin chào");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 601, 137);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nhập họ tên:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel.setBounds(10, 11, 131, 14);
        contentPane.add(lblNewLabel);
        
        txtName = new JTextField();
        txtName.setBounds(151, 8, 256, 20);
        contentPane.add(txtName);
        txtName.setColumns(10);
        
        JLabel lblName = new JLabel("");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblName.setBounds(10, 36, 565, 14);
        contentPane.add(lblName);
        
        JButton btnNewButton = new JButton("Xuất lời chào");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lay du lieu nguoi dung nhap vao -> lay ten
                String name = txtName.getText();
                
                // Tao ra loi chao
                String hello = "chào mừng " + name + ", chào mừng bạn đến với ngôn ngữ lập trình java.";
                
                // Hien thi loi chao
                lblName.setText(hello);
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBounds(211, 61, 113, 23);
        contentPane.add(btnNewButton);
    }
}
