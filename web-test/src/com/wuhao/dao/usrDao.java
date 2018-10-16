package com.wuhao.dao;

import com.wuhao.model.usr;
import org.springframework.stereotype.Repository;

@Repository
public interface usrDao {

    /*
    获取所有user
     */
    public usr getAllUsr();

}