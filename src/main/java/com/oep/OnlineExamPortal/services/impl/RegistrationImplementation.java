package com.oep.OnlineExamPortal.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oep.OnlineExamPortal.model.dto.CandidateRegistrationDto;
import com.oep.OnlineExamPortal.model.entity.CandidateRegistration;
import com.oep.OnlineExamPortal.repositories.ExamRepository;
import com.oep.OnlineExamPortal.services.ifaces.RgistrationServices;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegistrationImplementation implements RgistrationServices {

	@Autowired
	ExamRepository examRepository;
	//CandidateRegistrationDto registrationDto = new CandidateRegistrationDto();
	CandidateRegistration registration = new CandidateRegistration();

	public void addUser(CandidateRegistrationDto registrationDto) {
		ModelMapper mapper = new ModelMapper();
		mapper.map(registrationDto, registration);
		log.info(registrationDto.toString());

		examRepository.save(registration);
	}

}
