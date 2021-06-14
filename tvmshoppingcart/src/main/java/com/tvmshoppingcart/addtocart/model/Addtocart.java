package com.tvmshoppingcart.addtocart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addtocart")
public class Addtocart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String userid;
	private long userid1;
	private long productid;
	private String productname;
	private long productqty;
	private long productprice;
	private long finalprice;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	//<td> <a th:href="@{/showFormForProduct/{userid}(userid=${addtocart.userid})}/{productid}(productid=${addtocart.productid})}" class="btn btn-primary">Update</a></td>
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public long getProductqty() {
		return productqty;
	}
	public void setProductqty(long productqty) {
		this.productqty = productqty;
	}
	public long getProductprice() {
		return productprice;
	}
	public void setProductprice(long productprice) {
		this.productprice = productprice;
	}
	public long getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(long finalprice) {
		this.finalprice =productqty*productprice;
	}
	public long getUserid1() {
		return userid1;
	}
	public void setUserid1(long userid1) {
		this.userid1 = userid1;
	}
	
	
	
}
