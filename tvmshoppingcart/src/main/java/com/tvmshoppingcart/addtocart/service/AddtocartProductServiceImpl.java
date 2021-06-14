package com.tvmshoppingcart.addtocart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvmshoppingcart.addtocart.model.Product;
import com.tvmshoppingcart.addtocart.repository.AddtocartProductRepository;
@Service
public class AddtocartProductServiceImpl implements AddtocartProductService{
	@Autowired
	private AddtocartProductRepository addtocartProductRepository;
	@Override
	public void saveProduct(Product product) {
		
		this.addtocartProductRepository.save(product);
	}

	@Override
	public Product getProductById(long productid) {
		Optional < Product > optional = addtocartProductRepository.findById(productid);
        Product product = null;
        if (optional.isPresent()) {
           product = optional.get();
        } else {
            throw new RuntimeException(" Product not found for productid :: " + productid);
        }
		return product;
	}

}
