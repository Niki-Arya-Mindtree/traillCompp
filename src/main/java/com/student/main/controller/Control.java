package com.student.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.main.entity.EntityMain;
import com.student.main.exception.EmptyData;
import com.student.main.exception.ExcepMessg;
import com.student.main.server.Server;

@RestController
public class Control {
	
	@Autowired
	private Server serv;
	
	@GetMapping("/data")
	public ResponseEntity<?> getAllData(){
		try {
			return new ResponseEntity<>(serv.allData(),HttpStatus.FOUND);
		} catch (EmptyData e) {
			return new ResponseEntity<>(new ExcepMessg(e.getMessage()),HttpStatus.NO_CONTENT);
		}
		catch (Exception e) {
			return new ResponseEntity<>(new ExcepMessg(e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}

	
	@GetMapping("/data/{Id}")
	public ResponseEntity<?> getOneData(@PathVariable int Id){
		try {
			return new ResponseEntity<>(serv.allData(),HttpStatus.FOUND);
		} catch (EmptyData e) {
			return new ResponseEntity<>(new ExcepMessg(e.getMessage()),HttpStatus.NO_CONTENT);
		}
		catch (Exception e) {
			return new ResponseEntity<>(new ExcepMessg(e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/data")
	public void getSaveData(@RequestBody EntityMain em) 
	{serv.saveData(em);}
}
