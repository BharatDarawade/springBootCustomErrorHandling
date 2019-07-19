package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deal {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	double dealBenchMark;
	
	double revenue;
	
	
	

	public Deal(String name, double dealBenchMark, double revenue) {
		super();
		this.name = name;
		this.dealBenchMark = dealBenchMark;
		this.revenue = revenue;
	}

	public Deal() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDealBenchMark() {
		return dealBenchMark;
	}

	public void setDealBenchMark(double dealBenchMark) {
		this.dealBenchMark = dealBenchMark;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	
	
	
	
}
