package Controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ShopPad.ShopPadUI;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addError extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addError frame = new addError();
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
	public addError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(62, 28, 329, 207);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Relogin");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton.setBounds(87, 81, 134, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registor");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_1.setBounds(87, 130, 134, 39);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Username repeat");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1.setBounds(74, 36, 184, 31);
		panel.add(lblNewLabel_1);
	}

}
