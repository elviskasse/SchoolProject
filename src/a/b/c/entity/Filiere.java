package a.b.c.entity;

import java.io.Serializable;
import java.util.List;

public class Filiere implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String id;
public String description;
public String niveau;
public List<Student> student;
public List<Teacher> teacher;
public List<Matiere> matiere;
public String getId() {
	return id;
}
public String getDescription() {
	return description;
}
public String getNiveau() {
	return niveau;
}
public List<Student> getStudent() {
	return student;
}
public List<Teacher> getTeacher() {
	return teacher;
}
public List<Matiere> getMatiere() {
	return matiere;
}
public void setId(String id) {
	this.id = id;
}
public void setDescription(String description) {
	this.description = description;
}
public void setNiveau(String niveau) {
	this.niveau = niveau;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public void setTeacher(List<Teacher> teacher) {
	this.teacher = teacher;
}
public void setMatiere(List<Matiere> matiere) {
	this.matiere = matiere;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((niveau == null) ? 0 : niveau.hashCode());
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
	Filiere other = (Filiere) obj;
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (niveau == null) {
		if (other.niveau != null)
			return false;
	} else if (!niveau.equals(other.niveau))
		return false;
	return true;
}

@Override
public String toString() {
	return "Filiere [id=" + id + ", description=" + description + ", niveau=" + niveau + ", student=" + student
			+ ", teacher=" + teacher + ", matiere=" + matiere + "]";
}






}
