package com.segundoservicio.rest;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.segundoservicio.models.Students;

@FeignClient(name = "BoodCam")
public interface StudentsMicroSRest {

	@GetMapping("/Get")
	public List<Students> listar();
	
	@GetMapping("/Get/{id}")
	public Students detalle(@PathVariable Integer students_id);
}
