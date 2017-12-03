package br.unipe.cc.p6.javaweb.helpdesk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.cc.p6.javaweb.helpdesk.model.Notificacao;

public interface NotificacaoDao extends JpaRepository<Notificacao, Long> {

}
