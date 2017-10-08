package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.UsuarioTecnicoDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico;

public class UsuarioTecnicoService extends AbstractService <UsuarioTecnicoDao,  UsuarioTecnico> {
	
	public UsuarioTecnicoService(UsuarioTecnicoDao dao) {
		super.setDao(dao);
	}
	
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}
}