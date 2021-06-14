package com.tvmshoppingcart.addtocart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvmshoppingcart.addtocart.model.Payment;
import com.tvmshoppingcart.addtocart.repository.AddtocartPaymentRepository;
@Service
public class AddtocartPaymentServiceImpl implements AddtocartPaymentService {
	@Autowired
	private AddtocartPaymentRepository addtocartPaymentRepository;
	@Override
    public void saveAddtocartPayment(Payment payment) {
        this.addtocartPaymentRepository.save(payment);
    }
}
 