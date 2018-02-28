package com.vendor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Container {

	public void processReq(String url,String arg1,String arg2) throws ClassNotFoundException, InstantiationException, IllegalAccessException,IllegalArgumentException, InvocationTargetException {

		Class<?> clazz = Class.forName("com.developer.UserComponent"); // dynamic class Loading
		Object comp = clazz.newInstance(); // e.g Object comp=new UserComponent()
		
		
		// usinf 'Reflection API'
		Method[] methods = clazz.getMethods();// methods reflecting
		for (Method method : methods) {
			RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
			if (requestMapping != null) {
				String urlInMethod = requestMapping.url();
				if (url.equals(urlInMethod)) {
					method.invoke(comp, new Object[] { arg1,arg2}); // comp.doXXX();
				}
			}
		}

	}

}
