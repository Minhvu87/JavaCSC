package chapter1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmOperator extends JFrame {

    private JPanel contentPane;
    private JTextField txtSH1;
    private JTextField txtSH2;
    private JTextField txtKQ;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmOperator frame = new FrmOperator();
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
    public FrmOperator() {
        setTitle("Toán tử");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 203);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Chọn toán tử:");
        lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel.setBounds(10, 11, 118, 14);
        contentPane.add(lblNewLabel);

        JComboBox cbbOperator = new JComboBox();
        cbbOperator.setModel(new DefaultComboBoxModel(
                new String[] { "-- Chọn --", "+", "-", "*", "/" }));
        cbbOperator.setBounds(138, 7, 286, 22);
        contentPane.add(cbbOperator);

        JLabel lblNewLabel_1 = new JLabel("Toán hạng 1:");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1.setBounds(10, 36, 118, 14);
        contentPane.add(lblNewLabel_1);

        txtSH1 = new JTextField();
        txtSH1.setBounds(138, 33, 286, 20);
        contentPane.add(txtSH1);
        txtSH1.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Toán hạng 2:");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1.setBounds(10, 64, 118, 14);
        contentPane.add(lblNewLabel_1_1);

        txtSH2 = new JTextField();
        txtSH2.setColumns(10);
        txtSH2.setBounds(138, 61, 286, 20);
        contentPane.add(txtSH2);

        JLabel lblNewLabel_1_2 = new JLabel("Kết quả:");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_2.setBounds(10, 137, 118, 14);
        contentPane.add(lblNewLabel_1_2);

        txtKQ = new JTextField();
        txtKQ.setColumns(10);
        txtKQ.setBounds(138, 134, 286, 20);
        contentPane.add(txtKQ);

        JButton btnNewButton = new JButton("Tính");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Lay gia tri 2 toan hang
                String sSH1 = txtSH1.getText().trim();
                String sSH2 = txtSH2.getText().trim();

                double sh1 = Double.parseDouble(sSH1);
                double sh2 = Double.valueOf(sSH2);

                // Lay toan tu ma nguoi dung chon
                String operator = cbbOperator.getSelectedItem().toString();

                // Thuc hien tinh toan
                double kq = 0;
                // if (operator.equals("+")) {
                // kq = sh1 + sh2;
                // } else if ("-".equals(operator)) {
                // kq = sh1 - sh2;
                // } else if ("*".equals(operator)) {
                // kq = sh1 * sh2;
                // } else if ("/".equals(operator)) {
                // kq = sh1 / sh2;
                // } else {
                // JOptionPane.showMessageDialog(null, "Bạn phải toán tử để thực
                // hiện tính toán.");
                // }
                switch (operator) {
                case "+":
                    kq = sh1 + sh2;
//                    break;
                case "-":
                    kq = sh1 - sh2;
//                    break;
                case "*":
                    kq = sh1 * sh2;
//                    break;
                case "/":
                    kq = sh1 / sh2;
//                    break;
                default:
                    break;
                }

                // Hiện thị kết quả
                txtKQ.setText(String.valueOf(kq));
            }
        });
        btnNewButton.setBounds(138, 92, 89, 23);
        contentPane.add(btnNewButton);
    }
}
