package com.oem.OnlineExamPortal.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="CandidateAddress")
public class CandidateAddress {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String city;
	private String state;
	@Column
	private String pin_code;
	
	

}
