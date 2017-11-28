package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.UsuarioClienteDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;

@Service
public class UsuarioClienteService extends AbstractService <UsuarioClienteDao,  UsuarioCliente> {
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}
}