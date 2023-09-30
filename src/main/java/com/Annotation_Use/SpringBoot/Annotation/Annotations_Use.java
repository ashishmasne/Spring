package com.Annotation_Use.SpringBoot.Annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
public class Annotations_Use {

	//@PathVariable is used to get data through URL.
	//@RequestBody is used to get data through Body

	@RequestMapping("urlname/{name}") // here at the place of '@RequestMapping' we can use @GetMapping' also.
	String m2(@PathVariable String name) {

		// '@PathVariable' annotation is used to get data through URL.
		
		// here we used '"urlname/{name_We_Want_To_Get}"'like this to get this in our URL type
		// 'localhost:1234/urlname/Ashish'.
		
		// here 'localhost:1234/urlname/Ashish' in this Ashish will be the 'name_We_Want_To_Get' we want
		// to get.
		return name;
	}
	
	@RequestMapping("jbk/{id}")
	Integer m3(@PathVariable Integer id) {
		
		return id;
	}

	//We can do this as follows also using @GetMapping instead of @RequestMapping.
	
	@GetMapping("Hello/{name}")
	String m4(@PathVariable String name) {
		
		return name;
	}
	
	@GetMapping("asking/{roll}")
	int m5(@PathVariable int roll) {
		
		return roll;
	}
	
	
	//when using in postman type 'localhost:8080/pk' in URL & String you want to give type that String in Body.
	@GetMapping("pk")
	String m6(@RequestBody String name) {
		
		return name;
	}
	
	
	//when using in postman type 'localhost:8080/sd' in URL & id you want to give type that id in Body.
	@GetMapping("sd")
	int m7(@RequestBody int id) {
		
		return id;
	}
	
	
	
}
