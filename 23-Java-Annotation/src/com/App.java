package com;

import java.util.concurrent.TimeUnit;

import com.vendor.Container;

public class App {

	public static void main(String[] args) throws Exception {

		Container container = new Container();
		
		//TimeUnit.SECONDS.sleep(2);
		//container.processReq("/register","Nag","secret");
		TimeUnit.SECONDS.sleep(2);
		container.processReq("/login","Nag","secret");

	}

}
