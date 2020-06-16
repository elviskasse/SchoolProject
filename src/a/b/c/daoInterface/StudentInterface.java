package a.b.c.daoInterface;

import java.util.Date;
import java.util.List;

import a.b.c.entity.*;

public interface StudentInterface {
public Student findOne(Long id);
public Student  insertStudent(String nom,String prenom,int age, int niveau,Date birthDate,Filiere filiere);
public void  deleteStudent(Long id);
public Student  updateStudent(Student student);
public List <Student>  searchStudentByNameOrPrenom(String nom);
public List<Student>  findByKey(Date  birthday);
public List <Student>findAll();
}


