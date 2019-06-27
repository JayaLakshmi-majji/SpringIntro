/*
 * 
 */
package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UsrEntity.DemoUsr;
import com.example.demo.repo.UsrRepo;

// TODO: Auto-generated Javadoc
/**
 * The Class UserService.
 */
@Service("UsrService3")

public class UserService implements UsrService{
	
	/** The usrrepo. */
	@Autowired
	UsrRepo usrrepo;
//	DemoUsr dm = new DemoUsr("jay",21,"female"); 
/** The l. */
//	DemoUsr dm1 = new DemoUsr("hem",21,"female"); 
	ArrayList<DemoUsr> l = new ArrayList<DemoUsr>();
	
	/** The d. */
	DemoUsr d = new DemoUsr("satya","male");
	
	
	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Create(com.example.demo.UsrEntity.DemoUsr)
	 */
	@Override
	public DemoUsr Create( DemoUsr n) {	
		return usrrepo.save(n);
	}

	
	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Update(long)
	 */
	@Override
	public void Update(long id) {
//		l.add(d);
//		//DemoUsr d = new DemoUsr("satya",45,"male");
//		for( DemoUsr j :l ) {
//			if(j.name.contains(name)) {
//				j.gender= "mfnjyjd";
//				return j;
//			}
//		}
			 usrrepo.update(id);
			//usrrepo.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Retrive(long)
	 */
	@Override
	public Optional<DemoUsr> Retrive(long id) {
		
		return usrrepo.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#Delete(long)
	 */
	@Override
	public void Delete(long id) {
		
		usrrepo.deleteById(id);
	
	}

	/* (non-Javadoc)
	 * @see com.example.demo.Services.UsrService#retrive()
	 */
	@Override
	public List<DemoUsr> retrive() {
		return usrrepo.view();
	}


	
	
	
	
	
}
