package Controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ShopPad.ShopPadUI;
import Dao.member.implMember;
import Model.member;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addMemberUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberUI frame = new addMemberUI();
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
	public addMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 780, 437);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 71, 115, 37);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(10, 125, 148, 45);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(10, 180, 133, 37);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(10, 227, 115, 38);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mob");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_3.setBounds(10, 275, 115, 41);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tel");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_4.setBounds(10, 326, 115, 44);
		panel.add(lblNewLabel_1_4);
		
		JTextArea name = new JTextArea();
		name.setBounds(168, 76, 267, 31);
		panel.add(name);
		
		JTextArea username = new JTextArea();
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		username.setBounds(168, 131, 267, 31);
		panel.add(username);
		
		JTextArea password = new JTextArea();
		password.setBounds(168, 181, 267, 31);
		panel.add(password);
		
		JTextArea address = new JTextArea();
		address.setBounds(168, 229, 267, 31);
		panel.add(address);
		
		JTextArea mob = new JTextArea();
		mob.setBounds(168, 275, 267, 31);
		panel.add(mob);
		
		JTextArea tel = new JTextArea();
		tel.setBounds(168, 326, 267, 31);
		panel.add(tel);
		
		JButton add = new JButton("Confirm");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username=username.getText();
				if(new implMember().queryUser(Username))
				{
					addError error=new addError();
					error.show();
					dispose();
				}
				else
				{
					String Name=name.getText();
					String Password=password.getText();
					String Address=address.getText();
					String Mob=mob.getText();
					String Tel=tel.getText();
					
					member m=new member(Name,Username,Password,Address,Mob,Tel);
					
					new implMember().add(m);
					
					addSuccess success=new addSuccess();
					
					success.show();
					dispose();
					
					
				}
			}
		});
		add.setFont(new Font("Calibri", Font.BOLD, 35));
		add.setBounds(490, 156, 242, 88);
		panel.add(add);
		
		JButton btnOut = new JButton("Back to Login");
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShopPadUI SP=new ShopPadUI();
				if (SP!=null)
				{
					LoginUI LI=new LoginUI();
					LI.show();
					dispose();
				}
			}
		});
		btnOut.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnOut.setBounds(525, 290, 166, 33);
		panel.add(btnOut);
		
		JLabel lblBreakfastshop = new JLabel("BreakfastShop");
		lblBreakfastshop.setFont(new Font("Calibri", Font.BOLD, 36));
		lblBreakfastshop.setBounds(306, 10, 268, 47);
		panel.add(lblBreakfastshop);
	}

}
