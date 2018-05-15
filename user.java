package com.example.demoweb.controller;

import com.example.demoweb.bean.Subject;
import com.example.demoweb.bean.User;
import com.example.demoweb.service.SubjectService;
import com.example.demoweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/user/list")
    public void  list(){
       List<User> users = userService.selectUser();
       System.out.println("查询到的User数据为："+users);
    }

    @GetMapping("/add")
    public void add(){
  /*      int id =13;
        User user = new User();
        user.setId(id);
        user.setAge(20);
        user.setName("jocket");
        userService.addUser(user);

        Subject subject = new Subject();
        subject.setId(id);
        subject.setName("语文");
        subject.setType("教育");
        subjectService.addSubject(subject);*/
        userService.addUserAndSubject();
    }
}
