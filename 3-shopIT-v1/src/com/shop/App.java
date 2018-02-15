package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init..
		BillingImpl billComp = new BillingImpl();

		// use...
		String[] cart = { "345678", "674567" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);
		System.out.println("Happy shopping");

		// close..
		billComp = null;

	}

}
