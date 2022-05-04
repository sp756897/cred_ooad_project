package net.javaguides.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class landing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public dashboard_controller dController;

	/**
	 * Create the frame.
	 */
	public landing(dashboard_controller dController) {
		
		this.dController = dController;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBounds(399, 147, 259, 74);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBounds(399, 247, 259, 74);
		panel.add(btnNewButton_1);
		
		JLabel lblWelcomeToCredit = new JLabel("Welcome to Credit Score management System");
		lblWelcomeToCredit.setBounds(162, 52, 1025, 50);
		lblWelcomeToCredit.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		panel.add(lblWelcomeToCredit);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin ah = new UserLogin(dController);
				ah.setTitle("Welcome");
				ah.setVisible(true);
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserRegistration ah = new UserRegistration();
				ah.setTitle("Welcome");
				ah.setVisible(true);
				
			}
		});

	}
}


