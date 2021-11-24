package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/users
// From postman change the API function to get a particular response

@RestController 
@RequestMapping("/users") // this annotations is the parameter
public class UsersContoller {
	
	/*
	//URL Example: http://localhost:8090/users
	@GetMapping // This annotation is used when is GET function
	public String getUsers() {
		return "http GET request was sent";		
	}
	*/
	
	//URL Example: http://localhost:8090/users?page=23&limit=60
	@GetMapping // This annotation is used when is GET function
	public String getUsers(@RequestParam(value="page") int pageNumber,@RequestParam(value="limit") int limitNumber) {
		return "http GET request was sent a query for page Number: " + pageNumber + " and limit Number: " + limitNumber;		
	}
	
	//URL Example: http://localhost:8090/users/11145
	@GetMapping(path= "/{userID}") // This annotation is used to specify a parameter
	public String getUser(@PathVariable String userID) {
		return "http GET request was sent for the userID:: " + userID;		
	}
	
	//URL Example: http://localhost:8090/users
	@PostMapping // This annotation is used when is POST function
	public String createUser() {
		return "http POST request was sent";		
	}
	
	//URL Example: http://localhost:8090/users
	@PutMapping // This annotation is used when is PUT function
	public String updateUser() {
		return "http PUT request was sent";		
	}
	
	//URL Example: http://localhost:8090/users
	@DeleteMapping // This annotation is used when is DELETE function
	public String deleteUser() {
		return "http DELETE request was sent";		
	}

}
