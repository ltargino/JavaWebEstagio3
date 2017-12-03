package br.unipe.cc.p6.javaweb.helpdesk.service;

import br.unipe.cc.p6.javaweb.helpdesk.model.Usuario;

import java.util.List;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.helpdesk.dao.UsuarioTecnicoDao;
import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioTecnico;

@Service
public class UsuarioTecnicoService extends AbstractService <UsuarioTecnicoDao,  UsuarioTecnico> {
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}
	
	public UsuarioTecnico procurarPorEmail(String email){
		List<UsuarioTecnico> usuarios = super.getDao().procurarPorEmail(email);
		if (usuarios.size() > 0) return usuarios.get(0);
		
		return null;		
	}	
	
}