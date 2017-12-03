package br.unipe.cc.p6.javaweb.helpdesk.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id") 
public class UsuarioAdm extends Usuario {

	public UsuarioAdm(String senha, String nome, String email) {
		super(senha, nome, email);
	}
	
	public UsuarioAdm() {
	}

}
