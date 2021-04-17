package sn.unipro.gestioninscription.java;

import sn.gestionInscription.dao.NiveauDao;
import sn.unipro.gestioninscription.modeles.Niveau;

public class GestionInscriptionStartNiveau {

	public static void main(String[] args) {
		Niveau niveau= new Niveau();
		NiveauDao niveaudao=new NiveauDao();
		
		niveau.setLibelle("Master Genie Informatique");
		niveau.setPosition(1);
		niveaudao.save(niveau);
	}
}
