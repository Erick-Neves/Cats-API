package com.CatApi.Erick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CatApi.Erick.model.ChapeuModel;

@Repository
public interface ChapeuRepository extends JpaRepository<ChapeuModel, Long>{
	
	public List<ChapeuModel> findAllByUrlContainingIgnoreCase(String url);

}
