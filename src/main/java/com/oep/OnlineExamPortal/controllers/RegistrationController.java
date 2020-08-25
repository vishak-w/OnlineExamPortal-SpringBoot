package com.oep.OnlineExamPortal.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oep.OnlineExamPortal.model.dto.CandidateRegistrationDto;
import com.oep.OnlineExamPortal.model.entity.CandidateRegistration;
import com.oep.OnlineExamPortal.services.impl.RegistrationImplementation;

@RequestMapping(value="oep")
@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationImplementation registrationImplementation;
	
	@PostMapping(value="/register")
	//@ResponseStatus(reason = "Data Added Successfully",value = HttpStatus.CREATED)
	void registerCandidate(@RequestBody CandidateRegistrationDto registrationDto)
	{
		registrationImplementation.addUser(registrationDto);
		
	}

}
