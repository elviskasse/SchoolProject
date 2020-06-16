package a.b.c.dao.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import a.b.c.entity.Filiere;
import a.b.c.entity.Matiere;
import a.b.c.entity.Student;

public class FakeStudent {

 public List <Student> allStudent() {
	 List<Student>students = new ArrayList<>();
	 List<Matiere> matieres = new ArrayList<Matiere>();
	 Matiere matiere = new Matiere();
	 matiere.setId(1);
	 matiere.setNom("mathematiques");
	 matieres.add(matiere);
	 
	 Filiere filiere = new Filiere();
	 filiere.setId("Mecatronique");
	 filiere.setDescription("ing mecanique");
	 filiere.setMatiere(matieres);
	 filiere.setNiveau("1");
	 filiere.setTeacher(null);
	 
	 Student st =new Student();
	 st.setId(1001L);
	 st.setAge(18);
	 st.setNiveau("1");
	 st.setNom("Mamadou");
	 st.setPrenom("mamadou");
	 st.setBirthDate(new Date(1999, 12, 30));
	 st.setRegistrationDate(new Date());
	 st.setFiliere(filiere);
	 st.setMatiere(matieres);
	 st.setMoyenne(0);
	 students.add(st);
	 
	return students;
	};
	

}