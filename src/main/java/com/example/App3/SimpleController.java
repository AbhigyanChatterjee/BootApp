package com.example.App3;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	DbUser userTab = new DbUser();
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hello this is Abhigyan";
	}
		
	@GetMapping("/users") 
	public List<User> getAllUsers() {
		return userTab.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userTab.getUserById(id);
	}
	
	@GetMapping("/user")
	public User getUserByName(@RequestParam String qu) {
		return userTab.getUserByName(qu);
	}
	
	@PostMapping("users")
	@ResponseStatus(HttpStatus.CREATED)
	public User addNewUser(@RequestBody User us) {
		return userTab.newUser(us);
	}
}
