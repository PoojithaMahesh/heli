package com.jsp.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.hospital.dao.HospitalDao;
import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.exception.IdNotFoundException;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ResponseEntity<ResponseStructure<Hospital>> deleteHospitalById(int id) {
	Hospital dbHospital=dao.deleteHospital(id);
	if(dbHospital!=null) {
		  ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
		  structure.setMessage("Hospital deleted successfully");
		  structure.setStatus(HttpStatus.FOUND.value());
		  structure.setData(dbHospital);
		  
		  return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.FOUND);

	}else {
//		dbhospital is null;
		throw new IdNotFoundException("Sorry failed to delete");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public ResponseEntity<ResponseStructure<List<Hospital>>> deleteAllHospital(){
	List<Hospital> hospitals=dao.deleteAllHospital();
	ResponseStructure<List<Hospital>> structure=new ResponseStructure<List<Hospital>>();
	structure.setMessage("deleted");
	structure.setStatus(HttpStatus.FOUND.value());
	structure.setData(hospitals);
	return new ResponseEntity<ResponseStructure<List<Hospital>>>(structure,HttpStatus.FOUND);
	
	
}










}
