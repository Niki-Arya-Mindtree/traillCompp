package com.comptrail.main.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comptrail.main.models.Models;
import com.comptrail.main.repos.Reposit;

@RestController
public class Serv {

	@Autowired
	private Reposit repp;
	
	@GetMapping("/user")
	public List<Models> getAll()
	{return repp.findAll();}
	
	
	@GetMapping("/user/{Id}")
	public Models oneData(@PathVariable int Id)
	{return repp.getById(Id);}
	
	@PostMapping("/user")
	public void saveOne(Models md)
	{repp.saveAndFlush(md);}
}
