package a.b.c.test;

import a.b.c.implement.StudentIplement;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentIplement studentImplement = new StudentIplement();
System.out.println(studentImplement.findAll().get(0).getPrenom());
System.out.println(studentImplement.findAll().size());
	}

}
