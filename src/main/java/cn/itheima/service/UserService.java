package cn.itheima.service;

import cn.itheima.pojo.User;

import java.util.List;
public interface UserService {
    List<User> haha();

    void add(User user);

    void del(Integer id);

    User edit(Integer id);

    void doEdit(User user);
}
