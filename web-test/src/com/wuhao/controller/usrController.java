package com.wuhao.controller;

import com.wuhao.service.usrService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class usrController {
    @Resource
    private usrService usrservice;

    @RequestMapping(value="/allusr/{id}")
    public String getallusr(@PathVariable("id") int id){

        System.out.println(id);
        return usrservice.getAllUsr().toString();
    }
}