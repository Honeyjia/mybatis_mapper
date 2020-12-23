package com.jiacool.dao;

import com.jiacool.domain.User;

import java.util.List;

public interface UserMapper {

//    条件查询 if
    public List<User> findByCondition(User user);

//    in 集合查询 foreach
    public List<User> findByIds(List<Integer> list);
}
