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

import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioTecnico;
import br.unipe.cc.p6.javaweb.helpdesk.service.UsuarioTecnicoService;

@Controller
@RequestMapping(value="/usuario_tecnico")
public class UsuarioTecnicoController {

	@Autowired
	private UsuarioTecnicoService usuario_tecnicoService;
	
	@RequestMapping(value="/incluir", method=RequestMethod.GET)
	public String Incluir(ModelMap map) {
		UsuarioTecnico usuario_tecnico = new UsuarioTecnico();
		map.addAttribute("usuario_tecnico", usuario_tecnico);
		return "usuario_tecnico/incluir";
	}

	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String Editar(@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		
		UsuarioTecnico usuario_tecnico = usuario_tecnicoService.procurarPorId(id);
		
		if (usuario_tecnico != null) {
			map.addAttribute("usuario_tecnico", usuario_tecnico);
		}
		
		return "usuario_tecnico/editar";
	}
	
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String Salvar (@ModelAttribute("usuario_tecnico") UsuarioTecnico usuario_tecnico, BindingResult result, ModelMap map, HttpSession session) {
		usuario_tecnicoService.salvar(usuario_tecnico);
		return "redirect:listar";
	}
	
	@RequestMapping(value="/deletar/{id}", method = RequestMethod.GET)
	public String deletar (@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		usuario_tecnicoService.deletar(usuario_tecnicoService.procurarPorId(id));
		return "redirect:../listar";
	}
	
	@RequestMapping(value= {"","/","/listar"}, method=RequestMethod.GET)
	public String Listar(ModelMap map){
		map.addAttribute("usuarios_tecnicos", usuario_tecnicoService.listar());
		return "usuario_tecnico/listar";
	}
	
}
