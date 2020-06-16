package a.b.c.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Student implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	
	public Long id;
	public String nom;
	public String prenom;
	public Filiere filiere;
	public String niveau;
	public int age;
	public Date birthDate;
	public Date registrationDate;
	public int moyenne;
	public List<Matiere>matiere;
	public Long getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public String getNiveau() {
		return niveau;
	}
	public int getAge() {
		return age;
	}
	public int getMoyenne() {
		return moyenne;
	}
	public List<Matiere> getMatiere() {
		return matiere;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMoyenne(int moyenne) {
		this.moyenne = moyenne;
	}
	public void setMatiere(List<Matiere> matiere) {
		this.matiere = matiere;
	}
	

	public Date getBirthDate() {
		return birthDate;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((filiere == null) ? 0 : filiere.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matiere == null) ? 0 : matiere.hashCode());
		result = prime * result + moyenne;
		result = prime * result + ((niveau == null) ? 0 : niveau.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (filiere == null) {
			if (other.filiere != null)
				return false;
		} else if (!filiere.equals(other.filiere))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matiere == null) {
			if (other.matiere != null)
				return false;
		} else if (!matiere.equals(other.matiere))
			return false;
		if (moyenne != other.moyenne)
			return false;
		if (niveau == null) {
			if (other.niveau != null)
				return false;
		} else if (!niveau.equals(other.niveau))
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
		return true;
	}
	

}
