package Dao.member;

import java.util.List;

import Model.member;

public interface memberDao {

	
	//Create新增 
	void add(member m);
		
	//Read 查詢
	List<member> queryAll();
	member queryId(int id); 
	member queryMember(String username,String password); 
	
	//Update 修改
	void update(member m); 
	
	//Delete 刪除 
	void delete(int id); 
}
