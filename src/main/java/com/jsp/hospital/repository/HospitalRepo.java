package com.jsp.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.hospital.dto.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

}
