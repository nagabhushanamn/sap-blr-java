package com.shop;

import java.util.Scanner;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init..
		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();
		Billing billComp = new BillingImpl(priceMatrixV2); // DI

		// use...
		String[] cart = { "345678", "674567" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);
		System.out.println("Happy shopping");

		// close..
		billComp = null;

	}

}
