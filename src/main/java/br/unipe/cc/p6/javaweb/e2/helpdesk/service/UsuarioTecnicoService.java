package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.UsuarioTecnicoDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico;

@Service
public class UsuarioTecnicoService extends AbstractService <UsuarioTecnicoDao,  UsuarioTecnico> {
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}
}