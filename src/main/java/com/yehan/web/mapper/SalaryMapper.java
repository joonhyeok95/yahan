package com.yehan.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yehan.web.model.SalaryModel;

//@Repository
@Mapper
public interface SalaryMapper {
	List<SalaryModel> getSalary();
}
