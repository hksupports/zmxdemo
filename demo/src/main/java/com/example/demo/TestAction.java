package com.example.demo;

import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/16.
 */
@RestController
public class TestAction {
    @Autowired
    private Service service;

    @RequestMapping("/show.do")
    public void show(){
        service.del();
    }
}
