package sn.gestionInscription.dao;

import javax.persistence.EntityManager;

import sn.gestionInscription.util.JPAUtili;
import sn.unipro.gestioninscription.modeles.Inscription;

public class InscriptionDao {
	private final static EntityManager entMgr =JPAUtili.getEntityManager();
	
	public void save(Inscription inscription) {
		entMgr.getTransaction().begin();
		entMgr.persist(inscription);
		entMgr.getTransaction().commit();
		entMgr.clear();
	}
	public Inscription update(Inscription inscription) {
		entMgr.getTransaction().begin();
		entMgr.merge(inscription);
		entMgr.getTransaction();
		entMgr.clear();
		return inscription;
	}
	public void delete(Inscription inscription) {
		entMgr.getTransaction();
		entMgr.remove(inscription);
		entMgr.getTransaction().commit();
		entMgr.clear();
	}
	public Inscription findById(int id) {
		return entMgr.find(Inscription.class, id);
	}
}
