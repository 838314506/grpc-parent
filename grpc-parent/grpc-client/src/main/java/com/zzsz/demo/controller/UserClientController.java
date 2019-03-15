package com.zzsz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzsz.demo.service.UserClientService;

@RestController
@RequestMapping("/user")
public class UserClientController {

	@Autowired
	private UserClientService uService;
	
	@GetMapping("/get/{id}")
	public String get(@PathVariable(name = "id") int id) {
		return uService.get(id);
	}
}
