package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import core.EmployeeService;
import dataAccess.Models.EmployeeLogin;

public class Start extends JFrame {

	private EmployeeLogin currentLogin;
	private Login login;
	private MainMenu mainMenu;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		login = new Login();
		login.setBorder(new EmptyBorder(5, 5, 5, 5));
		login.setLayout(new BorderLayout(0, 0));
		//setContentPane(login);
		
		panel=new JPanel();
		mainMenu = new MainMenu();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0, 0));
		add(login);
		add(mainMenu);
		
		currentLogin = null;
		
//		this.addPropertyChangeListener(new PropertyChangeListener() {
//
//	         @Override
//	         public void propertyChange(PropertyChangeEvent evt) {
//	            if (evt.getPropertyName().equals(Login.USER_LOGGED_IN)) {
//	            	currentLogin = (EmployeeLogin) evt.getNewValue();
//	            	
//	            	setContentPane(mainMenu);
//	            }
//	         }
//	      });
	}

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
						currentLogin = employeeService.verifyLogin(txtUsername.getText(), txtPassword.getText());
						//firePropertyChange(USER_LOGGED_IN, null, employeeLogin);
						//this.
						getContentPane().removeAll();
					    getContentPane().add(mainMenu);
					    getContentPane().doLayout();
					    update(getGraphics());
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
	
	public class MainMenu extends JPanel {

		/**
		 * Create the panel.
		 */
		public MainMenu() {
			
			JButton btnNewButton = new JButton("New button");
			add(btnNewButton);
			setVisible(true);

		}

	}
}
