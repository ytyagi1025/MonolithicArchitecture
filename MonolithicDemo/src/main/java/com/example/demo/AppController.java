package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	Utility utility;

	@GetMapping("getEmp/{id}/{techId}")
	public ResponseEntity getEmp(@PathVariable int id, @PathVariable int techId) {
		try {
			Employee emp = utility.getEmployee(id);
			emp.setTechnology(utility.getTechnology(techId));
			return new ResponseEntity(emp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
