package com.example.demo.UsrEntity;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Services.UsrService;

@Service("UsrService1")

public class Staff implements UsrService{
	public String type = "Worker";
	
	ArrayList<DemoUsr> l = new ArrayList<DemoUsr>();
	
	@Override
	public DemoUsr Create(DemoUsr us) {
		
		return null;
	}

	@Override
	public Optional<DemoUsr> Update(long s) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public DemoUsr Delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DemoUsr> Retrive(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
