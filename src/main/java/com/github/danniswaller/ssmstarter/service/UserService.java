package com.github.danniswaller.ssmstarter.service;
import com.github.danniswaller.ssmstarter.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by danniswalle on 2018/8/20.
 */
public interface UserService extends UserDetailsService {
    List<User> findAllUsers();

}