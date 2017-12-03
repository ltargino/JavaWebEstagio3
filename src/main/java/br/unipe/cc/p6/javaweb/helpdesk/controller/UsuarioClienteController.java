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

import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioCliente;
import br.unipe.cc.p6.javaweb.helpdesk.service.UsuarioClienteService;

@Controller
@RequestMapping(value="/usuario_cliente")
public class UsuarioClienteController {
	
	@Autowired
	private UsuarioClienteService usuario_clienteService;
	
	@RequestMapping(value="/incluir", method=RequestMethod.GET)
	public String Incluir(ModelMap map) {
		UsuarioCliente usuario_cliente = new UsuarioCliente();
		map.addAttribute("usuario_cliente", usuario_cliente);
		return "usuario_cliente/incluir";
	}

	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String Editar(@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		
		UsuarioCliente usuario_cliente = usuario_clienteService.procurarPorId(id);
		
		if (usuario_cliente != null) {
			map.addAttribute("usuario_cliente", usuario_cliente);
		}
		
		return "usuario_cliente/editar";
	}
	
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String Salvar (@ModelAttribute("usuario_cliente") UsuarioCliente usuario_cliente, BindingResult result, ModelMap map, HttpSession session) {
		usuario_clienteService.salvar(usuario_cliente);
		return "redirect:listar";
	}
	
	@RequestMapping(value="/deletar/{id}", method = RequestMethod.GET)
	public String deletar (@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		usuario_clienteService.deletar(usuario_clienteService.procurarPorId(id));
		return "redirect:../listar";
	}
	
	@RequestMapping(value= {"","/","/listar"}, method=RequestMethod.GET)
	public String Listar(ModelMap map){
		map.addAttribute("usuarios_clientes", usuario_clienteService.listar());
		return "usuario_cliente/listar";
	}
	
}
