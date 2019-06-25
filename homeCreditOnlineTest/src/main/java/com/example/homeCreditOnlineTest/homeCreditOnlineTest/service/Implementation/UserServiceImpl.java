package com.example.homeCreditOnlineTest.homeCreditOnlineTest.service.Implementation;

import com.example.homeCreditOnlineTest.homeCreditOnlineTest.model.User;
import com.example.homeCreditOnlineTest.homeCreditOnlineTest.repository.RoleRepository;
import com.example.homeCreditOnlineTest.homeCreditOnlineTest.repository.UserRepository;
import com.example.homeCreditOnlineTest.homeCreditOnlineTest.request.UserRequest;
import com.example.homeCreditOnlineTest.homeCreditOnlineTest.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<User> index(String key) {
        return userRepository.findAllByNameContaining(key);
    }

    @Override
    public User get(String id) {
        return userRepository.getOne(id);
    }


    @Override
    public String delete(String id) {
        return userRepository.getOne(id) == null ? "USER TIDAK ADA" : id + " BERHASIL DIHAPUS";
    }
}
