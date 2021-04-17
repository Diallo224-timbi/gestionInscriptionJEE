package sn.unipro.gestioninscription.java;

import java.util.Date;

import com.ibm.icu.util.Calendar;

import sn.gestionInscription.dao.EtudiantDao;
import sn.unipro.gestioninscription.modeles.Etudiant;

public class GestionInscriptionStart {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1995, 8, 12);
		Date dateNaissance =cal.getTime();
		Etudiant etudiant =new Etudiant();
		Etudiant etudiant1 =new Etudiant();
		EtudiantDao etudiantdao=new EtudiantDao();
		
		etudiant.setNom("BAH");
		etudiant.setPrenom("FATIMA");
		etudiant.setAdresse("Grand Dakar");
		etudiant.setMotPass("123456");
		etudiant.setEmail("maouloudoutimbi@gmail.com");
		etudiant.setNumero_carte("77 205 73 11");
		etudiant.setCni("O00329961");
		etudiant.setLieuNaissance("Timbi Madina");
		etudiant.setDateNaissance(dateNaissance);
		
		etudiant1.setNom("Barry");
		etudiant1.setPrenom("Aissatou");
		etudiant1.setAdresse("PIKINE");
		etudiant1.setMotPass("123456");
		etudiant1.setEmail("maouloudoutimbi@gmail.com");
		etudiant1.setNumero_carte("77 205 73 11");
		etudiant1.setCni("O00329961");
		etudiant1.setLieuNaissance("Timbi Madina");
		etudiant1.setDateNaissance(dateNaissance);
		
		etudiantdao.save(etudiant);
		etudiantdao.save(etudiant1);
		
	}
}
