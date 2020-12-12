package com.CatApi.Erick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CatApi.Erick.model.ChapeuModel;
import com.CatApi.Erick.repository.ChapeuRepository;


@RestController
@RequestMapping("/chapeu")
@CrossOrigin("*")
public class ChapeuController {
	
	@Autowired
	private ChapeuRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ChapeuModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}
