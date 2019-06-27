/**
 * 
 */
package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.UsrEntity.DemoUsr;

/**
 * The Interface UsrRepo.
 */
public interface UsrRepo extends JpaRepository<DemoUsr, Long>{
	
	/**
	 * Update the content based on id
	 *
	 * @param id 
	 * @Modifying should be used when trying to modifythe data
	 */
	@Transactional
	@Modifying
	@Query("UPDATE DemoUsr SET gender = :gender where id = :id")
	void update(@Param("id") long id);

	/**
	 * View the records in the databace
	 *
	 * @return the list
	 */
	@Query("select user from DemoUsr user")
	List<DemoUsr> view();
	
	/**
	 * Creates the new record in database.
	 *
	 * @param dm of type DemoUsr
	 * @return the demo usr
	 */
	DemoUsr create(DemoUsr dm); 

}
