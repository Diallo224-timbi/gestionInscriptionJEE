package sn.unipro.gestioninscription.modeles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Mensualite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.STRING)
	@Column
	private Mois mois;
	@Column
	private double montant;
	@Column
	private int inscription_Id;
	public int getId() {
		return id;
	}
	public Mois getMois() {
		return mois;
	}
	public void setMois(Mois mois) {
		this.mois = mois;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getInscriptionId() {
		return inscription_Id;
	}
	public void setInscriptionId(int inscriptionId) {
		this.inscription_Id = inscriptionId;
	}
	
}
