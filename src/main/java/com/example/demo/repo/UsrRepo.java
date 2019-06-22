package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.UsrEntity.DemoUsr;

public interface UsrRepo extends JpaRepository<DemoUsr, Long>{
	@Transactional
	@Modifying
	@Query("UPDATE DemoUsr SET gender = :gender where id = :id")
	void update(@Param("gender") String gender,@Param("id") long id);
	
//	DemoUsr create(DemoUsr n); 

}
