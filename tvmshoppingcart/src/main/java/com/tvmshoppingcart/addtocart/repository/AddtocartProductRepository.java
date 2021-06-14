package com.tvmshoppingcart.addtocart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvmshoppingcart.addtocart.model.Product;

@Repository
public interface AddtocartProductRepository extends JpaRepository<Product, Long >{

}
