package br.unipe.cc.p6.javaweb.helpdesk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class AbstractService<DAO extends JpaRepository<Entity, Long>, Entity> {
	
	protected DAO dao;
	
	public DAO getDao() {
		return dao;
	}

	@Autowired
	public void setDao(DAO dao) {
        this.dao = dao;
    }
   
	public List<Entity> listar(){
		return dao.findAll();
	}

	public Entity salvar(Entity entity){
		return dao.save(entity);
	}

	public boolean deletar(Entity entity){
		try {
			dao.delete(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Entity procurarPorId(Long id) {
		return dao.findOne(id);
	}

}
