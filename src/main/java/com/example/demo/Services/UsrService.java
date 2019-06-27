/*
 * 
 */
package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.UsrEntity.DemoUsr;

// TODO: Auto-generated Javadoc
/**
 * The Interface UsrService.
 */
public interface UsrService {
	
	/**
	 * Creates the.
	 *
	 * @param us the us
	 * @return the demo usr
	 */
	DemoUsr Create(DemoUsr us );
	
	/**
	 * Update.
	 *
	 * @param id the id
	 */
	void Update(long id);
	
	/**
	 * Retrive.
	 *
	 * @param id the id
	 * @return the optional
	 */
	Optional<DemoUsr> Retrive(long id);
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	void Delete(long id);
	
	/**
	 * Retrive.
	 *
	 * @return the list
	 */
	List<DemoUsr> retrive();
	
	
}
