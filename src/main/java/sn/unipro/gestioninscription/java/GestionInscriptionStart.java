package sn.unipro.gestioninscription.java;

import sn.gestionInscription.dao.EtudiantDao;
import sn.gestionInscription.util.DateUtil;
import sn.unipro.gestioninscription.modeles.Etudiant;
import sn.unipro.gestioninscription.modeles.Sexe;

public class GestionInscriptionStart {
	public static void main(String[] args) {
		Etudiant etudiant =new Etudiant();
		Etudiant etudiant1 =new Etudiant();
		EtudiantDao etudiantdao=new EtudiantDao();
		
		etudiant.setNom("BAH");
		etudiant.setPrenom("FATIMA");
		etudiant.setSexe(Sexe.fromCode('m'));
		etudiant.setAdresse("Grand Dakar");
		etudiant.setMotPass("tiMbi223");
		etudiant.setEmail("maouloudoutimbi@gmail.com");
		etudiant.setNumero_carte("77 205 73 11");
		etudiant.setCni("O00329961");
		etudiant.setLieuNaissance("Timbi Madina");
		etudiant.setDateNaissance(DateUtil.createDate(12, 8, 1995));
		
		etudiant1.setNom("Barry");
		etudiant1.setPrenom("Aissatou");
		etudiant1.setAdresse("PIKINE");
		etudiant1.setSexe(Sexe.fromCode('f'));
		etudiant1.setMotPass("123456");
		etudiant1.setEmail("maouloudoutimbi@gmail.com");
		etudiant1.setNumero_carte("77 205 73 11");
		etudiant1.setCni("O00329961");
		etudiant1.setLieuNaissance("Timbi Madina");
		etudiant1.setDateNaissance(DateUtil.createDate(5, 01, 1998));
		
		etudiantdao.save(etudiant);
		etudiantdao.save(etudiant1);
		
	}
}
