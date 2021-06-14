package com.tvmshoppingcart.addtocart.service;

import java.util.List;
import java.util.Optional;

import com.tvmshoppingcart.addtocart.model.Addtocart;

public interface AddtocartService {
	List< Addtocart > getAllAddtocart();
	void saveAddtocart(Addtocart addtocart);
	Addtocart getAddtocartById(long userid);
	List<Addtocart> getAllAddtocartByUserid(String userid);
    void deleteAddtocartById(long userid);
    public List<Addtocart> findUserid1All(long userid1);
    
   
}
