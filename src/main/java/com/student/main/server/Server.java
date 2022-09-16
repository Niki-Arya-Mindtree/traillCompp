package com.student.main.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.main.entity.EntityMain;
import com.student.main.exception.EmptyData;
import com.student.main.repository.RepositoryStudent;

@Service
public class Server {
	
	@Autowired
	private RepositoryStudent repo;
	
	public List<EntityMain> allData() throws EmptyData
	{
		if(repo.findAll().size()==0)
			throw new EmptyData("Empty DataBase");
		return repo.findAll();
	}
	
	public EntityMain oneData(int Id) throws EmptyData
	{if(repo.getOne(Id)==null)
		throw new EmptyData("Wrong Id");
		return repo.getOne(Id);
	}
	
	
	public void saveData(EntityMain em) 
	{repo.saveAndFlush(em);}
}
