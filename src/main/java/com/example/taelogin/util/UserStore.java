package com.example.taelogin.util;

import com.example.taelogin.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserStore {
    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(
                new User(
                        1,
                        "kakao_2774224107",
                        UUID.randomUUID().toString(),
                        "taeheoki@naver.com",
                        "kakao")
        );
    }

    public static void save(User user){
        userList.add(user);
    }

    public static User findByUsername(String username){
        for (User user: userList) {
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}
