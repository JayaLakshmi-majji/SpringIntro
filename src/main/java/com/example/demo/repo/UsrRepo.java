package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.UsrEntity.DemoUsr;

public interface UsrRepo extends JpaRepository<DemoUsr, Long>{

//	DemoUsr create(DemoUsr n); 

}
