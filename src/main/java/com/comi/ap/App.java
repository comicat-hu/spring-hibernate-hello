package com.comi.ap;

import com.comi.ap.service.MyService;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static Logger logger = Logger.getLogger(App.class);

    private MyService myService;


    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"SpringBeans.xml"});
        App app = (App)context.getBean("app");

        app.execute();
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
