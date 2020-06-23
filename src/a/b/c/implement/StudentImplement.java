package a.b.c.implement;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import a.b.c.dao.utility.FakeStudent;
import a.b.c.daoInterface.StudentInterface;
import a.b.c.entity.Filiere;
import a.b.c.entity.Student;


public class StudentImplement implements StudentInterface{
	private FakeStudent studentDao = new FakeStudent();

	@Override
	public Student findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student insertStudent(String nom, String prenom, int age, int niveau, Date birthDate, Filiere filiere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> searchStudentByNameOrPrenom(String nomOrPrenom) {		
		return studentDao.allStudent().stream().filter(s->{
			boolean t = null != nomOrPrenom;
			boolean n = t && null != s.getNom() && s.getNom().toLowerCase().contains(nomOrPrenom.toLowerCase());
			boolean p = t && null != s.getPrenom() && s.getPrenom().toLowerCase().contains(nomOrPrenom.toLowerCase());
			return n||p; 
			}).collect(Collectors.toList());
	}

	@Override
	public List<Student> findByKey(Date birthday) {
		
		return null;
	}

	@Override
	public List<Student> findAll() {		
		return studentDao.allStudent();
	}}
