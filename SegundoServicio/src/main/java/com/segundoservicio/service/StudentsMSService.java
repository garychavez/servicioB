package com.segundoservicio.service;

import java.util.Date;
import java.util.List;

import com.segundoservicio.models.StudentsMS;

public interface StudentsMSService {
	
	public List<StudentsMS> findAll();
	
	
	public StudentsMS findById(Integer student_id, Date date);
}
