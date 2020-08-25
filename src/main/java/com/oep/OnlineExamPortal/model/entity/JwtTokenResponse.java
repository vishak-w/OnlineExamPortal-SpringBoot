package com.oep.OnlineExamPortal.model.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtTokenResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5575145068519349880L;
	private final String token;

}
