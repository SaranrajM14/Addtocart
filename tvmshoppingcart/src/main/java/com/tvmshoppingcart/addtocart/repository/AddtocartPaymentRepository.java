package com.tvmshoppingcart.addtocart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvmshoppingcart.addtocart.model.Payment;
@Repository
public interface AddtocartPaymentRepository extends JpaRepository<Payment, Long > {

}
