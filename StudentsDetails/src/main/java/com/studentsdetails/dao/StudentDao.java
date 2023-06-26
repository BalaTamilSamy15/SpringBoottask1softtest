package com.studentsdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentsdetails.entity.Student;
import com.studentsdetails.repository.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo sturepo;

	public String addAllDetails(List<Student> d) {
		sturepo.saveAll(d) ;
		return "Successfully saved the details"; 
	}

	public String addoneDetail(Student s) {
	
		sturepo.save(s);
		return "Saved Successfull";
	}

	public String getRoll(String a) {
		
		return sturepo.findRoll(a);
	}

	public List<Student> getAll() {
		
		return sturepo.findAll();
	}

}
