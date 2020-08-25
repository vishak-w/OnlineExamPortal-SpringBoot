package com.oep.OnlineExamPortal.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="CandidateRegistration")
public class CandidateRegistration {
	

	@Id
	@Column
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String aadhar;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="CandidateProfile_id")
	private CandidateProfile candidateProfile;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private List<CandidateAddress> candidateAddress;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="candidateQDetails_id")
	private List<CandidateQualificationDetails> candidateQDetails;
	

}
