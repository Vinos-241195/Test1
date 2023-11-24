package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Management;
import com.example.demo.repository.Gloceryrepo;

@RestController
public class Glocerycontroller {
@Autowired
private Gloceryrepo repo;

@PostMapping("/adduser")
public Management adduser(@RequestBody Management user) {
	try {
		repo.save(user);
		return user;
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}
@GetMapping("/getuser")
public List<Management>getuser(){
	try {
		return repo.findAll();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
@PutMapping("/updateuser")
public Management updateuser(@RequestBody Management user) {
	try {
		repo.save(user);
		return user;
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}
@DeleteMapping("/deleteuser/{Id}")
public String deleteuser(@PathVariable int Id) {
	try {
		Management user=repo.getOne(Id);
				repo.delete(user);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
}
