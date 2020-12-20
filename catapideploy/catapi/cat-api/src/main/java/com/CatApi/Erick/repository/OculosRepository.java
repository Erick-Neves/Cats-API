package com.CatApi.Erick.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CatApi.Erick.model.OculosModel;

@Repository
public interface OculosRepository  extends JpaRepository<OculosModel, Long>{
	
	public List<OculosModel> findAllByUrlContainingIgnoreCase(String url);

}
