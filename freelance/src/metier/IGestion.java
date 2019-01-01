package metier;

import java.util.List;

import entities.Freelancer;

public interface IGestion {
	public void addFreelancer(Freelancer F);
	public List<Freelancer> listFreelancer();
	public Freelancer getFreelancer(String ref);
}