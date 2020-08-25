package com.oep.OnlineExamPortal.model.dto;

import lombok.Data;

@Data
public class CandidateLoginRequest {

	private String user_name;
	private String password;
}
