package com.segundoservicio.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segundoservicio.models.StudentsMS;
import com.segundoservicio.rest.StudentsMicroSRest;

@Service("serviceFeign")
public class StudentsMSServiceFeign implements StudentsMSService{

	@Autowired
	private StudentsMicroSRest studentsMicrofeign;

	@Override
	public List<StudentsMS> findAll() {
		return studentsMicrofeign.listar().stream().map(p -> new StudentsMS()).collect(Collectors.toList());
	}

	@Override
	public StudentsMS findById(Integer student_id, Date date) {
		return new StudentsMS(studentsMicrofeign.detalle(student_id), date);
	}
}
