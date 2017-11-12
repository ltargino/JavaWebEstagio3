package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractDao<ModelType> extends JpaRepository<ModelType, Long>{

}
