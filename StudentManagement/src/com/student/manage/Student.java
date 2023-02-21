package com.student.manage;

public class Student {
	private int StudentId;
	private String StudentName;
	private String StudentPhoneNo;
	private String StudentCity;
	
	
	
	
	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentPhoneNo() {
		return StudentPhoneNo;
	}

	public void setStudentPhoneNo(String studentPhoneNo) {
		StudentPhoneNo = studentPhoneNo;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	

	public Student(int studentId, String studentName, String studentPhoneNo, String studentCity) {
		super();
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.StudentPhoneNo = studentPhoneNo;
		this.StudentCity = studentCity;
	}
	
	public Student(String studentName, String studentPhoneNo, String studentCity) {
		super();
		this.StudentName = studentName;
		this.StudentPhoneNo = studentPhoneNo;
		this.StudentCity = studentCity;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentPhoneNo=" + StudentPhoneNo
				+ ", StudentCity=" + StudentCity + "]";
	}
	

}
