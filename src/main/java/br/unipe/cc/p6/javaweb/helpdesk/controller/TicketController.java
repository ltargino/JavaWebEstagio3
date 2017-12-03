package br.unipe.cc.p6.javaweb.helpdesk.controller;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.unipe.cc.p6.javaweb.helpdesk.model.Prioridade;
import br.unipe.cc.p6.javaweb.helpdesk.model.Status;
import br.unipe.cc.p6.javaweb.helpdesk.model.Ticket;
import br.unipe.cc.p6.javaweb.helpdesk.service.TicketService;

@Controller
@RequestMapping(value="/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@RequestMapping(value="/incluir", method=RequestMethod.GET)
	public String Incluir(ModelMap map) {
		Ticket ticket = new Ticket();
		map.addAttribute("ticket", ticket);
		map.addAttribute("prioridade", Arrays.asList(Prioridade.values()));
		map.addAttribute("status", Arrays.asList(Status.values()));
		return "ticket/incluir";
	}

	@RequestMapping(value="/editar/{id}", method=RequestMethod.GET)
	public String Editar(@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		
		Ticket ticket = ticketService.procurarPorId(id);
		
		if (ticket != null) {
			map.addAttribute("ticket", ticket);
			map.addAttribute("prioridade", Arrays.asList(Prioridade.values()));
			map.addAttribute("status", Arrays.asList(Status.values()));
		}
		
		return "ticket/editar";
	}
	
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String Salvar (@ModelAttribute("ticket") Ticket ticket, BindingResult result, ModelMap map, HttpSession session) {
		ticketService.salvar(ticket);
		return "redirect:listar";
	}
	
	@RequestMapping(value="/deletar/{id}", method = RequestMethod.GET)
	public String deletar (@PathVariable("id") Long id, ModelMap map, HttpSession session) {
		ticketService.deletar(ticketService.procurarPorId(id));
		return "redirect:../listar";
	}
	
	@RequestMapping(value= {"","/","/listar"}, method=RequestMethod.GET)
	public String Listar(ModelMap map){
		map.addAttribute("tickets", ticketService.listar());
		return "ticket/listar";
	}

}
