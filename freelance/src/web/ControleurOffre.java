 package web;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Offre;
import metier.IOffre;
import metier.OffreImpl;
public class ControleurOffre extends HttpServlet {
	private IOffre metier;

	public void init() throws ServletException {
		metier= new OffreImpl();
			}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OffreModel model=new OffreModel();
		List<Offre> offres=metier.listoffres();
		req.setAttribute("model", model);
		model.setOffres(offres);
		req.getRequestDispatcher("FreelancerHome.jsp").forward(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OffreModel model=new OffreModel();
		System.out.println("Conne");
		//model.setMotCle(req.getParameter("motCle"));
		List<Offre> offres=metier.listoffres();
		model.setOffres(offres);
		req.setAttribute("model", model);
		req.getRequestDispatcher("FreelancerHome.jsp").forward(req,resp);
		doGet(req, resp);

		}
		
		
		
	}

	
