package com.jsp.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.hospital.dao.HospitalDao;
import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.util.ResponseStructure;

@Service
public class HospitalService {

	@Autowired
	private HospitalDao dao;
	
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital) {
	  Hospital dbHospital=dao.saveHospital(hospital);
	  ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
	  structure.setMessage("Hospital saved successfully");
	  structure.setStatus(HttpStatus.CREATED.value());
	  structure.setData(dbHospital);
	  
	  return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.CREATED);

	}

}
