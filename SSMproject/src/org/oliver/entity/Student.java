package org.oliver.entity;

public class Student {
	//12345abc
	private int stuNo;
	private String name;
	private int age;
	private boolean stuSex;

	
	
	public Student() {
		
	}



	public Student(int stuNo, String name, int age, boolean stuSex) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
		this.stuSex = stuSex;
	}



	public int getStuNo() {
		return stuNo;
	}



	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public boolean isStuSex() {
		return stuSex;
	}



	public void setStuSex(boolean stuSex) {
		this.stuSex = stuSex;
	}



	@Override
	public String toString() {
		return "stuNo=" + stuNo + ", name=" + name + ", age=" + age + ", stuSex=" + stuSex ;
	}



	
}
