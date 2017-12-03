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

import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioAdm;
import br.unipe.cc.p6.javaweb.helpdesk.service.UsuarioAdmService;

@Controller
@RequestMapping(value="/usuario_adm")
public class UsuarioAdmController {

	@Autowired
	private UsuarioAdmService usuario_admService;
	
	@RequestMapping(value="/incluir", method=RequestMethod.GET)
	public String Incluir(ModelMap map) {
		UsuarioAdm usuario_adm = new UsuarioAdm();
		map.addAttribute("usuario_adm", usuario_adm);
		return "usuario_adm/incluir";
	}

	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String Editar(@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		
		UsuarioAdm usuario_adm = usuario_admService.procurarPorId(id);
		
		if (usuario_adm != null) {
			map.addAttribute("usuario_adm", usuario_adm);
		}
		
		return "usuario_adm/editar";
	}
	
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String Salvar (@ModelAttribute("usuario_adm") UsuarioAdm usuario_adm, BindingResult result, ModelMap map, HttpSession session) {
		usuario_admService.salvar(usuario_adm);
		return "redirect:listar";
	}
	
	@RequestMapping(value="/deletar/{id}", method = RequestMethod.GET)
	public String deletar (@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		usuario_admService.deletar(usuario_admService.procurarPorId(id));
		return "redirect:../listar";
	}
	
	@RequestMapping(value= {"","/","/listar"}, method=RequestMethod.GET)
	public String Listar(ModelMap map){
		map.addAttribute("usuarios_adm", usuario_admService.listar());
		return "usuario_adm/listar";
	}	
	
}
