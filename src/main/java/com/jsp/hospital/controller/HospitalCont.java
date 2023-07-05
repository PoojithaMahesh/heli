package com.jsp.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospital.dto.Hospital;
import com.jsp.hospital.service.HospitalService;
import com.jsp.hospital.util.ResponseStructure;

@RestController
public class HospitalCont {
	@Autowired
	private HospitalService service;
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(@RequestBody Hospital hospital){
		return service.saveHospital(hospital);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<Hospital>> deleteHospital(@RequestParam int id){
		return service.deleteHospitalById(id);
	}
	
	@DeleteMapping("/deleteall")
	public ResponseEntity<ResponseStructure<List<Hospital>>> deleteAllHospital(){
		return service.deleteAllHospital();
	}
	
	
	
	
	
	
	
	
	
	
	
}
