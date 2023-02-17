package Dao.ShopPad;

import java.sql.Date;
import java.util.List;

import Model.member;
import Model.shoppad;

public interface shoppadDao {

	
		//Create新增 
		void add(shoppad s);
			
		//Read 查詢
		List<shoppad> queryAll();
		shoppad queryId(int id); 
		shoppad queryShopdate(Date shopDate); 
		
		//Update 修改
		void update(shoppad s); 
		
		//Delete 刪除 
		void delete(int id); 
}
