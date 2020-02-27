package com.xiaofsu.springboot_jpa;

import com.xiaofsu.springboot_jpa.Model.User;
import com.xiaofsu.springboot_jpa.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootTest
class SpringbootJpaApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    void contextLoads() {

        User user = new User();
        user.setAge("20");
        user.setName("Name");
        user.setSex("1");
        userService.adddUser(user);

        User user2 = new User();
        user2.setId("3");
        user2.setAge("20");
        user2.setName("Name");
        user2.setSex("1");
        userService.updateUser(user2);

        userService.deleteUser(user2);


        List<User> allUser = userService.getAllUser();
        allUser.forEach(user1 ->{
            System.out.println(user1);
        });


        int count = userService.getCount();
        System.out.println("当前数据库中有"+count+"条数据！");

        List<User> name = userService.findFirst3ByName("Name");
        name.forEach(user1 -> {
            System.out.println(user1);
        });

    }

}
