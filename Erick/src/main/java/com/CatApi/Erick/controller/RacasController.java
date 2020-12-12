package com.CatApi.Erick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CatApi.Erick.model.RacasModel;
import com.CatApi.Erick.repository.RacasRepository;


@RestController
@RequestMapping("/racas")
@CrossOrigin("*")
public class RacasController {
	
	@Autowired
	private RacasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<RacasModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RacasModel> getById(@PathVariable long id){
		return repository.findById(id)
				.map(response -> ResponseEntity.ok(response))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<RacasModel>> getAllByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/origem/{origem}")
	public ResponseEntity<List<RacasModel>> getAllByOrigem(@PathVariable String origem){
		return ResponseEntity.ok(repository.findAllByOrigemContainingIgnoreCase(origem));
	}
	
	@GetMapping("/temperamento/{temperamento}")
	public ResponseEntity<List<RacasModel>> getAllByTemperamento(@PathVariable String temperamento){
		return ResponseEntity.ok(repository.findAllByTemperamentoContainingIgnoreCase(temperamento));
	}
	
	@PostMapping
	public ResponseEntity<RacasModel> post(@RequestBody RacasModel raca){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(raca));
	}
}
