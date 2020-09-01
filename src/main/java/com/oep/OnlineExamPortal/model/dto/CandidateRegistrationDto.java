package com.oep.OnlineExamPortal.model.dto;

import java.util.List;



import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Data
public class CandidateRegistrationDto {

	private Integer id;

	private String aadhar;
	private CandidateProfileDto candidateProfile;
	private List<CandidateAddressDto> candidateAddress;
	private List<CandidateQualificationDetailsDto> candidateQDetails;
	private LoginCredentialsDto loginDetails;
	

}
