package com.oep.OnlineExamPortal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oep.OnlineExamPortal.model.dto.CandidateRegistrationDto;
import com.oep.OnlineExamPortal.model.entity.CandidateRegistration;
import com.oep.OnlineExamPortal.services.impl.RegistrationImplementation;

//@RequestMapping(value = "oep")
@RestController
public class RegistrationController {

	@Autowired
	RegistrationImplementation registrationImplementation;

	@RequestMapping(value = "/register")
	void registerCandidate(@RequestBody CandidateRegistrationDto registrationDto) {
		registrationImplementation.addUser(registrationDto);

	}

	@GetMapping(value = "/getAllCandidate")

	ResponseEntity<List<CandidateRegistrationDto>> getAllCandidate() {
		List<CandidateRegistrationDto> list = registrationImplementation.getAllCandidate();

		return new ResponseEntity<List<CandidateRegistrationDto>>(list, HttpStatus.FOUND);
	}

}
