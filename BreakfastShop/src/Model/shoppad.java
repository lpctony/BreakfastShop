package Model;

import java.sql.Date;

import Dao.DateTimer;

public class shoppad {
	private Integer id;
	private String egg_Ntd10;
	private String milk_Ntd30;
	private String bread_Ntd50;
	private Integer TTLAmt_Ntd;
	private Date shopdate;
	
	public shoppad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public shoppad(String egg_Ntd10, String milk_Ntd30, String bread_Ntd50, Integer tTLAmt_Ntd, Date shopdate) {
		super();
		this.egg_Ntd10 = egg_Ntd10;
		this.milk_Ntd30 = milk_Ntd30;
		this.bread_Ntd50 = bread_Ntd50;
		this.TTLAmt_Ntd = tTLAmt_Ntd;
		this.shopdate = shopdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEgg_Ntd10() {
		return egg_Ntd10;
	}

	public void setEgg_Ntd10(String egg_Ntd10) {
		this.egg_Ntd10 = egg_Ntd10;
	}

	public String getMilk_Ntd30() {
		return milk_Ntd30;
	}

	public void setMilk_Ntd30(String milk_Ntd30) {
		this.milk_Ntd30 = milk_Ntd30;
	}

	public String getBread_Ntd50() {
		return bread_Ntd50;
	}

	public void setBread_Ntd50(String bread_Ntd50) {
		this.bread_Ntd50 = bread_Ntd50;
	}

	public Integer getTTLAmt_Ntd() {
		return TTLAmt_Ntd;
	}

	public void setTTLAmt_Ntd(Integer tTLAmt_Ntd) {
		TTLAmt_Ntd = tTLAmt_Ntd;
	}

	public Date getShopdate() {
		return shopdate;
	}

	public void setShopdate(Date shopdate) {
		this.shopdate = shopdate;
	}
	
	
	
	
	

}
