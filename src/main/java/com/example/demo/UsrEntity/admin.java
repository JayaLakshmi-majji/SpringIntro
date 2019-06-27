/*
 * 
 */
package com.example.demo.UsrEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Services.UsrService;

/**
 * The Class admin.
 */
@Service("UsrService2")

public class admin implements UsrService{
	
	/**
	 * l is a ArrayList of type DemoUsr
	 */
	ArrayList<DemoUsr> l = new ArrayList<DemoUsr>();

		/** 
		 * 
		 */
		@Override
		public DemoUsr Create(DemoUsr us) {
			l.add(us);
			System.out.println(l);
			return us;
		}

		/**
		 * 
		 */
		@Override
		public void Delete(long s) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * 
		 */
		@Override
		public Optional<DemoUsr> Retrive(long id) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		 * 
		 */
		@Override
		public void Update(long id) {
			// TODO Auto-generated method stub
			
		}
		
		/**
		 * 
		 */
		@Override
		public List<DemoUsr> retrive() {
			// TODO Auto-generated method stub
			return null;
		}
		
}
