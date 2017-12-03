package br.unipe.cc.p6.javaweb.helpdesk.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioAdm;

public interface UsuarioAdmDao extends JpaRepository<UsuarioAdm, Long> {
	
	@Query("select u from UsuarioAdm u where u.email = ?1")
	List<UsuarioAdm> procurarPorEmail(String email);
	
}
