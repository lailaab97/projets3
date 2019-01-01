package web;
import java.util.ArrayList;
import java.util.List;


import entities.Freelancer;
import entities.Freelancer;

public class PersonneModel {
	private entities.Freelancer freelancer=new entities.Freelancer();
	private List<Freelancer> freelancers=new ArrayList<Freelancer>();
	private String errors;
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	public List<Freelancer> getFreelancers() {
		return freelancers;
	}
	public void setFreelancers(List<Freelancer> freelancers) {
		this.freelancers = freelancers;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	
}