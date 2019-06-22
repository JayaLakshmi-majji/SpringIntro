package com.example.demo.UsrEntity;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Services.UsrService;
@Service("UsrService2")

public class admin implements UsrService{
	ArrayList<DemoUsr> l = new ArrayList<DemoUsr>();

	
		public String type = "admin";

		@Override
		public DemoUsr Create(DemoUsr us) {
			// TODO Auto-generated method stub
			l.add(us);
			System.out.println(l);
			return us;
		}

		@Override
		public void Update(long s,String us ) {
			// TODO Auto-generated method stub
			//return null;
		}

		

		@Override
		public void Delete(long s) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Optional<DemoUsr> Retrive(long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
}
