package com.oep.OnlineExamPortal.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class CandidateAddressDto {
	
	
	private Integer id;
	private String city;
	private String state;
	private String pin_code;
	
	

}
