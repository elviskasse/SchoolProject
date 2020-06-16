package a.b.c.entity;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int id;
	public String nom;
	public String prenom;
	public List <Filiere> filiere;
	public String niveau;
	public int age;
	public double salaire;
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public List<Filiere> getFiliere() {
		return filiere;
	}
	public String getNiveau() {
		return niveau;
	}
	public int getAge() {
		return age;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setFiliere(List<Filiere> filiere) {
		this.filiere = filiere;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
	
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (Double.doubleToLongBits(salaire) != Double.doubleToLongBits(other.salaire))
			return false;
		return true;
	}
}
