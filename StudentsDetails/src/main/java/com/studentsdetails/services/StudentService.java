package com.studentsdetails.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentsdetails.dao.StudentDao;
import com.studentsdetails.entity.Student;
import com.studentsdetails.exception.AgeException;

@Service
public class StudentService {

	@Autowired
	StudentDao studao;

	public String addAllDetails(List<Student> s) throws AgeException {
List<Student> d= new ArrayList<>();
		for (Student st : s) { 
			if (st.getAge() < 18) {
				throw new AgeException();
				
			} else {
			d.add(st);
			}
			
		}

		return studao.addAllDetails(d);
	}

	public String addoneDetail(Student s) throws AgeException {
		try {
			if (s.getAge() >= 18) {
				return studao.addoneDetail(s);
			} else {
				throw new AgeException();
			}
		} catch (AgeException e) {
			return "Age exception";
		}
	}

	public String getRoll(String a) {
		
		return studao.getRoll(a) ;
	}

	public List<Student> getAll() {
		
		return studao.getAll();
	}

}
