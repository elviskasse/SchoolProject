package a.b.c.test;


import java.util.List;
import java.util.stream.Collectors;

import a.b.c.dao.utility.FakeStudent;
import a.b.c.entity.Student;
import a.b.c.implement.StudentImplement;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentImplement studentImplement = new StudentImplement();
		
		System.out.println("( **************************WELCOME TO THE MAMADOU UNIVERSITY**********************)");
//		System.out.println("( **************************Liste des etudiants**********************)");
		 

		System.out.println("Student's Name and First Name : " + studentImplement.findAll().get(0).getNom() +" "+studentImplement.findAll().get(0).getPrenom());
		System.out.println("Student's Birthday : " + studentImplement.findAll().get(0).getBirthDate());
		System.out.println("Student's Birthday : " + studentImplement.findAll().get(0).getBirthDate());
		System.out.println(studentImplement.findAll().get(0).getPrenom());
		//System.out.println(studentImplement.findAll().get(0).getPrenom());
	//	System.out.println(studentImplement.findAll().get(0).getPrenom());
		System.out.println(studentImplement.findAll().get(0).getBirthDate());
		System.out.println(studentImplement.findAll().get(0).getNom());
		System.out.println(studentImplement.findAll().get(0).getAge());
		System.out.println();
		List<String> tous=studentImplement.searchStudentByNameOrPrenom("Ali").stream().map(Student::getNom).collect(Collectors.toList());
		studentImplement.searchStudentByNameOrPrenom("Ali").stream().forEach(s -> System.out.println(s.getNom()));
		System.out.println("------------------------------");
		System.out.println("a.b.c.test.TestStudent--34 -"+tous);
		System.out.println("--------------- NULL POINTER EXCEPTION---------------");
		studentImplement.searchStudentByNameOrPrenom(null).stream().forEach(s -> System.out.println(s.getNom()));
	}

}
