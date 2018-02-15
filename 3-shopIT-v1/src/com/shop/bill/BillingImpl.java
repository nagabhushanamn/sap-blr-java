package com.shop.bill;

import com.shop.pm.PriceMatrixImpl_v1;

/*
 *  design/performance issues
 *  -------------------------
 *  
 *  1. tight-coupling b/w dependent & dependency
 *  
 *  		==> can'textend with new-features 
 *  
 *  2. too many duplicate dependency instances are created & destructed
 *  
 *  		==> slow,memory use high
 *  
 *  3. Unit-Testing not possible
 *  
 *     ==> dev/bug-fix slow
 * 
 *   --------------------------------------------------------------
 *   
 *   why these issues ?
 *   
 *   ==> dependent itself creating its own dependency
 *   
 *   soln:
 *   
 *     ==> don't create dependency in dependent's class , do lookup
 *     
 *   limitation on lookup:
 *     
 *     ==> location tight-coupling
 *     
 *   better Soln:
 *   
 *     	==> dont create/lookup , inject thru 'some-one' ( Inversion of Control ) ==> IOC
 *     
 *   how to implement IOC ?
 *   
 *     => using 'Dependency Injection '  ( DI )
 *     
 *     		types
 *     		------
 *     
 *           --> constructor DI
 *           --> setter DI
 *           
 *    -----------------------------------------------------------------
 *    
 *         S.O.L.I.D. STANDS FOR:
 *         
			S — Single responsibility principle
			O — Open for extension & closed for modification principle
			L — Liskov substitution principle
			I — Interface segregation principle
			D — Dependency Inversion principle

 *        
 *   
 * 
 */
public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix;

	public double getTotalPrice(String[] cart) {
		double total = 0.0;
		priceMatrix=new PriceMatrixImpl_v1();
		for(String item:cart) {
			total+=priceMatrix.getPrice(item);
		}
		return total;
	}

}
