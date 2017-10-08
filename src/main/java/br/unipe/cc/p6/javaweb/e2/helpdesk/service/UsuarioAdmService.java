package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.UsuarioAdmDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;

public class UsuarioAdmService extends AbstractService <UsuarioAdmDao,  UsuarioAdm> {
	
	public UsuarioAdmService(UsuarioAdmDao dao) {
		super.setDao(dao);
	}
	
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}

}
