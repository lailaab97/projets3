package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entities.Freelancer;

public class GestionImp implements IGestion{

	public void addFreelancer(Freelancer F) {
		
			Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps=conn.prepareStatement
						("insert into freelancer (nom,prenom,adresse,tel,mail,mdp) values (?,?,?,?,?,?)");
				ps.setString(1,F.getNom());
				ps.setString(2,F.getPrenom());
				ps.setString(3,F.getAdresse());
				ps.setInt(4,F.getTel());
				ps.setString(5,F.getMail());
				ps.setString(6,F.getMdp());
				ps.executeUpdate();
				ps.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}
	}

	@Override
	public List<Freelancer> listFreelancer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Freelancer getFreelancer(String ref) {
		// TODO Auto-generated method stub
		return null;
	}
}

