package net.javaguides.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

public class loan_view extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField username;
    private JTextField credit_score;
    private JTextField acc_number;
    private JTextField amount;
    private JTextField interest;
    private JTextField term;
    private JButton btnNewButton;

    public loan_view() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(true);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewUserRegister = new JLabel("Loan Application");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("User Name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Account");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblamountAddress = new JLabel("Amount");
        lblamountAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblamountAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblamountAddress);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(214, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        acc_number = new JTextField();
        acc_number.setFont(new Font("Tahoma", Font.PLAIN, 32));
        acc_number.setBounds(214, 235, 228, 50);
        contentPane.add(acc_number);
        acc_number.setColumns(10);

        amount = new JTextField();
        amount.setFont(new Font("Tahoma", Font.PLAIN, 32));
        amount.setBounds(214, 320, 228, 50);
        contentPane.add(amount);
        amount.setColumns(10);

        credit_score = new JTextField();
        credit_score.setFont(new Font("Tahoma", Font.PLAIN, 32));
        credit_score.setBounds(707, 151, 228, 50);
        contentPane.add(credit_score);
        credit_score.setColumns(10);

        JLabel lblcredit_score = new JLabel("Credit");
        lblcredit_score.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblcredit_score.setBounds(542, 159, 99, 29);
        contentPane.add(lblcredit_score);

        JLabel lblPassword = new JLabel("Interest");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblmob_number = new JLabel("Term");
        lblmob_number.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblmob_number.setBounds(542, 329, 139, 26);
        contentPane.add(lblmob_number);

        interest = new JTextField();
        interest.setFont(new Font("Tahoma", Font.PLAIN, 32));
        interest.setBounds(707, 320, 228, 50);
        contentPane.add(interest);
        interest.setColumns(10);
        
        term = new JTextField();
        term.setFont(new Font("Tahoma", Font.PLAIN, 32));
        term.setBounds(707, 235, 228, 50);
        contentPane.add(term);


        btnNewButton = new JButton("Apply");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);
        
        
    }
    
    public String get_username() {
    	return username.getText();
    }
    
    public String get_acc_number() {
    	return acc_number.getText();
    }
    
    public String get_credit_score() {
    	return credit_score.getText();
    }
    
    public String get_term() {
    	return term.getText();
    }
    
    public String get_interest() {
    	return interest.getText();
    }
    
    public String get_amount() {
    	return amount.getText();
    }
    
    public void onApply(ActionListener apply) {
    	btnNewButton.addActionListener(apply);    
    }
    
    public void errormsg(int x) {
    	if (x == 0) {
            JOptionPane.showMessageDialog(btnNewButton, "Loan Rejected");
        } 
    	else {
            JOptionPane.showMessageDialog(btnNewButton,
                "Loan Application Successful");
        }    }
    public void set_name(String name) {
    	username.setText(name);
    }
    public void set_acc(int id) {
    	acc_number.setText(Integer.toString(id));
    }
    public void set_interest() {
    	term.setText("12%");
    }
    public void set_credit(float credit) {
    	credit_score.setText(Float.toString(credit));
    }
    
}
