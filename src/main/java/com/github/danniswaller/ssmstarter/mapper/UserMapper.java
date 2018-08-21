package com.github.danniswaller.ssmstarter.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.github.danniswaller.ssmstarter.entity.User;

import java.util.List;

/**
 * Created by danniswalle on 2018/8/20.
 */
@Mapper public interface UserMapper {

    @Select("SELECT * FROM user WHERE username=#{username}")
    User findByUsername(@Param("username") String username);

    @Select("SELECT * FROM user")
    List<User> findAllUsers();
}