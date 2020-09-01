package com.oep.OnlineExamPortal.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.oep.OnlineExamPortal.model.dto.CandidateRegistrationDto;
import com.oep.OnlineExamPortal.model.dto.LoginCredentialsDto;
import com.oep.OnlineExamPortal.model.entity.CandidateRegistration;
import com.oep.OnlineExamPortal.model.entity.LoginCredentials;
import com.oep.OnlineExamPortal.repositories.ExamRepository;
import com.oep.OnlineExamPortal.services.ifaces.RgistrationServices;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegistrationImplementation implements RgistrationServices {

	@Autowired
	ExamRepository examRepository;
	@Autowired
	PasswordEncoder bcryptEncoder;
	// CandidateRegistrationDto registrationDto = new CandidateRegistrationDto();

	ModelMapper mapper = new ModelMapper();

	public void addUser(CandidateRegistrationDto registrationDto) {
		// LoginCredentialsDto login = new LoginCredentialsDto();
		LoginCredentials cred = new LoginCredentials();
		LoginCredentialsDto ldto = new LoginCredentialsDto();
		CandidateRegistration registration = new CandidateRegistration();

		log.info("getting password from lofin dto..." + registrationDto.getLoginDetails().getPassword());
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		String pass = bcryptEncoder.encode(registrationDto.getLoginDetails().getPassword());
		log.info("Expected Encrypted password" + pass);
		ldto.setPassword(pass);
		ldto.setUserName(registrationDto.getLoginDetails().getUserName());
		registrationDto.setLoginDetails(ldto);
		mapper.map(registrationDto, registration);
		log.info(registrationDto.toString());

		examRepository.save(registration);
	}

	public List<CandidateRegistrationDto> getAllCandidate() {
		CandidateRegistrationDto registrationDto = new CandidateRegistrationDto();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		List<CandidateRegistration> r_list = examRepository.findAll();

		mapper.map(CandidateRegistration.class, registrationDto);

		return r_list.stream().map(user -> mapper.map(user, CandidateRegistrationDto.class))
				.collect(Collectors.toList());

	}

}
