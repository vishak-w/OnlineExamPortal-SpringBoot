package com.oep.OnlineExamPortal.services.ifaces;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.oep.OnlineExamPortal.model.dto.CandidateRegistrationDto;
import com.oep.OnlineExamPortal.model.entity.CandidateRegistration;
@Component
public interface RgistrationServices {

	public void addUser(CandidateRegistrationDto registrationDto);

}
