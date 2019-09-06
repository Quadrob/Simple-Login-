package PlainLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Toolkit;

public class PlainLogin {

	private JFrame frmRazTech;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlainLogin window = new PlainLogin();
					window.frmRazTech.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlainLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRazTech = new JFrame();
		frmRazTech.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmRazTech.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rober\\Dropbox\\pics\\logo\\Photo 2019-07-07, 4 04 51 PM.jpg"));
		frmRazTech.setEnabled(false);
		frmRazTech.setTitle("  RAZ Tech©");
		frmRazTech.setBounds(250, 200, 600, 450);
		frmRazTech.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRazTech.getContentPane().setLayout(null);
		
		JTextField Username = new JTextField();
		Username.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Username.setBackground(Color.WHITE);
		Username.setBounds(220, 120, 300, 30);
		frmRazTech.getContentPane().add(Username);
		Username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(220, 200, 300, 30);
		frmRazTech.getContentPane().add(password);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblLogin.setBounds(150, 10, 300, 50);
		frmRazTech.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(60, 120, 100, 30);
		frmRazTech.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(60, 200, 100, 30);
		frmRazTech.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				@SuppressWarnings("deprecation")
				String Pass = password.getText();
				String User = Username.getText();
				
				if (Pass.equals("rob") && User.equals("rob")) {
					JOptionPane.showMessageDialog(null, "Welcome Rob", "Login Succesful", JOptionPane.INFORMATION_MESSAGE);
					Username.setText(null);
					password.setText(null);
					
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					Username.setText(null);
					password.setText(null);
				}
			}
		});
		btnLogin.setBounds(50, 300, 100, 30);
		frmRazTech.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Username.setText(null);
				password.setText(null);
			}
		});
		btnReset.setBounds(250, 300, 100, 30);
		frmRazTech.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmRazTech = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmRazTech, "Confirm if you wish to Exit", "Login System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
 			}
		});
		btnExit.setBounds(450, 300, 100, 30);
		frmRazTech.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(50, 85, 500, 2);
		frmRazTech.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(50, 270, 500, 2);
		frmRazTech.getContentPane().add(separator_1);
		
	}
}

















