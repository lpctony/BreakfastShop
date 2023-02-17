package Controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ShopPad.ShopPadUI;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSuccess extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccess frame = new LoginSuccess();
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
	public LoginSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 20, 377, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Success");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setBounds(134, 59, 145, 62);
		panel.add(lblNewLabel);
		
		JButton enter = new JButton("Enter to shop");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShopPadUI p=new ShopPadUI();
				p.show();
				dispose();
			}
		});
		enter.setBounds(119, 126, 129, 37);
		panel.add(enter);
		
		JLabel lblBreakfastshop = new JLabel("BreakfastShop");
		lblBreakfastshop.setFont(new Font("Calibri", Font.BOLD, 36));
		lblBreakfastshop.setBounds(79, 10, 268, 47);
		panel.add(lblBreakfastshop);
	}

}
