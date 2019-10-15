package cn.itheima.web;

import cn.itheima.pojo.User;
import cn.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/haha")
    public List<User> haha(){ return userService.haha(); }

    @RequestMapping("/add")
    public boolean add(@RequestBody User user){
        userService.add(user);
        return true;
    }
    /**
     * 页面传的是json数据，后端使用map 或者 pojo时 需要加@RequestBody
     * 基本类型 & 数组 & MultipartFile 只要保持页面的参数名称和controller方法形参一致就不用加@RequestParam
     * List 不管名字一不一样 必须加@RequestParam
     * @return
     */
    @RequestMapping("del")
    public boolean del(Integer id){
        System.out.println(id);
        userService.del(id);
        return true;
    }
    @RequestMapping("edit")
    public User edit(Integer id){
        System.out.println(id);
        return  userService.edit(id);
    }
    @RequestMapping("doEdit")
    public boolean doEdit(@RequestBody User user){
        System.out.println(user);
        userService.doEdit(user);
        return true;
    }

}
