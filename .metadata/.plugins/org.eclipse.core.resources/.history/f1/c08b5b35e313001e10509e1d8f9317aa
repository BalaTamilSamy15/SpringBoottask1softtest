package com.studentresults.services;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentresults.dao.ResultsDao;
import com.studentresults.entity.Results;

@Service
public class ResultsService {
@Autowired
ResultsDao resdao;
	public List<Results> postResult(List<Results> r) {
		
		return resdao.postResult(r);
	}
	public Results getTopper() {
		return resdao.getTopper();
	}
	public List<Results> getAll() {
		
		return resdao.getAll();
	}
	public List<Results> getTop3() {
		List<Results> f= resdao.getAll();
		List<Results> g=f.stream().sorted(Comparator.comparing(Results::getTotal).reversed()).limit(3).toList();
		return g;
	}

}
