package com.tnsif.classObj;

public class Student {
	int rollNo;
	String name;
	int m1,m2,m3;
	float per;
	
	Student(){
		System.out.println("Default constructor");
		
	}
	Student(int rollNo,String name,int m1,int m2,int m3){
		this.rollNo=rollNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		}
	void show()
	{
		per=(m1+m2+m3)/3.0f;
		System.out.println("student information");
		
		System.out.println("RollNo"+rollNo+"\tName"+name+"\tm1"+m1+"\tm2"+m2+"\tm3"+m3+"\tPercentage"+per);
	
	}
}


