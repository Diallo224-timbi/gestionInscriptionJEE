package sn.unipro.gestioninscription.java;

import sn.gestionInscription.dao.MensualiteDao;
import sn.unipro.gestioninscription.modeles.Mensualite;
import sn.unipro.gestioninscription.modeles.Mois;

public class GestionMensualiteStart {

	public static void main(String[] args) {
		Mensualite mensualite = new Mensualite();
		MensualiteDao mensualitedao =new MensualiteDao();
		
		mensualite.setInscriptionId(1);
		mensualite.setMois(Mois.fromCode("jan"));
		mensualite.setMontant(50000);
		
		mensualitedao.save(mensualite);
	}

}
