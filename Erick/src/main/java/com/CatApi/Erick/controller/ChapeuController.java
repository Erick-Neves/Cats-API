package com.CatApi.Erick.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CatApi.Erick.model.ChapeuModel;
import com.CatApi.Erick.repository.ChapeuRepository;



@RestController
@RequestMapping("/chapeu")
@CrossOrigin("*")
public class ChapeuController {
	
	Logger log = LoggerFactory.getLogger(ChapeuController.class);
	
	@Autowired
	private ChapeuRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ChapeuModel>> getAll(){
		log.info("Retorno de todos os gatos de chapéu.");
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<ChapeuModel> post(@RequestBody ChapeuModel chapeu){
		log.info("Registro salvo no banco de dados.");
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(chapeu));
	}
	
	@PutMapping
	public ResponseEntity<ChapeuModel> put(@RequestBody ChapeuModel chapeu){
		log.info("Registro atualizado no banco de dados.");
		return ResponseEntity.ok(repository.save(chapeu));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable  long id) {
		log.info("Registro apagado no banco de dados.");
		repository.deleteById(id);
	}

}
