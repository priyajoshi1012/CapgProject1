package com.cg.bookmydoctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookmydoctor.dto.Patient;

public interface IPatientRepository extends JpaRepository<Patient,Integer> {

}
