package com.segundoservicio.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.segundoservicio.models.StudentsMS;
import com.segundoservicio.service.StudentsMSService;

public class StudentsMSController {

	@Autowired
	@Qualifier("serviceFeign")
	private StudentsMSService studentsMSService;
	
	@GetMapping("/Get")
	public List<StudentsMS> listar(){
		return studentsMSService.findAll();
	}
	
	@GetMapping("/Get/{id}/date/{date}")
	public StudentsMS detalle(@PathVariable Integer student_id, @PathVariable Date date) {
		return studentsMSService.findById(student_id, date);
	}
}
