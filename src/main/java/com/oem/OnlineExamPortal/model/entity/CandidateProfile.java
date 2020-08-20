package com.oem.OnlineExamPortal.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="CandidateProfile")
public class CandidateProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String student_name;
	@Column
	private String student_dob;
	@Column
	private String father_name;
	@Column
	private String mother_name;
	

}
