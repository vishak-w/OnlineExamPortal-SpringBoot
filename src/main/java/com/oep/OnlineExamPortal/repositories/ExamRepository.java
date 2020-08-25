package com.oep.OnlineExamPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oep.OnlineExamPortal.model.entity.CandidateRegistration;

@Repository
public interface ExamRepository extends JpaRepository<CandidateRegistration, Integer> {

}
