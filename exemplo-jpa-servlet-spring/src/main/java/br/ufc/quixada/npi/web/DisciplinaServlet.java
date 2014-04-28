package br.ufc.quixada.npi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.ufc.quixada.npi.model.Disciplina;
import br.ufc.quixada.npi.service.DisciplinaService;

@WebServlet("/")
public class DisciplinaServlet extends HttpServlet {
	
	@Inject
	private DisciplinaService ds;
	
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Disciplina> disciplinas = ds.findAll();
	
		request.setAttribute("disciplinas", disciplinas);
		RequestDispatcher rd = request.getRequestDispatcher("/listar_disciplinas.jsp");
		rd.forward(request, response);
	}

}
