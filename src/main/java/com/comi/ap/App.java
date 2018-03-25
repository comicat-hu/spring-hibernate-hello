package com.comi.ap;

import com.comi.ap.service.MyService;
import com.comi.ap.utils.SpringContext;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final Logger logger = Logger.getLogger(App.class);

    private MyService myService;


    public static void main( String[] args ) {
        String[] contextXmls = {"SpringBeans.xml"};
        ClassPathXmlApplicationContext context = SpringContext.getContext(contextXmls);
        App app = (App)context.getBean("app");

        logger.info("App Execute...");
        app.execute();
        

        context.close();
    }

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public MyService getMyService() {
        return this.myService;
    }

    public void execute() {
        this.myService.run();
    }
}
