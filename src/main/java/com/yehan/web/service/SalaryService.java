package com.yehan.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yehan.web.mapper.SalaryMapper;
import com.yehan.web.model.SalaryModel;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class SalaryService {
	
	private final SalaryMapper salaryMapper;
	
	public List<SalaryModel> getSalary(){
		return salaryMapper.getSalary();
	}
	
}
