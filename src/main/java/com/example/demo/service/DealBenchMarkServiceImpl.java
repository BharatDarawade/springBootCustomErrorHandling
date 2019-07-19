package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DealBenchMarkRepository;
import com.example.demo.pojos.Deal;
@Service
public class DealBenchMarkServiceImpl implements DealBenchMarkService {


	@Autowired
	DealBenchMarkRepository dao;
	@Override
	public List<Deal> getAllBenchMark() {
		return (List<Deal>) dao.findAll();
	}
	@Override
	public Optional<Deal> getBenchMark(Long id) {
		return dao.findById(id);

	}


	

}
