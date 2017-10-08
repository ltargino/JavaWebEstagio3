package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.IModel;

public class AbstractDao<Entity extends IModel> implements IAbstractDao<Entity>{

	private EntityManager manager;
	
	private Class<Entity> classOfEntity;
	
	public AbstractDao(EntityManager manager, Class<Entity> classOfEntity) {
		this.manager = manager;
		this.classOfEntity = classOfEntity;
	}

	@Override
	public List<Entity> findAll() {
		manager.getTransaction().begin();
		List<Entity> list = manager.createQuery("SELECT d FROM "+classOfEntity.getName()+" d",classOfEntity).getResultList();
		manager.getTransaction().commit();
		return list;
	}

	@Override
	public Entity save(Entity entity) {
		manager.getTransaction().begin();

		if (entity.getId() == null) {
			manager.persist(entity);
		} else {
			manager.merge(entity);
		}

		manager.getTransaction().commit();
		
		return entity;
	}

	@Override
	public boolean delete(Entity entity) {
		try {
			manager.getTransaction().begin();
			manager.remove(entity);
			manager.getTransaction().commit();
			return true;
		} catch(Exception ex) {
			return false;
		}
	}

	@Override
	public Entity procurarPorId(Long id) {
		manager.getTransaction().begin();
		Entity entity = manager.find(classOfEntity, id);
		manager.getTransaction().commit();
		return entity;
	}
	
}
