package com.example.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UsrEntity.DemoUsr;
import com.example.demo.repo.UsrRepo;

@Service("UsrService3")

public class UserService implements UsrService{
	@Autowired
	UsrRepo usrrepo;
//	DemoUsr dm = new DemoUsr("jay",21,"female"); 
//	DemoUsr dm1 = new DemoUsr("hem",21,"female"); 
	ArrayList<DemoUsr> l = new ArrayList<DemoUsr>();
	DemoUsr d = new DemoUsr("satya","male");
	@Override
	
	public DemoUsr Create( DemoUsr n) {
		
		return usrrepo.save(n);
	}

	@Override
	public void Update(long id,String  gender) {
//		l.add(d);
//		//DemoUsr d = new DemoUsr("satya",45,"male");
//		for( DemoUsr j :l ) {
//			if(j.name.contains(name)) {
//				j.gender= "mfnjyjd";
//				return j;
//			}
//		}
		
		
			usrrepo.update(gender,id);
			//usrrepo.deleteById(id);
		
		
	}

	@Override
	public Optional<DemoUsr> Retrive(long id) {
		
		return usrrepo.findById(id);
	}

	@Override
	public void Delete(long id) {
		
		usrrepo.deleteById(id);
	
	}
	
	
	
	
}
