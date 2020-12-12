package com.CatApi.Erick.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CatApi.Erick.model.RacasModel;

@Repository
public interface RacasRepository extends JpaRepository<RacasModel, Long>{
	
	public List<RacasModel> findAllByNomeContainingIgnoreCase(String nome);
	public List<RacasModel> findAllByOrigemContainingIgnoreCase(String origem);
	public List<RacasModel> findAllByTemperamentoContainingIgnoreCase(String temperamento);

}
