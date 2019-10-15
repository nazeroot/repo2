package cn.itheima.dao;

import cn.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> findAllUser();

    void add(User user);
    /**
     * map & pojo 不需要加@Param
     * 多参数建议加@Param ,不加就需要按照param1 param2 ...paramN
     * List & Array 可以不加@Param  如果不加@Param取值需要写list&array
     * 如果有多个List参数那么取值  param1 param2 ...paramN
     */
    void del(Integer id);

    User edit(Integer id);

    void doEdit(User user);
}
