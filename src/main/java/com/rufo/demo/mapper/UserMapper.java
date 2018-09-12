package com.rufo.demo.mapper;

import com.rufo.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    /**
     * 根据用户名查询用户结果集
     *
     * @param user_login 用户名
     * @return 查询结果
     */
    @Select("SELECT ID,user_login,user_pass FROM wp_users WHERE user_login = #{user_login} limit 1")
    User findByUsername(@Param("user_login") String user_login);


    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 成功 1 失败 0
     */
    int insert(User user);
}
