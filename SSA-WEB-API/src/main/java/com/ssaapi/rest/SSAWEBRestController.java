package com.ssaapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssa-web-api")
public class SSAWEBRestController {
	
	@GetMapping("/find/{ssn}")
	public ResponseEntity<String> getStateBySSN(@PathVariable Integer ssn){
		
		if(String.valueOf(ssn).length()!=9) {
			return new ResponseEntity<String>("Invalid SSN", HttpStatus.BAD_REQUEST);
			
		}
		
		int stateCode=ssn%100;
		String stateName=null;
		if(stateCode==1) {
			stateName="Washington";
		}else if(stateCode==2) {
			stateName="Ohio";
		}else if(stateCode==3) {
			stateName="Texas";
		}else if(stateCode==4) {
			stateName="California";
		}else {
			stateName="Invalid SSN";
		}
			
		
		return new ResponseEntity<String>(stateName, HttpStatus.OK);
	}

}
