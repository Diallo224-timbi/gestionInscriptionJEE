package sn.unipro.gestioninscription.java;

import sn.gestionInscription.dao.MensualiteDao;
import sn.unipro.gestioninscription.modeles.Mensualite;

public class GestionMensualiteStart {

	public static void main(String[] args) {
		Mensualite mensualite = new Mensualite();
		MensualiteDao mensualitedao =new MensualiteDao();
		
		mensualite.setInscriptionId(1);
		mensualite.setMois("Janvier");
		mensualite.setMontant(50000);
		
		mensualitedao.save(mensualite);
	}

}
