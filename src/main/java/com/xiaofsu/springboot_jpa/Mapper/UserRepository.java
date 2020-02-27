package com.xiaofsu.springboot_jpa.Mapper;

import com.xiaofsu.springboot_jpa.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

    @Query(value = "select count(*) from user", nativeQuery = true)
    int countUser();

    //这里是根据属性名来自定义查询方法
    List<User> findFirst3ByName(String name);

}
