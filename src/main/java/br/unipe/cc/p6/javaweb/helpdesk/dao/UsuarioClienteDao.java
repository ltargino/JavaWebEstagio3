package br.unipe.cc.p6.javaweb.helpdesk.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.unipe.cc.p6.javaweb.helpdesk.model.UsuarioCliente;

public interface UsuarioClienteDao extends JpaRepository<UsuarioCliente, Long> {
	@Query("select u from UsuarioCliente u where u.email = ?1")
	List<UsuarioCliente> procurarPorEmail(String email);
}
