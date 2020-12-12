package com.CatApi.Erick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CatApi.Erick.model.OculosModel;
import com.CatApi.Erick.repository.OculosRepository;

@RestController
@RequestMapping("/oculos")
@CrossOrigin("*")
public class OculosController {
	
	@Autowired
	private OculosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<OculosModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<OculosModel> post(@RequestBody OculosModel oculos){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(oculos));
	}
}
