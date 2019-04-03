package com.dyalogo.example.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyalogo.example.example.bdr.DyUsuarios;
import com.dyalogo.example.example.repos.DyUsariosRepository;

@RestController
@RequestMapping(value="/rest/users",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UsersResource {
	
	@Autowired
	DyUsariosRepository usersRepo;
	
	@GetMapping(value = "all")
	public List<DyUsuarios> getAll(){
		return usersRepo.findAll();
	}
}
