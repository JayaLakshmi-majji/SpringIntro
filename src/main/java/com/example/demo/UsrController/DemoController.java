package com.example.demo.UsrController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.UsrService;
import com.example.demo.UsrEntity.DemoUsr;


@RestController
@RequestMapping("/user")
public class DemoController {
//	@Autowired
//	@Qualifier("UsrService1")
//	UsrService UsrService1;
//	@Autowired
//	@Qualifier("UsrService2")
//	UsrService UsrService2;
	@Autowired
	@Qualifier("UsrService3")
	UsrService UsrService3;
	
//	@PostMapping("/1")
//	public DemoUsr create(@RequestBody DemoUsr dm) {
//		return UsrService3.Create(dm);
//	}
	
//	@PutMapping("/1/{name}")
//	public DemoUsr update(@PathVariable String name) {
//		return UsrService3.Update(name);
//	}
//	
	
	@PostMapping("/")
	public DemoUsr add(@RequestBody DemoUsr dm) {
		return UsrService3.Create(dm);
	}
	
	@GetMapping("/{id}")
	  public Optional<DemoUsr> retrive(@PathVariable long id) {
	    return UsrService3.Retrive(id);
	  }
	
	@PutMapping("/1/{id}")
	public Optional<DemoUsr> updateusr2(@PathVariable long id) {
		return UsrService3.Update(id);
	}
	
//	@PostMapping("/1")
//	public DemoUsr createusr2(@RequestBody DemoUsr dm) {
//		return UsrService2.Create(dm);
//	}
	
	/*@PutMapping("/1/{name}")
	public DemoUsr updateusr2(@PathVariable String name) {
		return UsrService2.Update(name);
	}
	
	
	@DeleteMapping("/1")
	public DemoUsr deleteusr2() {
		return UsrService2.Delete();
	}
	
	
	
	@PostMapping("/1")
	public DemoUsr createusr1(@RequestBody DemoUsr dm) {
		return UsrService2.Create(dm);
	}
	
	@PutMapping("/1/{name}")
	public DemoUsr updateusr1(@PathVariable String name) {
		return UsrService2.Update(name);
	}
	
	
	@DeleteMapping("/1")
	public DemoUsr deleteusr1() {
		return UsrService2.Delete();
	}*/
	
	
	
	@GetMapping("/")
	  public String base() {
	    return "Hello World!!!";
	  }
	
	
//	 public void initIt() throws Exception {
//	       
//	 
//	        l.add(dm);
//	        l.add(dm1);
//	    }
//	
	/*DemoUsr dm = new DemoUsr("jaya",21,"female"); 
	DemoUsr dm1 = new DemoUsr("hema",21,"female"); 
	ArrayList<DemoUsr> l = new ArrayList<DemoUsr>();
	
//	
	@GetMapping("/DemoUsr/{name}")
	public DemoUsr Met(@PathVariable String name) {
		DemoUsr dm = null;
		if(name.equalsIgnoreCase("jaya")) {
		dm = new DemoUsr("jaya",21,"female");
		return dm;
		}
		return dm;
	}      
	
	@PostMapping("/DemoUsr")
	public DemoUsr Met(@RequestBody DemoUsr n) {
		l.add(dm);
		l.add(dm1);
		l.add(n);
		System.out.println(l);
		//System.out.println(n);
		return n;
	}
	
	@DeleteMapping("/DemoUsr")
	public DemoUsr delete(@RequestBody DemoUsr n) {
		l.remove(n);
		System.out.println(l);
		return dm;
	}

	*/
	
}
