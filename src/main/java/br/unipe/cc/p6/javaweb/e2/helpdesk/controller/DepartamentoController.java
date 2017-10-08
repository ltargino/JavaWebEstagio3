package br.unipe.cc.p6.javaweb.e2.helpdesk.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Departamento;
import br.unipe.cc.p6.javaweb.e2.helpdesk.service.DepartamentoService;

public class DepartamentoController {
	
	@Autowired
	private DepartamentoService service;
	
	public Departamento salvar (Departamento departamento) {
		return service.salvar(departamento);
	}
	
	public Boolean deletar (Departamento departamento) {
		return service.deletar(departamento);
	}
	
	public Departamento procurarPorId(Long id) {
		return service.procurarPorId(id);
	}
	
	public List <Departamento> Listar () { 
		return service.listar();
	}

}
