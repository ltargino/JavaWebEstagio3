package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import java.util.List;

public interface IAbstractDao<Entity> {
	
	public List<Entity> findAll();
	
	public Entity save(Entity entity);
	
	public boolean delete(Entity entity);
	
	public Entity procurarPorId(Long id);
	
}
