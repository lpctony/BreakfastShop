package Controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ShopPad.ShopPadUI;
import Controller.member.LoginError;
import Controller.member.LoginSuccess;
import Dao.DateTimer;
import Dao.member.implMember;
import Model.member;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class LoginUI extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 586, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(72, 97, 92, 29);
		panel.add(lblNewLabel);
		
		JTextArea txtUsername = new JTextArea();
		txtUsername.setBounds(174, 97, 185, 29);
		panel.add(txtUsername);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(72, 149, 92, 29);
		panel.add(lblNewLabel_1);
		
		JTextArea txtPassword = new JTextArea();
		txtPassword.setBounds(174, 149, 185, 29);
		panel.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				
				String password = txtPassword.getText();
				
				member m=new implMember().queryMember(username,password);
				
				if (m!=null)
				{
					System.out.println(m);
					LoginSuccess ls=new LoginSuccess();
					ls.show();
					dispose();
				}
				else 
				{
					System.out.println(m);
					LoginError le=new LoginError();
					le.show();
					dispose();
				}
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnLogin.setBounds(90, 203, 97, 33);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String clear="";
				txtUsername.setText(""+clear);
				txtPassword.setText(""+clear);
				
				System.out.println(clear);
			}
		});
		btnReset.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnReset.setBounds(197, 203, 97, 33);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
						
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			
		});
		
		btnExit.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnExit.setBounds(304, 203, 97, 33);
		panel.add(btnExit);
		
		JLabel lblBreakfastshop = new JLabel("BreakfastShop");
		lblBreakfastshop.setHorizontalAlignment(SwingConstants.CENTER);
		lblBreakfastshop.setFont(new Font("Calibri", Font.BOLD, 36));
		lblBreakfastshop.setBounds(107, 23, 294, 39);
		panel.add(lblBreakfastshop);
		
		JLabel time = new JLabel("");
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("新細明體", Font.BOLD, 20));
		time.setBounds(159, 292, 200, 39);
		panel.add(time);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginUI SP=new LoginUI();
				if (SP!=null)
				{
					addMemberUI AI=new addMemberUI();
					AI.show();
					dispose();
				}
			}
		});
		btnRegister.setFont(new Font("Calibri", Font.BOLD, 20));
		btnRegister.setBounds(154, 246, 192, 33);
		panel.add(btnRegister);
		Timer timer = new Timer(); 
		  timer.schedule(new TimerTask() { 
		   public void run() { 
		    time.setText(DateTimer.getTime()); 
		   } 
		  }, 0, 1000);
	}
}
