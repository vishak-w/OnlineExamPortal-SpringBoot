package com.oep.OnlineExamPortal.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

public class CandidateQualificationDetailsDto {
	
	
	private Integer id;
	
	private String academics;//it means sslc,hsc,degree etc..
	private String percentage;//percentage of academic
	private String status;//indicate pass or fail 

}
