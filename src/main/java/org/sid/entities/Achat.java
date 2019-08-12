package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="achat")
public class Achat implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String entreprise;
	@Temporal(TemporalType.DATE)
	private Date datedebut;
	private long nbtitre;
	private long prix;
	private long nbjour;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public long getNbtitre() {
		return nbtitre;
	}
	public void setNbtitre(long nbtitre) {
		this.nbtitre = nbtitre;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public long getNbjour() {
		return nbjour;
	}
	public void setNbjour(long nbjour) {
		this.nbjour = nbjour;
	}
	public Achat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Achat(String entreprise, Date datedebut, long nbtitre, long prix, long nbjour) {
		super();
		this.entreprise = entreprise;
		this.datedebut = datedebut;
		this.nbtitre = nbtitre;
		this.prix = prix;
		this.nbjour = nbjour;
	}
	
}
