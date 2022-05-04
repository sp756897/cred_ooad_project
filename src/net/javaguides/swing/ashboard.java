package net.javaguides.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.ParseInfo;

import javax.sql.rowset.serial.SerialJavaObject;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class ashboard extends JFrame {

	private JPanel contentPane;
	private JTextField deposit_textField;
	private JTextField withdraw_textfield;
	private JButton deposit_button;
	private JButton withdraw_button;
	private JLabel id_label;
	private JLabel creditscore_label;
	private JLabel name_label;
	private JPanel tab1;
	private JPanel tab2;
	private JPanel tab3;
	private JLabel balance_label;
	private JButton loan_button;

	/**
	 * Create the frame.
	 */
	public ashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		tab3 = new JPanel();
		tab3.setBounds(151, 6, 512, 330);
		panel.add(tab3);
		tab3.setBackground(new Color(152, 251, 152));
		tab3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Withdraw");
		lblNewLabel_2.setBounds(220, 6, 77, 16);
		tab3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Withdraw");
		lblNewLabel_2_1.setBounds(42, 82, 77, 16);
		tab3.add(lblNewLabel_2_1);
		
		withdraw_textfield = new JTextField();
		withdraw_textfield.setBounds(147, 77, 329, 26);
		tab3.add(withdraw_textfield);
		withdraw_textfield.setColumns(10);
		
		withdraw_button = new JButton("Withdraw");
		withdraw_button.setBounds(238, 143, 117, 29);
		tab3.add(withdraw_button);
		
		tab1 = new JPanel();
		tab1.setBackground(SystemColor.textHighlight);
		tab1.setBounds(153, 6, 510, 330);
		panel.add(tab1);
		tab1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(60, 44, 47, 16);
		tab1.add(lblNewLabel);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(60, 78, 47, 16);
		tab1.add(lblId);
		
		name_label = new JLabel("Name");
		name_label.setBounds(183, 44, 47, 16);
		tab1.add(name_label);
		
		id_label = new JLabel("Id");
		id_label.setBounds(183, 78, 47, 16);
		tab1.add(id_label);
		
		JLabel lblCreditScore = new JLabel("Credit Score");
		lblCreditScore.setBounds(60, 125, 86, 16);
		tab1.add(lblCreditScore);
		
		creditscore_label = new JLabel("Credit Score");
		creditscore_label.setBounds(183, 125, 86, 16);
		tab1.add(creditscore_label);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dashboard");
		lblNewLabel_1_1.setBounds(239, 6, 121, 16);
		tab1.add(lblNewLabel_1_1);
		
		JLabel lblCreditScore_1 = new JLabel("Balance");
		lblCreditScore_1.setBounds(60, 164, 86, 16);
		tab1.add(lblCreditScore_1);
		
		balance_label = new JLabel("Credit Score");
		balance_label.setBounds(183, 164, 86, 16);
		tab1.add(balance_label);
		tab1.setVisible(true);
		
		tab2 = new JPanel();
		tab2.setBounds(151, 6, 512, 330);
		panel.add(tab2);
		tab2.setBackground(Color.ORANGE);
		tab2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Deposit");
		lblNewLabel_1.setBounds(231, 5, 64, 16);
		tab2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Deposit");
		lblNewLabel_1_2.setBounds(71, 102, 64, 16);
		tab2.add(lblNewLabel_1_2);
		
		deposit_textField = new JTextField();
		deposit_textField.setBounds(183, 97, 228, 26);
		tab2.add(deposit_textField);
		deposit_textField.setColumns(10);
		
		deposit_button = new JButton("Deposit");
		deposit_button.setBackground(Color.WHITE);
		deposit_button.setBounds(239, 163, 117, 29);
		tab2.add(deposit_button);
		tab2.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 146, 330);
		panel.add(panel_1);
		
		try {
			tab3.setVisible(false);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton btnNewButton_1 = new JButton("Dashboard");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tab1.setVisible(true);
				tab2.setVisible(false);
				tab3.setVisible(false);

			}
			
			
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deposit");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tab1.setVisible(false);
				tab2.setVisible(true);
				tab3.setVisible(false);
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Withdraw");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tab1.setVisible(false);
				tab2.setVisible(false);
				tab3.setVisible(true);
			}
		});
		panel_1.add(btnNewButton_3);
		
		loan_button = new JButton("Loan");
		panel_1.add(loan_button);
		
	}
	
	 public void onDeposit(ActionListener apply) {
	    	deposit_button.addActionListener(apply);    
	    }
	 
	 public void onWithdraw(ActionListener apply) {
	    	withdraw_button.addActionListener(apply);    
	    }
	 public void onLoan(ActionListener apply) {
	    	loan_button.addActionListener(apply);    
	    }
	 
	 public int get_id() {
		 return Integer.parseInt( id_label.getText() ) ;
	 }
	 public float get_credit() {
		 return Integer.parseInt( creditscore_label.getText() ) ;
	 }
	 public int get_depamt() {
		 return Integer.parseInt( deposit_textField.getText() ) ;
	 }
	 public int get_witamt() {
		 return Integer.parseInt( withdraw_textfield.getText() ) ;
	 }
	 public void errormsgdep(int x) {
	    	if (x == 0) {
	            JOptionPane.showMessageDialog(deposit_button, "Transaction Failed");
	        } 
	    	else {
	            JOptionPane.showMessageDialog(deposit_button,
	                "Transaction Successful");
	        }    
	    }
	 public void errormsgwith(int x) {
	    	if (x == 0) {
	            JOptionPane.showMessageDialog(deposit_button, "Transaction Failed");
	        } 
	    	else {
	            JOptionPane.showMessageDialog(deposit_button,
	                "Transaction Successful");
	        }    
	    }
	 
public void set_name(String name) {
	name_label.setText(name);
}
public void set_id(int id) {
	id_label.setText(Integer.toString(id));
}
public void set_credit(float credit) {
	creditscore_label.setText(Float.toString(credit));
}
public void set_balance(float bal) {
	balance_label.setText(Float.toString(bal));
}
}
