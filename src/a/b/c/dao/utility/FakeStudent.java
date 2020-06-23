package a.b.c.dao.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import a.b.c.entity.Filiere;
import a.b.c.entity.Matiere;
import a.b.c.entity.Student;

public class FakeStudent {

 public List <Student> allStudent() {
	 List<Student>students = new ArrayList<>();
//	 List<Matiere> matieres = new ArrayList<Matiere>();
//	 Matiere matiere = new Matiere();
//	 matiere.setId(1);
//	 //matiere.setNom("mathematiques");
//	 matiere.setNom("physiques");
//	 matieres.add(matiere);
//	 
//	 Matiere matiere2 = new Matiere();
//	 matiere2.setNom("mathematiques");
//	 //matiere2.setNom("physiques");
//	 matieres.add(matiere2);
//	 
//	 Matiere progJava = new Matiere();
//	 progJava.setNom("JavaEE");
//	 //matiere2.setNom("physiques");
//	 matieres.add(progJava);
	 
	 Filiere filiere = new Filiere();
	 filiere.setId("Mecatronique");
	 filiere.setDescription("ing mecanique");
	 //filiere.setMatiere(matieres);
	 filiere.setMatiere(getPhysicMatiere());
	 filiere.setNiveau("1");
	 filiere.setTeacher(null);
	 
	 Filiere filiereInfo = new Filiere();
	 filiereInfo.setId("INF");
	 filiereInfo.setDescription("ing informatique");
	 filiereInfo.setMatiere(this.getInfoMatiere());
	 filiereInfo.setNiveau("1");
	 filiereInfo.setTeacher(null);
	 
	 Student st =new Student();
	 st.setId(1001L);
	 st.setAge(18);
	 st.setNiveau("1");
	 st.setNom("Mamadou");
	 st.setPrenom("Ali");
	 st.setBirthDate(new Date(1999, 12, 30));
	 st.setRegistrationDate(new Date());
	 st.setFiliere(filiere);
	 st.setMatiere(this.getInfoMatiere());
	 st.setMoyenne(0);
	 students.add(st);
	 
	return students;
	}

public List<Matiere> getInfoMatiere() {
	List<Matiere> matieres = new ArrayList<Matiere>();
	 Matiere matiere = new Matiere();
	 matiere.setId(1);	 
	 matiere.setNom("physiques");
	 matieres.add(matiere);
	 
	 Matiere matiere2 = new Matiere();
	 matiere2.setId(2);
	 matiere2.setNom("mathematiques");	 
	 matieres.add(matiere2);
	 
	 Matiere progJava = new Matiere();
	 progJava.setId(3);
	 progJava.setNom("JavaEE");	 
	 matieres.add(progJava);
	 
	 
	 
	return matieres;
}

public List<Matiere> getPhysicMatiere() {                            
	List<Matiere> matieres = new ArrayList<Matiere>();
	List<Matiere> matieresPh = new ArrayList<Matiere>();
	
	 Matiere matiere = new Matiere();
	 matiere.setId(1);	 
	 matiere.setNom("physiques");
	 
	 
	 Matiere matiere2 = new Matiere();
	 matiere2.setId(2);
	 matiere2.setNom("physiques2");	 
	 
	 
	 Matiere progJava = new Matiere();
	 progJava.setId(3);
	 progJava.setNom("physiques3");	
	 
	 
	 
	 Matiere quantique = new Matiere();
	 quantique.setId(4);
	 quantique.setNom("QuanticPhysic");
	 
	 matieres.add(matiere);
	 matieres.add(matiere2);
	 matieres.add(progJava);
	 matieres.add(quantique);
	
	
	for (int i = 0 ; i<5; i++) {
	Matiere mat = new Matiere();
	mat.setId(i+1);
	mat.setNom("Atomistic-"+i);
	matieres.add(mat);
	}
	
	
	
	for (int i = 1 ; i<6; i++) {
	Matiere matiereSeco = new Matiere(i,"Se_"+i );
	matieres.add(matiereSeco);
	}
	
	//List<Matiere> matieresTest = matieres;
	List<Matiere> matieresTest = new ArrayList<Matiere>();
	
// toDo every object's name  should start with PH_ option using java stream	 
//	return  matieres.stream().map(m -> m.setNom("PH_"+m.getNom()));
	
	List<String> onlyMaterialName =  matieres.stream().map(m -> "PH_"+m.getNom()).collect(Collectors.toList());
	//return onlyMaterialName;
	
	
	for (Matiere matierePH : matieres) {
		matierePH.setNom("PH__"+matierePH.getNom());
		matieresTest.add(matierePH);
		System.out.println ("Added "+matierePH.getNom()+" to List");
	}
	System.out.println ("Total elements on list matieresTest = "+matieresTest.size());
	System.out.println ("======== List of string =============== ");
	System.out.println (onlyMaterialName);
	System.out.println ("Cooelction of Matiere"+matieres);
	//return matieresPh;
	return matieres.stream().map(m -> {
		m.setNom("PH_".concat(m.getNom()));
		return m;
		}).collect(Collectors.toList());
	
	
	      
	//for (Matiere result : matieres) {
	//	return System.out.println (matieres);
	//}
	
	//return matieres;
	
	/*
	 * return matieres.stream().map(tmp -> { return new Matiere(tmp.getId(),
	 * "PH_"+tmp.getNom()).setStudent(tmp.getStudent());
	 * 
	 * })
	 */
			//.filter(mate->mate.setNom("PH_"+mate.getNom()))
	       //.collect(Collectors.toList());
	       //.forEach(System.out::println);
	
			//.filter(mat -> mat.setNom("PH_"+ m.getNom()))
		//	.collect(Collectors.toList());
	//
		
	
}
	
public List<Matiere> getMecatronicMatiere() {
	//List<Matiere> result = new ArrayList<Matiere>(this.getPhysicMatiere());
	List<Matiere> result = new ArrayList<Matiere>();
	result.addAll(this.getInfoMatiere());
	
	return result;
	
}
	

}