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

public class ControleurPostulation extends HttpServlet {
	private IOffre metier;

	public void init() throws ServletException {
		metier= new OffreImpl();
			}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mc = req.getParameter("id");
		int valeur = Integer.parseInt(mc);
		OffreModel model=new OffreModel();
		List<Offre> offres=metier.offreParMC(valeur);
		model.setOffres(offres);
		System.out.println(valeur);
		req.setAttribute("model", model);
		req.getRequestDispatcher("postuler.jsp").forward(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OffreModel model=new OffreModel();
		System.out.println("Con");
		//model.setMotCle(req.getParameter("motCle"));
		/*List<Offre> offres=metier.listoffres();
		model.setOffres(offres);
		req.setAttribute("model", model);*/
		req.getRequestDispatcher("postuler.jsp").forward(req,resp);
		doGet(req, resp);

		}
		
		
		
	}

	
