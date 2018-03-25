package com.comi.ap.service;

import java.util.Date;

import com.comi.ap.model.Data;
import com.comi.ap.utils.HibernateUtil;

import org.apache.log4j.Logger;
import org.hibernate.Session;

public class MyService {

    private static final Logger logger = Logger.getLogger(MyService.class);

    public Data data;

    public void setData(Data data) {
        this.data = data;
    }

    public void insertData(String name, Date date) {

        logger.info("Open Session...");
        Session session = HibernateUtil.getSessionFactory().openSession();


        logger.info("Begin Transaction...");
        session.beginTransaction();

        logger.info("Set Data...");
        logger.debug("Name=" + name + ", Date=" + date);

        logger.debug("setName");

        data.setName(name);

        logger.debug("setDate");
        data.setDate(date);

        logger.info("Save...");
        session.save(data);
        session.getTransaction().commit();

        HibernateUtil.close();
    }
}