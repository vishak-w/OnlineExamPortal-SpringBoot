package com.oep.OnlineExamPortal.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="CandidateQualifications")
public class CandidateQualificationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;
	
	@Column
	private String academics;//it means sslc,hsc,degree etc..
	@Column
	private String percentage;//percentage of academic
	@Column
	private String status;//indicate pass or fail 

}
