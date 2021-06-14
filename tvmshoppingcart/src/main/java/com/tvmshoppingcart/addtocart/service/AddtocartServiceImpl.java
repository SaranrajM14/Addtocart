package com.tvmshoppingcart.addtocart.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.tvmshoppingcart.addtocart.model.Addtocart;
import com.tvmshoppingcart.addtocart.repository.AddtocartRepository;
import com.tvmshoppingcart.addtocart.service.AddtocartService;
@Service
public class AddtocartServiceImpl implements AddtocartService {
	@Autowired
	private AddtocartRepository addtocartRepository;
	@Override
    public List < Addtocart > getAllAddtocart() {
        return addtocartRepository.findAll();
    }
	
	 @Override
	    public void saveAddtocart(Addtocart addtocart) {
	        this.addtocartRepository.save(addtocart);
	    }
	 @Override
	    public Addtocart getAddtocartById(long userid) {
	        Optional < Addtocart > optional = addtocartRepository.findById(userid);
	        Addtocart addtocart = null;
	        if (optional.isPresent()) {
	           addtocart = optional.get();
	        } else {
	            throw new RuntimeException(" Employee not found for id :: " + userid);
	        }
	        return addtocart;
	    }
	 
	 
	 @Override
	    public void deleteAddtocartById(long userid) {
	        this.addtocartRepository.deleteById(userid);
	    }
	 @Override
	    public List < Addtocart > getAllAddtocartByUserid(String userid) {
	        return addtocartRepository.findAll(userid);
	    }
	 
	 @Override
	 public List<Addtocart> findUserid1All(long userid1){
		 return addtocartRepository.findAll(userid1);
	 }
}
