package com.studentsdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentsdetails.entity.Student;
import com.studentsdetails.exception.AgeException;
import com.studentsdetails.services.StudentService;

@RestController
public class StudentContorller {

	@Autowired
	StudentService stuSer;
	@PostMapping(value = "/addone")	
	public String addoneDetail(@RequestBody Student s) throws AgeException {
		return stuSer.addoneDetail(s);
	}
	
	@PostMapping(value = "/addalldetails")
	public String addAllDetails(@RequestBody List<Student>s) throws AgeException {
		return stuSer.addAllDetails(s);
	}
	@GetMapping(value = "/findall")
	public List<Student> getAll() {
		return stuSer.getAll() ;
		
	}
//	@GetMapping(value = "/findrollvidid/{a}")
//	public int getRoll(@PathVariable int a) {
//		return stuSer.getRoll(a);
//	}
	

	@GetMapping(value = "/findroll/{a}")
	public String getRoll(@PathVariable String a) {
		return stuSer.getRoll(a);
	}
}
