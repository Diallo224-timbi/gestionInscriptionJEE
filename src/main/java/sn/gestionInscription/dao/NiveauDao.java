package sn.gestionInscription.dao;

import javax.persistence.EntityManager;

import sn.gestionInscription.util.JPAUtili;
import sn.unipro.gestioninscription.modeles.Niveau;

public class NiveauDao {
	private final static EntityManager ENTMGR = JPAUtili.getEntityManager();
	
	public void save(Niveau niveau) {
		ENTMGR.getTransaction().begin();
		ENTMGR.persist(niveau);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();
	}
	public Niveau update(Niveau niveau) {
		ENTMGR.getTransaction().begin();
		ENTMGR.merge(niveau);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();
		return niveau;
	}
	public void delete(Niveau niveau) {
		ENTMGR.getTransaction().begin();
		ENTMGR.remove(niveau);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();
	}
	public Niveau findById(int id) {
		return ENTMGR.find(Niveau.class, id);
	}
}
