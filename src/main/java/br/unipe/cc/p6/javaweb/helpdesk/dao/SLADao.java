package br.unipe.cc.p6.javaweb.helpdesk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.cc.p6.javaweb.helpdesk.model.SLA;

public interface SLADao extends JpaRepository<SLA, Long> {

}
