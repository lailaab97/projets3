package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Login_Bean;
import metier.SingletonConnection;

public class AfficherPort {
public boolean check_user_name(Login_Bean obj_Login_Bean){
		
		boolean flag=false;
		
		
		Connection connection=SingletonConnection.getConnection();
		
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		
		try {
			
			String query="select * from freelancer where mail=? and mdp=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, obj_Login_Bean.getMail());
			ps.setString(2, obj_Login_Bean.getMdp());
			System.out.println(ps);
			System.out.println("Connection called");

			rs=ps.executeQuery();
			
			if(rs.next()){
				flag=true;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(connection!=null){
					connection.close();
					
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
		return flag;
		
	}
}