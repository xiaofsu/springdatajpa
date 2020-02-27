package com.xiaofsu.springboot_jpa.Service.Impl;

import com.xiaofsu.springboot_jpa.Mapper.UserRepository;
import com.xiaofsu.springboot_jpa.Model.User;
import com.xiaofsu.springboot_jpa.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findFirst3ByName(String name){
        return userRepository.findFirst3ByName(name);
    }


    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User adddUser(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    @Override
    public boolean updateUser(User user2) {
        userRepository.save(user2);
        return false;
    }

    @Override
    public boolean deleteUser(User user2) {
        userRepository.delete(user2);
        return false;
    }

    @Override
    public int getCount() {
        return userRepository.countUser();
    }


}
