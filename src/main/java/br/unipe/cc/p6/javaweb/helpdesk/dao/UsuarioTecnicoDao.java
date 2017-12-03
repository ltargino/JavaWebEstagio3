package br.unipe.cc.p6.javaweb.helpdesk.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioTecnico;

public interface UsuarioTecnicoDao extends JpaRepository<UsuarioTecnico, Long> {
	@Query("select u from UsuarioTecnico u where u.email = ?1")
	List<UsuarioTecnico> procurarPorEmail(String email);
}
