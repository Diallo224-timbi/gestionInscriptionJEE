package sn.unipro.gestioninscription.java;

import java.util.Date;

import com.ibm.icu.util.Calendar;

import sn.gestionInscription.dao.InscriptionDao;
import sn.unipro.gestioninscription.modeles.Inscription;

public class GestionInscriptionStartInscription {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 8, 12);
		Date dateInscription =cal.getTime();
		Inscription inscription = new Inscription();
		InscriptionDao inscriptiondao = new InscriptionDao();
		
		inscription.setAnnee(2020);
		inscription.setDateInscription(dateInscription);
		inscription.setEtudiantId(1);
		inscription.setFormationId(1);
		inscription.setMontant(120000);
		
		inscriptiondao.save(inscription);
			
	}
}
