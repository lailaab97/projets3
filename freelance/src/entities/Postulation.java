package entities;

import java.io.Serializable;

public class Postulation implements Serializable {
	private Integer id_postulation;
	public Integer getId_postulation() {
		return id_postulation;
	}
	public void setId_postulation(Integer id_postulation) {
		this.id_postulation = id_postulation;
	}
	private Integer id_projet;
	private Integer id_freelancer;
	private Integer budget;
	private String motivation;
	private String dure;
	
	
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	public Integer getId_projet() {
		return id_projet;
	}
	public void setId_projet(Integer id_projet) {
		this.id_projet = id_projet;
	}
	public Integer getId_freelancer() {
		return id_freelancer;
	}
	public void setId_freelancer(Integer id_freelancer) {
		this.id_freelancer = id_freelancer;
	}
	public String getMotivation() {
		return motivation;
	}
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}
	public String getDure() {
		return dure;
	}
	public void setDure(String dure) {
		this.dure = dure;
	}
	
	
	public Postulation(Integer id_postulation, Integer id_projet, Integer id_freelancer, Integer budget,
			String motivation, String dure) {
		super();
		this.id_postulation = id_postulation;
		this.id_projet = id_projet;
		this.id_freelancer = id_freelancer;
		this.budget = budget;
		this.motivation = motivation;
		this.dure = dure;
	}
	public Postulation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
