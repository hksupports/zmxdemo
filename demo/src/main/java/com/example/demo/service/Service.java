package com.example.demo.service;

import com.example.demo.dao.Base;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;

/**
 * Created by Administrator on 2019/7/16.
 */
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Base dao;

    public void del(){
        dao.del();
    }
}
