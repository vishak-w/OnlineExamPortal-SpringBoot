package com.oep.OnlineExamPortal.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class CandidateProfileDto {

	private Integer id;
	
	private String student_name;
	private String student_dob;
	private String father_name;
	private String mother_name;
	

}
