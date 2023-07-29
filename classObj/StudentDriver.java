package com.tnsif.classObj;

public class StudentDriver {

	public static void main(String[] args) {
	


		Student s1=new Student();

		s1.rollNo=10;

		s1.name="Dipti";

		s1.m1=55;

		s1.m2=78;

		s1.m3=69;


		s1.show();


		Student s2=new Student(101,"Hrutika",50,70,90);

		s2.show();

		}

	
	}
