package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.pojos.Deal;

@Service
public  interface DealBenchMarkService {

	public List<Deal> getAllBenchMark();
	public Optional<Deal> getBenchMark(Long id);

}
