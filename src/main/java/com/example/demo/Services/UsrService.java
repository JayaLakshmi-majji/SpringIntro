package com.example.demo.Services;

import java.util.Optional;

import com.example.demo.UsrEntity.DemoUsr;

public interface UsrService {
	DemoUsr Create(DemoUsr us );
	Optional<DemoUsr> Update(long id);
	Optional<DemoUsr> Retrive(long id);
	DemoUsr Delete();
	
}
