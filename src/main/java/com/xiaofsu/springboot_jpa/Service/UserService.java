package com.xiaofsu.springboot_jpa.Service;

import com.xiaofsu.springboot_jpa.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User adddUser(User user);

    boolean updateUser(User user2);

    boolean deleteUser(User user2);

    int getCount();

    List<User> findFirst3ByName(String name);
}
