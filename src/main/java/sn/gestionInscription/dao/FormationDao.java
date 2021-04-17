package sn.gestionInscription.dao;

import javax.persistence.EntityManager;

import sn.gestionInscription.util.JPAUtili;
import sn.unipro.gestioninscription.modeles.Formation;

public class FormationDao {
	private final static EntityManager ENTMGR=JPAUtili.getEntityManager();
	
	public void save(Formation formation) {
		ENTMGR.getTransaction().begin();
		ENTMGR.persist(formation);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();
	}
	public Formation update(Formation formation) {
		ENTMGR.getTransaction().begin();
		ENTMGR.merge(formation);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();
		return formation;
	}
	public void delete(Formation formation) {
		ENTMGR.getTransaction().begin();
		ENTMGR.remove(formation);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();
	}
	public Formation finById(int id) {
		return ENTMGR.find(Formation.class, id);
	}
}
