package com.tvmshoppingcart.addtocart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvmshoppingcart.addtocart.model.User;
@Repository
public interface AddtocartUserRepository extends JpaRepository<User, Long> {

}
