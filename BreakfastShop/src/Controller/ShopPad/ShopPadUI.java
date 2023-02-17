package Controller.ShopPad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import Controller.member.LoginError;
import Controller.member.LoginSuccess;
import Controller.member.LoginUI;
import Dao.DateTimer;
import Dao.Exchange;
import Dao.ShopPad.implShoppad;
import Dao.member.implMember;
import Model.member;
import Model.shoppad;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;

public class ShopPadUI extends JFrame {

	private JPanel contentPane;
	
	private static int price=0;
	private static int sqleprice=0;
	private static int sqlmprice=0;
	private static int sqlbprice=0;
	private static int total=0;
	private static int showTotal=0;
	private static int totalAmount=0;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopPadUI frame = new ShopPadUI();
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
	public ShopPadUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 636, 650);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBreakfastshop = new JLabel("BreakfastShop");
		lblBreakfastshop.setFont(new Font("Calibri", Font.BOLD, 36));
		lblBreakfastshop.setBounds(199, 10, 268, 47);
		panel.add(lblBreakfastshop);
		
		JCheckBox pickegg = new JCheckBox(" egg   NTD 10");
		pickegg.setForeground(Color.BLACK);
		pickegg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					
				if	(pickegg.isSelected())
				{
				  pickegg.setForeground(Color.BLUE);
				  pickegg.setFont(new Font("標楷體", Font.BOLD, 16));
				}	
				else 
				{
				  pickegg.setForeground(Color.BLACK);
			      pickegg.setFont(new Font("標楷體", Font.PLAIN, 16));
				}
				
			}
		});
		pickegg.setFont(new Font("標楷體", Font.PLAIN, 16));
		pickegg.setBounds(18, 65, 158, 28);
		panel.add(pickegg);
		
		JCheckBox pickmilk = new JCheckBox(" milk  NTD 30");
		pickmilk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if	(pickmilk.isSelected())
				{
					pickmilk.setForeground(Color.BLUE);
					pickmilk.setFont(new Font("標楷體", Font.BOLD, 16));
				}	
				else 
				{
					pickmilk.setForeground(Color.BLACK);
					pickmilk.setFont(new Font("標楷體", Font.PLAIN, 16));
				}
			}
		});
		pickmilk.setForeground(Color.BLACK);
		pickmilk.setFont(new Font("標楷體", Font.PLAIN, 16));
		pickmilk.setBounds(18, 120, 158, 28);
		panel.add(pickmilk);
		
		JCheckBox pickbread = new JCheckBox(" bread NTD 50");
		pickbread.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if	(pickbread.isSelected())
				{
					pickbread.setForeground(Color.BLUE);
					pickbread.setFont(new Font("標楷體", Font.BOLD, 16));
				}	
				else 
				{
					pickbread.setForeground(Color.BLACK);
					pickbread.setFont(new Font("標楷體", Font.PLAIN, 16));
				}
			}
		});
		pickbread.setForeground(Color.BLACK);
		pickbread.setFont(new Font("標楷體", Font.PLAIN, 16));
		pickbread.setBounds(18, 176, 158, 28);
		panel.add(pickbread);
		
		JComboBox comboegg = new JComboBox();
		
		comboegg.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboegg.setToolTipText("");
		comboegg.setBounds(182, 67, 61, 23);
		panel.add(comboegg);
		
		JComboBox combomilk = new JComboBox();
		
		combomilk.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		combomilk.setBounds(182, 122, 61, 23);
		panel.add(combomilk);
		
		JComboBox combobread = new JComboBox();
		
		combobread.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		combobread.setBounds(182, 178, 61, 23);
		panel.add(combobread);
		
		JTextArea showAll = new JTextArea();
		showAll.setBounds(18, 332, 608, 175);
		panel.add(showAll);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblTotal.setBounds(18, 234, 76, 28);
		panel.add(lblTotal);
		
		JTextArea showTotal = new JTextArea();
		showTotal.setBounds(104, 224, 174, 28);
		panel.add(showTotal);
		
		JLabel lblPay = new JLabel("Pay");
		lblPay.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblPay.setBounds(30, 285, 76, 28);
		panel.add(lblPay);
		
		JTextArea showPay = new JTextArea();
		showPay.setBounds(104, 273, 174, 28);
		panel.add(showPay);
		
		JButton btnCheck = new JButton("Check");
		
		btnCheck.setFont(new Font("Calibri", Font.PLAIN, 36));
		btnCheck.setBounds(370, 156, 181, 68);
		panel.add(btnCheck);
		
		JButton btnPrint = new JButton("Txt");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pay = 0;
				int total = 0;
				
				if(showPay.getText().length()!=0)
				{
					pay = Integer.parseInt(showPay.getText());
					total = Integer.parseInt(showTotal.getText());
					Exchange.change(pay, total);
					showAll.setText(""+Exchange.change(pay, total));
					
				}
				
				else
				{
					showAll.setText("請輸入付款金額");
					
				}
				
				
				File f=new File("c:/BreakfastShop");
				f.mkdirs();
				
				FileWriter fw;
				try {
					fw = new FileWriter("c:/BreakfastShop/a.txt");
					fw.write(""+Exchange.change(pay, total));
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnPrint.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnPrint.setBounds(341, 251, 61, 33);
		panel.add(btnPrint);
		
		JButton btnCsv = new JButton("Csv");
		btnCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pay = 0;
				int total = 0;
				
				if(showPay.getText().length()!=0)
				{
					pay = Integer.parseInt(showPay.getText());
					total = Integer.parseInt(showTotal.getText());
					Exchange.change(pay, total);
					showAll.setText(""+Exchange.change(pay, total));
					
				}
				
				else
				{
					showAll.setText("請輸入付款金額");
					
				}
				
				File f=new File("c:/BreakfastShop");
				f.mkdirs();
				
				try
				{
					FileWriter fws=new FileWriter("c:/BreakfastShop/b.csv");
					fws.write(""+Exchange.change(pay, total));
					fws.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCsv.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnCsv.setBounds(425, 251, 76, 33);
		panel.add(btnCsv);
		
		JButton btnVipOff = new JButton("Vip 10% off");
		
		btnVipOff.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnVipOff.setBounds(399, 67, 127, 68);
		panel.add(btnVipOff);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String clear="";
				showTotal.setText(clear);
				showPay.setText(clear);
				showAll.setText(clear);
				System.out.println(clear);
				pickegg.setSelected(false);
				pickegg.setForeground(Color.BLACK);
				pickegg.setFont(new Font("標楷體", Font.PLAIN, 16));
				comboegg.setSelectedIndex(0);
				pickmilk.setSelected(false);
				pickmilk.setForeground(Color.BLACK);
				pickmilk.setFont(new Font("標楷體", Font.PLAIN, 16));
				combomilk.setSelectedIndex(0);
				pickbread.setSelected(false);
				pickbread.setForeground(Color.BLACK);
				pickbread.setFont(new Font("標楷體", Font.PLAIN, 16));
				combobread.setSelectedIndex(0);
				
				
			}
		});
		btnClear.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnClear.setBounds(341, 289, 85, 33);
		panel.add(btnClear);
		
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
		btnOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnOut.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnOut.setBounds(436, 289, 166, 33);
		panel.add(btnOut);
		
		JButton btnSql = new JButton("Sql");
		
		btnSql.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnSql.setBounds(521, 251, 69, 33);
		panel.add(btnSql);
		
		JLabel time = new JLabel("");
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("新細明體", Font.BOLD, 20));
		time.setBounds(221, 528, 200, 39);
		panel.add(time);
		
		Timer timer = new Timer(); 
		  timer.schedule(new TimerTask() { 
		   public void run() { 
		    time.setText(DateTimer.getTime()); 
		   } 
		  }, 0, 1000);
		
		
		comboegg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 sqleprice=comboegg.getSelectedIndex()*10
						 +combomilk.getSelectedIndex()*30
						 +combobread.getSelectedIndex()*50;
				 showTotal.setText(""+sqleprice);
				
			}
		});
		
		combomilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				sqlmprice=combomilk.getSelectedIndex()*30
						+comboegg.getSelectedIndex()*10
						+combobread.getSelectedIndex()*50;
				
				 showTotal.setText(""+sqlmprice);
			
		
			}
		});
		
		combobread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//price=price+combobread.getSelectedIndex()*50;
				sqlbprice=combobread.getSelectedIndex()*50
						+comboegg.getSelectedIndex()*10
						 +combomilk.getSelectedIndex()*30;
				showTotal.setText(""+sqlbprice);
				System.out.println(sqlbprice);
			}
		});
		
		btnVipOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				totalAmount=combobread.getSelectedIndex()*50
						+comboegg.getSelectedIndex()*10
						 +combomilk.getSelectedIndex()*30;
				showTotal.setText(""+totalAmount*9/10);
				System.out.println(totalAmount);
			}
		});
		
		btnCheck.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int pay = 0;
				int total = 0;
				
				if(showPay.getText().length()!=0)
				{
					pay = Integer.parseInt(showPay.getText());
					total = Integer.parseInt(showTotal.getText());
					Exchange.change(pay, total);
					showAll.setText(""+Exchange.change(pay, total));
					
				}
				
				else
				{
					showAll.setText("請輸入付款金額");
					
				}
				
			}
		});
		
		btnSql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Date d=new Date();
				sqleprice=comboegg.getSelectedIndex()*1;
				sqlmprice=combomilk.getSelectedIndex()*1;
				sqlbprice=combobread.getSelectedIndex()*1;
				total=comboegg.getSelectedIndex()*10
					+combomilk.getSelectedIndex()*30
					+combobread.getSelectedIndex()*50;
				
				String egg_Ntd10=""+sqleprice;
				String milk_Ntd30=""+sqlmprice;
				String bread_Ntd50=""+sqlbprice;
				Integer TTLAmt_Ntd=Integer.parseInt(showTotal.getText());
							
								
				showAll.setText("egg_Ntd10*"+egg_Ntd10+"pcs"
						+"\nmilk_Ntd30*"+milk_Ntd30+"pcs"
						+"\nbread_Ntd50*"+bread_Ntd50+"pcs"
						+"\n\nTTLAmt_Ntd*:"+showTotal.getText());
				
				shoppad s = new shoppad(egg_Ntd10,milk_Ntd30,bread_Ntd50,TTLAmt_Ntd,new java.sql.Date(d.getTime()));
				new implShoppad().add(s);			
			}
		});
	}
}


