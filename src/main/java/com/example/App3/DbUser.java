package com.example.App3;

import java.util.ArrayList;
import java.util.List;

public class DbUser {

	private List<User> userTable = new ArrayList<User>();
	
	public DbUser() {
		userTable.add(new User(1, "Abhigyan", 20));
		userTable.add(new User(2, "Abhinav", 21));
		userTable.add(new User(3, "Abhiraj", 22));
	}
	
	public List<User> getAllUsers() {
		return this.userTable;
	}
	
	public User getUserById(int id) {
		for(User u : userTable) {
			if(u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	
	public User getUserByName(String name) {
		for(User u : userTable) {
			if(u.getName() == name) {
				return u;
			}
		}
		return null;
	}
	
	public User getUserByAge(int age) {
		for(User u : userTable) {
			if(u.getAge() == age) {
				return u;
			}
		}
		return null;
	}
	
	public User newUser(User us) {
		userTable.add(us);
		return userTable.get(userTable.size() - 1);
	}
	
	
	
}
