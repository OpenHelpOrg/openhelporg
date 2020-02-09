package com.capstone.openhelp.repositories;


import com.capstone.openhelp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    User getByName(String name);
    User findByName(String name);
////    User findByEmail(String email);
//
    User findByEmail(String email);
//
//    User findByEmailIs(String email);

}

