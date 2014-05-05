package br.ufc.quixada.npi.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.quixada.npi.service.DisciplinaService;

@Controller
@RequestMapping("/disciplina")
public class DisciplinaServlet {
	
	@Inject
	private DisciplinaService ds;
	
	private static final long serialVersionUID = 1L;
	
	@RequestMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("disciplinas", ds.findAll());
		return "listar_disciplinas";
	}
	@RequestMapping("/buscar")
	public String buscar(ModelMap model, String disc) {
		model.addAttribute("disciplinas", ds.findByCod(disc));
		return "listar_disciplinas";
	}

	/*public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Disciplina> disciplinas = ds.findAll();
	
		request.setAttribute("disciplinas", disciplinas);
		RequestDispatcher rd = request.getRequestDispatcher("/listar_disciplinas.jsp");
		rd.forward(request, response);
	}*/

}
