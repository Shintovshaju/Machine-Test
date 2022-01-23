package com.finalmt.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.finalmt.app.model.Vender;

@Repository
public interface IVenderRepository extends CrudRepository<Vender, Integer> {
	

}
