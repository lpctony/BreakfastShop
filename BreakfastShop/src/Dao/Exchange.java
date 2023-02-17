package Dao;

import javax.swing.JTextArea;

public class Exchange {
	public static String change(int showPay,int showTotal) {
		Integer diff = showPay - showTotal;
		String changeOutput = "";
		if (showPay>=showTotal && diff >= 0) {
			int count1000 = 0;
			int count500 = 0;
			int count100 = 0;
			int count50 = 0;
			int count10 = 0;
			int count5 = 0;
			int count1 = 0;

			if (diff / 1000 >= 1) {
				count1000 = diff / 1000;
				diff = diff - count1000 * 1000;
			}
			if (diff / 500 >= 1) {
				count500 = diff / 500;
				diff = diff - count500 * 500;
			}
			if (diff / 100 >= 1) {
				count100 = diff / 100;
				diff = diff - count100 * 100;
			}
			if (diff / 50 >= 1) {
				count50 = diff / 50;
				diff = diff - count50 * 50;
			}
			if (diff / 10 >= 1) {
				count10 = diff / 10;
				diff = diff - count10 * 10;
			}
			if (diff / 5 >= 1) {
				count5 = diff / 5;
				diff = diff - count5 * 5;
			}
			if (diff / 1 >= 1) {
				count1 = diff / 1;
				diff = diff - count1;
			}
			
			changeOutput = ("Pay NTD " + showPay + "  \n Total Amount NTD " + showTotal + "\nExchange NTD " + (showPay - showTotal)
					+ "\n NTD 1000 for " + count1000 + "  Bill" + "\n NTD 500 for " + count500 + " Bill" + "\n NTD 100 for " + count100 + " Bill"
					+ "\n NTD 50 for " + count50 + "\tCoin" + "\n NTD 10 for " + count10 + "\tCoin" + "\n NTD 5 for " + count5 + "\tCoin" + "\n NTD 1 for "
					+ count1 + "\tCoin");
		}
		return changeOutput;
}
}
