package com.jsp.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.repository.HospitalRepo;

@Repository
public class HospitalDao {
	@Autowired
	private HospitalRepo repo;

	public Hospital saveHospital(Hospital hospital) {
		return repo.save(hospital);
	}
}
