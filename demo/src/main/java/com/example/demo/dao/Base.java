package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * Created by Administrator on 2019/7/16.
 */
@Mapper
public interface Base {
    @Update("truncate demo")
    public void del();
}
