package com.segundoservicio.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

public class StudentsMS {

	private Students students;
	private Date date;

//		constructors
	public StudentsMS() {
	}

	public StudentsMS(Students students, Date date) {
		this.students = students;
		this.date = date;
	}

	// Generate Getters and Setters
	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
