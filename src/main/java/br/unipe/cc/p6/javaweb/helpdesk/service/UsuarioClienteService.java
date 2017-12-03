package br.unipe.cc.p6.javaweb.helpdesk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.helpdesk.dao.UsuarioClienteDao;
import br.unipe.cc.p6.javaweb.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioCliente;

@Service
public class UsuarioClienteService extends AbstractService <UsuarioClienteDao,  UsuarioCliente> {
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}
	
	public UsuarioCliente procurarPorEmail(String email){
		List<UsuarioCliente> usuarios = super.getDao().procurarPorEmail(email);
		
		if (usuarios.size() > 0) return usuarios.get(0);
		
		return null;		
	}	
	
}