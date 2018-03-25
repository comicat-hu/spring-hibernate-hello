package com.comi.ap.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContext {

    private static ClassPathXmlApplicationContext context;

    public static ClassPathXmlApplicationContext getContext(String[] contextXmls) {

		if(context == null) {
            init(contextXmls);
        }
		
		return context;
    }
    
    public static void close() {
        context.close();
    }
	
	private static void init(String[] contextXmls) {
		context =  new ClassPathXmlApplicationContext(contextXmls);		
	}
}