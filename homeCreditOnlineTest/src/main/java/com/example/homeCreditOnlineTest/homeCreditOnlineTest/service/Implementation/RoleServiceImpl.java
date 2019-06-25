package com.example.homeCreditOnlineTest.homeCreditOnlineTest.service.Implementation;

import com.example.homeCreditOnlineTest.homeCreditOnlineTest.model.Role;
import com.example.homeCreditOnlineTest.homeCreditOnlineTest.repository.RoleRepository;
import com.example.homeCreditOnlineTest.homeCreditOnlineTest.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }
}
