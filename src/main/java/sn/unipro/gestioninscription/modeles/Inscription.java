package sn.unipro.gestioninscription.modeles;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Inscription implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 4)
	private int annee;
	@Column(length = 7)
	private float montant;
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	@Column
	private int etudiantId;
	@Column
	private int formation_Id;
	@ManyToOne
	private Etudiant etudiant ;
	
	@ManyToOne
	private Formation formation;
	
	//@OneToMany(mappedBy = "inscription",)
	public int getId() {
		return id;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public int getEtudiantId() {
		return etudiantId;
	}
	public void setEtudiantId(int etudiantId) {
		this.etudiantId = etudiantId;
	}
	public int getFormationId() {
		return formation_Id;
	}
	public void setFormationId(int formationId) {
		this.formation_Id = formationId;
	}

}
