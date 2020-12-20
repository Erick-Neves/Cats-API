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
import com.CatApi.Erick.model.RacasModel;
import com.CatApi.Erick.repository.RacasRepository;

@RestController
@RequestMapping("/racas")
@CrossOrigin("*")
public class RacasController {
	
	Logger log = LoggerFactory.getLogger(RacasController.class);
	
	@Autowired
	private RacasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<RacasModel>> getAll(){
		log.info("Retorno de todas as raças de gato.");
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RacasModel> getById(@PathVariable long id){
		log.info("Retorno da raça de gato por ID numerico, pela ordem que foi populado o banco de dados.");
		return repository.findById(id)
				.map(response -> ResponseEntity.ok(response))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<RacasModel>> getAllByNome(@PathVariable String nome){
		log.info("Retorno das raças de gato por nome.");
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/origem/{origem}")
	public ResponseEntity<List<RacasModel>> getAllByOrigem(@PathVariable String origem){
		log.info("Retorno das raças de gato por origem.");
		return ResponseEntity.ok(repository.findAllByOrigemContainingIgnoreCase(origem));
	}
	
	@GetMapping("/temperamento/{temperamento}")
	public ResponseEntity<List<RacasModel>> getAllByTemperamento(@PathVariable String temperamento){
		log.info("Retorno das raças de gato por temperamento.");
		return ResponseEntity.ok(repository.findAllByTemperamentoContainingIgnoreCase(temperamento));
	}
	
	@PostMapping
	public ResponseEntity<RacasModel> post(@RequestBody RacasModel raca){
		log.info("Registro salvo no banco de dados.");
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(raca));
	}
	
	@PutMapping
	public ResponseEntity<RacasModel> put(@RequestBody RacasModel raca){
		log.info("Registro atualizado no banco de dados.");
		return ResponseEntity.ok(repository.save(raca));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable  long id) {
		log.info("Registro apagado no banco de dados.");
		repository.deleteById(id);
	}
	
}
