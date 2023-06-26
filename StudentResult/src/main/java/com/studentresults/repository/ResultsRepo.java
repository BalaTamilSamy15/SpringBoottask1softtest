package com.studentresults.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentresults.entity.Results;

public interface ResultsRepo extends JpaRepository<Results, Integer> {

	@Query(value="SELECT * FROM test_db.results where total=(select max(total) from test_db.results);",nativeQuery = true)
	public Results getTopper();
	
//	@Query(value="SELECT * FROM test_db.results);",nativeQuery = true)
//	public Results getAll();
}
