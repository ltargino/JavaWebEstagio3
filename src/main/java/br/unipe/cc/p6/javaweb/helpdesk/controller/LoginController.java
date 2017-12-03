package br.unipe.cc.p6.javaweb.helpdesk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.unipe.cc.p6.javaweb.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.helpdesk.service.UsuarioAdmService;
import br.unipe.cc.p6.javaweb.helpdesk.service.UsuarioClienteService;
import br.unipe.cc.p6.javaweb.helpdesk.service.UsuarioTecnicoService;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioAdmService usuarioAdmService;

	@Autowired
	private UsuarioClienteService usuarioClienteService;
	
	@Autowired
	private UsuarioTecnicoService usuarioTecnicoService;
	
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}
	
	public Void lembrarSenha (String email) {
		return null;
	} 
	
	@RequestMapping(value= {"/",""}, method = RequestMethod.GET)
	public String Login(ModelMap map) {
		Usuario usuario = new Usuario();
		map.addAttribute("usuario", usuario);
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String Login(@ModelAttribute("usuario") Usuario usuario_login, BindingResult result, ModelMap map, HttpSession session) {
		
		Usuario usuario_autenticado;
		
		if (usuario_login.getId() == null){
			usuario_autenticado = usuarioClienteService.procurarPorEmail(usuario_login.getEmail());
			
			if (usuario_autenticado == null)
				usuario_autenticado = usuarioTecnicoService.procurarPorEmail(usuario_login.getEmail());
	
			if (usuario_autenticado == null)
				usuario_autenticado = usuarioAdmService.procurarPorEmail(usuario_login.getEmail());
			
			if (usuario_autenticado == null) {
				map.addAttribute("erro", "E-mail informado inválido.");
				return "login";
			}
		} else {
			usuario_autenticado = usuarioClienteService.procurarPorId(usuario_login.getId());
			
			if (usuario_autenticado == null)
				usuario_autenticado = usuarioTecnicoService.procurarPorId(usuario_login.getId());
	
			if (usuario_autenticado == null)
				usuario_autenticado = usuarioAdmService.procurarPorId(usuario_login.getId());
			
			if (usuario_autenticado == null) {
				map.addAttribute("erro", "Matricula informada inválida.");
				return "login";
			}
		}
		
		if (usuario_autenticado.verificarSenha(usuario_login.getSenha())) {
			session.setAttribute("usuario_autenticado", usuario_autenticado);
			return "redirect:ticket/listar";
		} else {
			map.addAttribute("erro", "Senha informada inválida.");
			return "login";
		}
		
	}	
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String Logout(ModelMap map, HttpSession session) {
		session.removeAttribute("usuario_autenticado");
		return "redirect:/";
	}
	
}
