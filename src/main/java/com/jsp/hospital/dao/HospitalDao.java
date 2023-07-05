package com.jsp.hospital.dao;

import java.util.List;
import java.util.Optional;

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

	public Hospital deleteHospital(int id) {
	Optional<Hospital> optional=repo.findById(id);
	if(optional.isPresent()) {
		repo.delete(optional.get());

		return optional.get();
	}
		return null;
	}
	public List<Hospital> deleteAllHospital(){
		List<Hospital> hospitals=repo.findAll();
		repo.deleteAll();
		return hospitals;
	}
}
