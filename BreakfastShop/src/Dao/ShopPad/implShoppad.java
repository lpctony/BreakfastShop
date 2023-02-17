package Dao.ShopPad;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Dao.DbConnection;
import Dao.member.implMember;
import Model.member;
import Model.shoppad;

public class implShoppad implements shoppadDao{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void add(shoppad s) {
		Connection conn = DbConnection.getdb();
		String SQL = "insert into shoppad(egg_Ntd10,milk_Ntd30,bread_Ntd50,TTLAmt_Ntd,shopdate) " + "values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, s.getEgg_Ntd10());
			ps.setString(2, s.getMilk_Ntd30());
			ps.setString(3, s.getBread_Ntd50());
			ps.setInt(4, s.getTTLAmt_Ntd());
			ps.setDate(5, s.getShopdate());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<shoppad> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public shoppad queryId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public shoppad queryShopdate(Date shopDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void update(shoppad s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
		
	

}
