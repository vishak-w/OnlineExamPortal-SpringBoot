package com.oem.OnlineExamPortal.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="CandidateRegistration")
public class CandidateRegistration {
	

	@Id
	@Column
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CandidateProfile_id")
	private CandidateProfile CandidateProfile;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="address_id")
	private List<CandidateAddress> candidateAddress;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="candidateQDetails_id")
	private List<CandidateQualificationDetails> candidateQDetails;
	

}
