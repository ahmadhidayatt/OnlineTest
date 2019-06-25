package com.example.homeCreditOnlineTest.homeCreditOnlineTest.repository;

import com.example.homeCreditOnlineTest.homeCreditOnlineTest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
