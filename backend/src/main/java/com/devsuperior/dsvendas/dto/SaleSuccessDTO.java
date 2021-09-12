package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long visited;
	
	private Long deals;
	
	private String sellerName;
	
	public SaleSuccessDTO(){
			
	}

	public SaleSuccessDTO(Long visited, Long deals, Seller seller) {
		this.visited = visited;
		this.deals = deals;
		this.sellerName = seller.getName();
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}	

}
