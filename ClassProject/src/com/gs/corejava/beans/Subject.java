package com.gs.corejava.beans;

public class Subject {
	
	private String name;
	private String teacherName;
	private String book;
	private int introducedYear;
	
	//setName(String subjectName)
	public void setName(String subjectName) {
		name = subjectName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIntroducedYear(int introducedYear) {
		//local variable
		//int introducedYear = 1990;
		//introducedYear pehle 1990
		this.introducedYear = introducedYear;
		//introducedYear now 2000
	}
	
	public int getIntroducedYear() {
		return introducedYear;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String bookP) {
		book = bookP;
	}


}
