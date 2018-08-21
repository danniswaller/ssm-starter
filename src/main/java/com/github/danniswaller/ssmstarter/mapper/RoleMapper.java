package com.github.danniswaller.ssmstarter.mapper;

import com.github.danniswaller.ssmstarter.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * Created by danniswalle on 2018/8/20.
 */

@Mapper
public interface RoleMapper {
    //~ Methods ----------------------------------------------------------------------------------------------------------

    /**
     * findByUserId.
     *
     * @param   userId  String
     *
     * @return  Set
     */
    @Select("SELECT s2.* FROM user_role s1 INNER JOIN role s2 ON s1.role_id=s2.id WHERE s1.user_id=#{userId}")
    Set<Role> findByUserId(@Param("userId") String userId);
}

