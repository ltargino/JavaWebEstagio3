package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.UsuarioAdmDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;

@Service
public class UsuarioAdmService extends AbstractService <UsuarioAdmDao,  UsuarioAdm> {
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}

}
