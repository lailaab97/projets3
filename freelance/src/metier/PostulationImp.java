package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import entities.Postulation;

public class PostulationImp implements IPostulation{
	public void addPostulation(Postulation P) {
		
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("insert into postulation (id_projet,id_freelancer,budget,dure,motivation) values (?,?,?,?,?)");
			ps.setInt(1,P.getId_projet());
			ps.setInt(2,P.getId_freelancer());
			ps.setInt(3,P.getBudget());
			ps.setString(4,P.getDure());
			ps.setString(5,P.getMotivation());
			//ps.setInt(6,P.getId_postulation());
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
}
	public List<Postulation> listPost() {
		// TODO Auto-generated method stub
		return null;
	}


}
