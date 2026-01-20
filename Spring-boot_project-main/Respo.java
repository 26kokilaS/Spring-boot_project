package com.example.RpDatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RpDatabase.Entity.Studata;

public interface Respo extends JpaRepository<Studata,Integer>{
	
}
