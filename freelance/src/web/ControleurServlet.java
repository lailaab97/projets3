package web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.GestionImp;
import metier.IGestion;
import entities.Freelancer;

public class ControleurServlet extends HttpServlet {
	private IGestion metier;

	public void init() throws ServletException {
		metier= new GestionImp();
			}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonneModel model=new PersonneModel();
		req.setAttribute("odel", model);
		String action= req.getParameter("action");
		if(action.equals("save")) {
			try {
			model.getFreelancer().setNom(req.getParameter("nom"));
			model.getFreelancer().setPrenom(req.getParameter("prenom"));
			model.getFreelancer().setAdresse(req.getParameter("adresse"));
			model.getFreelancer().setTel(Integer.parseInt(req.getParameter("tel")));
			model.getFreelancer().setMail(req.getParameter("mail"));
			model.getFreelancer().setMdp(req.getParameter("mdp"));
			metier.addFreelancer(model.getFreelancer());

			model.setFreelancer((Freelancer) metier.listFreelancer());}
			catch(Exception e) {
				model.setErrors(e.getMessage());
			}
			
		}
		
		req.getRequestDispatcher("index.jsp").forward(req,resp);	
		
	}

	
}