package com.example.homeCreditOnlineTest.homeCreditOnlineTest.repository;

import com.example.homeCreditOnlineTest.homeCreditOnlineTest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAllByNameContaining(String key);

}
