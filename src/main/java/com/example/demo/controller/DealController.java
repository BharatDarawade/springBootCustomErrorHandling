package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DealBenchMarkNotFound;
import com.example.demo.pojos.Deal;
import com.example.demo.service.DealBenchMarkService;

@RestController
public class DealController {
	
	@Autowired
	DealBenchMarkService dealService;
	
	
	@GetMapping("/getBenchMark/{id}")
	public ResponseEntity<Deal> getDealBenchMArk(@PathVariable Long id){
		
		Optional<Deal> benchMark=dealService.getBenchMark(id);
		if(!benchMark.isPresent())
			throw new DealBenchMarkNotFound("Bench Mark not Found");
		ResponseEntity<Deal> resource = new ResponseEntity<Deal>(benchMark.get(), HttpStatus.OK);


		return resource;
	}
	

	@GetMapping("/getAllBenchMark")
	public List<Deal> getAllBenchMArk(){
		
		List<Deal> benchMark=dealService.getAllBenchMark();
		

		return benchMark;
	}


}

