package com.github.danniswaller.ssmstarter.service.impl;

import com.github.danniswaller.ssmstarter.entity.Role;
import com.github.danniswaller.ssmstarter.entity.User;
import com.github.danniswaller.ssmstarter.mapper.RoleMapper;
import com.github.danniswaller.ssmstarter.mapper.UserMapper;
import com.github.danniswaller.ssmstarter.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by danniswalle on 2018/8/20.
 */

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    //~ Instance fields --------------------------------------------------------------------------------------------------

    @Autowired
    private RoleMapper roleMapper;

    @Autowired private UserMapper userMapper;

    //~ Methods ----------------------------------------------------------------------------------------------------------

    @Override public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    /**
     * @see  org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
     */
    @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.findByUsername(username);
        if(user!=null){
            Set<Role> roles = roleMapper.findByUserId(user.getId());
            Set<SimpleGrantedAuthority> authority = new HashSet<>();
            for(Role role: roles) {
                authority.add(new SimpleGrantedAuthority(role.getName()));
            }



            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authority);

        }else {
            throw new UsernameNotFoundException(String.format("User %s not found", username));
        }
    }


} // end class UserServiceImpl
