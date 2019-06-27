/*
 * 
 */
package com.example.demo.UsrEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Services.UsrService;

// TODO: Auto-generated Javadoc
/**
 * The Class Staff.
 */
@Service("UsrService1")

public class Staff implements UsrService{
	
	/** The type. */
	public String type = "Worker";
	
	/** The l. */
	ArrayList<DemoUsr> l = new ArrayList<DemoUsr>();
	
	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Create(com.example.demo.UsrEntity.DemoUsr)
	 */
	@Override
	public DemoUsr Create(DemoUsr us) {
		
		return null;
	}
	

	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Delete(long)
	 */
	@Override
	public void Delete(long s) {
		// TODO Auto-generated method stub
		//return null;
	}

	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Retrive(long)
	 */
	@Override
	public Optional<DemoUsr> Retrive(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Update(long)
	 */
	@Override
	public void Update(long id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#retrive()
	 */
	@Override
	public List<DemoUsr> retrive() {
		// TODO Auto-generated method stub
		return null;
	}
}
