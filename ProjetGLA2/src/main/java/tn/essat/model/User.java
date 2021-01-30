package tn.essat.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class User {
private Integer id;
private String nom;
private String prenom;
@OneToMany
private List<Livre> livres;
public User(String nom, String prenom, List<Livre> livres) {
	super();
	
	this.nom = nom;
	this.prenom = prenom;
	this.livres = livres;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public List<Livre> getLivres() {
	return livres;
}
public void setLivres(List<Livre> livres) {
	this.livres = livres;
}



}
