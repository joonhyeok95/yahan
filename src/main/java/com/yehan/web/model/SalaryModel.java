package com.yehan.web.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SalaryModel {
	private int empNo;
	private int salary;
	private String fromDate;
	private String toDate;
}
