package com.studentresults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.studentresults.entity.Results;
import com.studentresults.services.ResultsService;

@RestController
public class ResultsController {

	@Autowired
	ResultsService reser;
	
	@Autowired
	RestTemplate rest;
	
	@PostMapping(value = "/postresult")
	public List<Results> postResult(@RequestBody List<Results> r) {
		
		String url1="http://localhost:8081/gettotal";
		ResponseEntity<List<Integer>> res1=rest.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<Integer>>(){});
		List<Integer> tot=res1.getBody();
		int i=0;
		for (Results re : r) {
			String url2="http://localhost:8080/findroll/";
			String br=re.getName();
			ResponseEntity<Integer> res2=rest.exchange(url2+br,HttpMethod.GET,null,Integer.class);
			int ro=res2.getBody();
			re.setRollNumber(ro);
		re.setTotal(tot.get(i));
			if(re.getAtper()>90) {
				int to=re.getTotal()+5;
				if(to<=1000) {
					re.setTotal(to);
				}
			}
			
			i++;
		int per=(re.getTotal()*100)/1000;
			re.setPercentage(per);
		}
		
		return reser.postResult(r);
		
	}
	@GetMapping(value = "/gettopper")
	public Results getTopper() {
		
		return reser.getTopper();
	}
	@GetMapping(value = "/gettop3")
	public List<Results> getTop3() {
		return reser.getTopThree();
	
	}
	@GetMapping(value = "/getAll")
	public List<Results> getAll() {
		return reser.getAll();
	}
	
}




