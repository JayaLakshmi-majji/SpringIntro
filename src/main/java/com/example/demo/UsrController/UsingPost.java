/*
 * 
 */
package com.example.demo.UsrController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UsrEntity.DemoUsr;
// TODO: Auto-generated Javadoc

/**
 * The Class UsingPost.
 */
@RestController
public class UsingPost {
	
	/**
	 * Met.
	 *
	 * @param n the n
	 * @return the demo usr
	 */
	@PostMapping(value = "/user")
	public DemoUsr Met(@RequestBody DemoUsr n) {
		System.out.println(n);
		return n;
	}
}
