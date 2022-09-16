package com.comptrail.main.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comptrail.main.models.Models;

public interface Reposit extends JpaRepository<Models, Integer>{

}
