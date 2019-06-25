package com.example.homeCreditOnlineTest.homeCreditOnlineTest.service;

import com.example.homeCreditOnlineTest.homeCreditOnlineTest.model.User;
import com.example.homeCreditOnlineTest.homeCreditOnlineTest.request.UserRequest;

import java.util.List;

public interface UserServices {
    List<User> index(String key);

    User get(String id);

    String delete(String id);
}
