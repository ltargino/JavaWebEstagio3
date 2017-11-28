package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import org.springframework.stereotype.Service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.TicketDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket;

@Service
public class TicketService extends AbstractService <TicketDao,  Ticket> {
	public TicketService(TicketDao dao) {
		super.setDao(dao);
	}
	
}