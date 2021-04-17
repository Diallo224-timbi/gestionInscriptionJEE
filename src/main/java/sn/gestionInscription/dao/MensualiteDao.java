package sn.gestionInscription.dao;

import javax.persistence.EntityManager;

import sn.gestionInscription.util.JPAUtili;
import sn.unipro.gestioninscription.modeles.Mensualite;

public class MensualiteDao {
	private final static EntityManager ENTMGR =JPAUtili.getEntityManager();
	
	public void save(Mensualite mensualite) {
		ENTMGR.getTransaction().begin();
		ENTMGR.persist(mensualite);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();	
	}
	
	public Mensualite update(Mensualite mensualite) {
		ENTMGR.getTransaction().begin();
		ENTMGR.merge(mensualite);
		ENTMGR.getTransaction().commit();
		ENTMGR.clear();
		return mensualite;
	}
	public void delete(Mensualite mensualite) {
		ENTMGR.getTransaction().begin();
		ENTMGR.remove(mensualite);
	}
	public Mensualite findById(int id) {
		return ENTMGR.find(Mensualite.class, id);
	}
	
}
