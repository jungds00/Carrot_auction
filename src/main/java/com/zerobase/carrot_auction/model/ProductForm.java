package com.zerobase.carrot_auction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm {

	private String title;
	private boolean auctionYn;
	private String siDo;
	private String guGun;
	private int price;
	private String description;
	private int endPeriod;
}
