/**
 * 
 */
package com.example.demo.UsrEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Class DemoUsr.
 */
@Entity
public class DemoUsr {
	
	 /** The id. */
 	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 public Long id;
	
	/** 
	 * The name. 
	 */
	public String name;
	
	/** 
	 * The gender. 
	 */
	public String gender;
	
	/**
	 * Instantiates a new demo usr.
	 */
	DemoUsr(){
		super();
	}
	
	/**
	 * Instantiates a new demo usr.
	 *
	 * @param name 
	 * @param gender 
	 */
	public DemoUsr(String name,String gender){
		
		this.name= name;
		this.gender=gender;
		
	}
	
	public String toString() {
		return this.name+ " "+
		this.gender +" " + this.id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoUsr other = (DemoUsr) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	}
