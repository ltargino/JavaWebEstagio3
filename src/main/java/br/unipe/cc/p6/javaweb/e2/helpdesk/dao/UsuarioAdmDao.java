package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;

public interface UsuarioAdmDao extends JpaRepository<UsuarioAdm, Long> {
}
