package com.tvmshoppingcart.addtocart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long cardno;
	private long expmonth;
	private long expyear;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public long getExpmonth() {
		return expmonth;
	}
	public void setExpmonth(long expmonth) {
		this.expmonth = expmonth;
	}
	public long getExpyear() {
		return expyear;
	}
	public void setExpyear(long expyear) {
		this.expyear = expyear;
	}
	

}
