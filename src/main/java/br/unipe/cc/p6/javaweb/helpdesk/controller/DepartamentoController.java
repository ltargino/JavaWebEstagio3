package br.unipe.cc.p6.javaweb.helpdesk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.unipe.cc.p6.javaweb.helpdesk.model.Departamento;
import br.unipe.cc.p6.javaweb.helpdesk.service.DepartamentoService;

@Controller
@RequestMapping(value="/departamento")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@RequestMapping(value="/incluir", method=RequestMethod.GET)
	public String Incluir(ModelMap map) {
		Departamento departamento = new Departamento();
		map.addAttribute("departamento", departamento);
		return "departamento/incluir";
	}

	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String Editar(@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		
		Departamento departamento = departamentoService.procurarPorId(id);
		
		if (departamento != null) {
			map.addAttribute("departamento", departamento);
		}
		
		return "departamento/editar";
	}
	
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String Salvar (@ModelAttribute("departamento") Departamento departamento, BindingResult result, ModelMap map, HttpSession session) {
		departamentoService.salvar(departamento);
		return "redirect:listar";
	}
	
	@RequestMapping(value="/deletar/{id}", method = RequestMethod.GET)
	public String deletar (@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		departamentoService.deletar(departamentoService.procurarPorId(id));
		return "redirect:../listar";
	}
	
	@RequestMapping(value= {"","/","/listar"}, method=RequestMethod.GET)
	public String Listar(ModelMap map){
		map.addAttribute("departamentos", departamentoService.listar());
		return "departamento/listar";
	}


}
