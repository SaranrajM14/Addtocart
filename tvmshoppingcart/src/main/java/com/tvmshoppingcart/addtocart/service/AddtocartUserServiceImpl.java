package com.tvmshoppingcart.addtocart.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvmshoppingcart.addtocart.model.User;
import com.tvmshoppingcart.addtocart.repository.AddtocartUserRepository;
import com.tvmshoppingcart.addtocart.service.AddtocartUserService;
@Service
public class AddtocartUserServiceImpl implements AddtocartUserService {

	@Autowired
	private AddtocartUserRepository addtocartUsersRepository;
	@Override
    public User getUserById(long userid) {
        Optional < User > optional = addtocartUsersRepository.findById(userid);
        User user = null;
        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + userid);
        }
        return user;
    }
}
