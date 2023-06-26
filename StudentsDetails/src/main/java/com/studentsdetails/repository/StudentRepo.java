package com.studentsdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentsdetails.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	@Query(value = "select roll_number from student where id=?", nativeQuery = true)
	public int findOne(int a);

	@Query(value = "select roll_number from student where  name=?", nativeQuery = true)
	public String findRoll(String a);

}
