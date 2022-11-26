package com.example.sample1.dao;


import com.example.sample1.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  // 告诉springboot这是一个mybatis的mapepr类
@Repository   // 将userdao交由spring容齐管理
public interface UserDao {
    @Select("select username from users where userid=1")
    public String Test();

}

