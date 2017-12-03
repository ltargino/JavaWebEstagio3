package br.unipe.cc.p6.javaweb.helpdesk.service;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.helpdesk.dao.TicketDao;
import br.unipe.cc.p6.javaweb.helpdesk.model.Ticket;

@Service
public class TicketService extends AbstractService <TicketDao,  Ticket> {
	public TicketService(TicketDao dao) {
		super.setDao(dao);
	}
	
}