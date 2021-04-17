package sn.gestionInscription.dao;

import javax.persistence.EntityManager;

import sn.gestionInscription.util.JPAUtili;
import sn.unipro.gestioninscription.modeles.Etudiant;

public class EtudiantDao {
	private final static EntityManager entMgr =JPAUtili.getEntityManager();
	public void save(Etudiant etudiant) {
		entMgr.getTransaction().begin();
		entMgr.persist(etudiant);
		entMgr.getTransaction().commit();
		entMgr.clear();
	}
	public Etudiant update(Etudiant etudiant) {
		entMgr.getTransaction().begin();
		entMgr.merge(etudiant);
		entMgr.getTransaction().commit();
		entMgr.clear();
		return etudiant;
	}
	public void delete(Etudiant etudiant) {
		entMgr.getTransaction().begin();
		entMgr.remove(etudiant);
		entMgr.getTransaction().commit();
		entMgr.clear();
	}
	public Etudiant findById(int id) {
		return entMgr.find(Etudiant.class, id);
	}
}
