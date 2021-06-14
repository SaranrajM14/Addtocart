package com.tvmshoppingcart.addtocart.service;


import com.tvmshoppingcart.addtocart.model.Product;

public interface AddtocartProductService {
	void saveProduct(Product Product);
	Product getProductById(long productid);

}
