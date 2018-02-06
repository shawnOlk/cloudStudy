package com.cloudstudy.dao;

import com.cloudstudy.domain.UserBean;
import org.apache.ibatis.annotations.Param;

/**
 * Created by lenovo on 2016/9/2.
 */
public interface UserDao {
    UserBean selectByPrimaryKey(Long id);
    UserBean selectByPrimaryName(String name);
    void deleteByPrimaryKey(Long id);
    long insert(@Param("query") UserBean userBean);
    void update(Long id,@Param("query") UserBean userBean);
}
