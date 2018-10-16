package com.wuhao.service.Impl;

import com.wuhao.dao.usrDao;
import com.wuhao.model.usr;
import com.wuhao.service.usrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class usrServiceImpl implements usrService {

    @Autowired
    private usrDao usrdao;

    public usr getAllUsr() {

        return usrdao.getAllUsr();
    }
}