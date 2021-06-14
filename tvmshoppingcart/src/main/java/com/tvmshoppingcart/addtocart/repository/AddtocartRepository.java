package com.tvmshoppingcart.addtocart.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tvmshoppingcart.addtocart.model.Addtocart;
@Repository
public interface AddtocartRepository extends JpaRepository < Addtocart, Long > {
	@Query("SELECT p FROM Addtocart p WHERE p.userid LIKE %?1%")
	public List<Addtocart> findAll(String userid);
	@Query("SELECT userid1 FROM Addtocart")
	public List<Addtocart> findAll(Long userid1);
	
}
//'%2548%'
//%?1%