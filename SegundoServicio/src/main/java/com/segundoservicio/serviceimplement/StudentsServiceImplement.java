package com.segundoservicio.serviceimplement;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.segundoservicio.models.Students;
import com.segundoservicio.models.StudentsMS;
import com.segundoservicio.service.StudentsMSService;

@Service("serviceRestTemplate")
@FeignClient(name = "BoodCam",url= "https://localhost:8443")
public class StudentsServiceImplement implements StudentsMSService {

	@Autowired
	private RestTemplate studentsMSRest;

	@Override
	public List<StudentsMS> findAll() {
		List<Students> students = Arrays.asList(studentsMSRest.getForObject("https://localhost:8443/EverisProyect/Students/Get", Students[].class));

		Date date = null;
		return students.stream().map(p -> new StudentsMS(p,date)).collect(Collectors.toList());
	}
	
	
	

	@Override
	public StudentsMS findById(Integer student_id, Date date) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", student_id.toString());
		Students students = studentsMSRest.getForObject("https://localhost:8443/EverisProyect/Students/Get/{id}", Students.class, pathVariables);
		return new StudentsMS(students, date);
	}
}
