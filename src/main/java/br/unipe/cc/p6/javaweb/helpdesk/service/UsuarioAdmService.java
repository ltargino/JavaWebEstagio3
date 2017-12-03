package br.unipe.cc.p6.javaweb.helpdesk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.helpdesk.dao.UsuarioAdmDao;
import br.unipe.cc.p6.javaweb.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioAdm;

@Service
public class UsuarioAdmService extends AbstractService <UsuarioAdmDao,  UsuarioAdm> {
	
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}

	public UsuarioAdm procurarPorEmail(String email){
		List<UsuarioAdm> usuarios = super.getDao().procurarPorEmail(email);
		
		if (usuarios.size() > 0) return usuarios.get(0);
		
		return null;
	}
	
}
