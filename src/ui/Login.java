package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import core.EmployeeService;
import dataAccess.Models.EmployeeLogin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	
	private EmployeeService employeeService;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	public static final String USER_LOGGED_IN = "User logged in";

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		employeeService = new EmployeeService();
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(118, 120, 73, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(118, 152, 73, 14);
		add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(223, 117, 86, 20);
		add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					EmployeeLogin employeeLogin = employeeService.verifyLogin(txtUsername.getText(), txtPassword.getText());
					//firePropertyChange(USER_LOGGED_IN, null, employeeLogin);
					//this.
					setVisible(false);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		});
		
		btnLogin.setBounds(159, 205, 107, 23);
		add(btnLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(223, 149, 86, 20);
		add(txtPassword);
	}
}
