package Dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Member;

import Dao.DbConnection;
import Model.member;

public class implMember implements memberDao {

	public static void main(String[] args) {
		
		 member m=new member ("123","123", "123", "123","123", "123");
	 new implMember().add(m);
	}

	@Override
	public void add(member m) {
		Connection conn = DbConnection.getdb();
		String SQL = "insert into addmember(name,username,password,address,mob,tel)" + "values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getMob());
			ps.setString(6, m.getTel());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<member> queryAll() {
		Connection conn = DbConnection.getdb();
		String SQL = "select * from member";
		List<member> l = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				member m = new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMob(rs.getString("mob"));
				m.setTel(rs.getString("tel"));
				l.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;

	}
	
	@Override
	public member queryMember(String username, String password) {
		Connection conn=DbConnection.getdb(); 
		String SQL="select * from addmember where username=? and password=?"; 
		member m=null; 
	 
	try { 
		PreparedStatement ps=conn.prepareStatement(SQL); 
		ps.setString(1, username); 
		ps.setString(2, password); 
		ResultSet rs=ps.executeQuery(); 
	 
	if(rs.next()) 
	{ 
		m=new member(); 
		m.setId(rs.getInt("id")); 
		m.setName(rs.getString("name")); 
		m.setUsername(rs.getString("username")); 
		m.setPassword(rs.getString("password")); 
		m.setAddress(rs.getString("address")); 
		m.setMob(rs.getString("mob")); 
		m.setTel(rs.getString("tel")); 
	} 
	} catch (SQLException e) { 
		// TODO Auto-generated catch block 
		e.printStackTrace(); 
	} 
	 
	 
	 
	 
	 
	return m; 
	} 
	
	
	@Override
	public member queryId(int id) {
		Connection conn=DbConnection.getdb();
		String SQL="select * from member where id=?";
		member m=null;
		try { 
			PreparedStatement ps=conn.prepareStatement(SQL); 
			ps.setInt(1, id); 
			ResultSet rs=ps.executeQuery(); 
			if(rs.next()) 
			{ 
			m=new member(); 
			m.setId(rs.getInt("id")); 
			m.setName(rs.getString("name")); 
			m.setUsername(rs.getString("username")); 
			m.setPassword(rs.getString("password")); 
			m.setAddress(rs.getString("address")); 
			m.setMob(rs.getString("mob")); 
			m.setTel(rs.getString("tel")); 
			} 
			 
			} catch (SQLException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
			} 
		return null;
	}
	
	public boolean queryUser(String username) { 
		
		Connection conn=DbConnection.getdb(); 
		String SQL="select * from addmember where username=?"; 
		boolean m=false; 
		PreparedStatement ps; 
		try { 
		ps = conn.prepareStatement(SQL); 
		ps.setString(1, username); 
		ResultSet rs=ps.executeQuery(); 
		if(rs.next()) m=true; 
		 
		} catch (SQLException e) { 
		// TODO Auto-generated catch block 
		e.printStackTrace(); 
		}
		return m;
		
	}
	
	
	@Override
	public void update(member m) {
		Connection conn=DbConnection.getdb(); 
		String SQL="update member set name=?,username=?,password=?,address=?,mobile=?,phone=?" 
		+ " where id=?"; 
	try { 
		PreparedStatement ps=conn.prepareStatement(SQL); 
		ps.setString(1, m.getName()); 
		ps.setString(2, m.getUsername()); 
		ps.setString(3, m.getPassword()); 
		ps.setString(4, m.getAddress()); 
		ps.setString(5,m.getMob()); 
		ps.setString(6, m.getTel()); 
		ps.setInt(7, m.getId()); 
	 
		ps.executeUpdate(); 
	 
	} catch (SQLException e) { 
		// TODO Auto-generated catch block 
		e.printStackTrace(); 
	} 

	}

	@Override
	public void delete(int id) {
		Connection conn=DbConnection.getdb(); 
		String SQL="delete from member where id=?"; 
		try { 
		PreparedStatement ps=conn.prepareStatement(SQL); 
		ps.setInt(1, id); 
		 
		ps.executeUpdate(); 
		} catch (SQLException e) { 
		// TODO Auto-generated catch block 
		e.printStackTrace(); 
		}

	}

	

}
