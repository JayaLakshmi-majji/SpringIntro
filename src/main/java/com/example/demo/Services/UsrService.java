package com.example.demo.Services;

import java.util.Optional;

import com.example.demo.UsrEntity.DemoUsr;

public interface UsrService {
	DemoUsr Create(DemoUsr us );
	void Update(long id,String gender );
	Optional<DemoUsr> Retrive(long id);
	void Delete(long id);
	
}
