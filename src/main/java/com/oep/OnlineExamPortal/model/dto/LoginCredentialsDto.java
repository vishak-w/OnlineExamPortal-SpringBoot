package com.oep.OnlineExamPortal.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

public class LoginCredentialsDto {

	private Integer id;
	private String userName;
	private String password;

}
