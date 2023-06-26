package com.studentresults.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentresults.entity.Results;
import com.studentresults.repository.ResultsRepo;

@Repository
public class ResultsDao {
@Autowired
ResultsRepo resrepo;
	public List<Results> postResult(List<Results> r) {
		
		return resrepo.saveAll(r);
	}
	
	public Results getTopper() {
		
		return resrepo.getTopper();
	}

	public List<Results> getAll() {
		
		return resrepo.findAll();
	}

}
