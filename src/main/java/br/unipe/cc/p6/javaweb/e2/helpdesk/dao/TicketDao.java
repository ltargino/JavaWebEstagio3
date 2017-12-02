package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Long> {

}
