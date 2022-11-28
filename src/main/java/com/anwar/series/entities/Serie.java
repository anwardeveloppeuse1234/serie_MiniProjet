package com.anwar.series.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity

public class Serie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSerie;//id
	private String nomSerie;
	private Double prixSerie;
	private Date dateCreation;
	@ManyToOne
	private Genre genre;
	
	public Serie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Serie(String nomSerie, Double prixSerie, Date dateCreation) {
		super();
		this.nomSerie = nomSerie;
		this.prixSerie = prixSerie;
		this.dateCreation = dateCreation;
	}
	public Long getIdSerie() {
		return idSerie;
	}
	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}
	public String getNomSerie() {
		return nomSerie;
	}
	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}
	public Double getPrixSerie() {
		return prixSerie;
	}
	public void setPrixSerie(Double prixSerie) {
		this.prixSerie = prixSerie;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Serie [idSerie=" + idSerie + ", nomSerie=" + nomSerie + ", prixSerie=" + prixSerie
				+ ", dateCreation=" + dateCreation + "]";
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	

}
