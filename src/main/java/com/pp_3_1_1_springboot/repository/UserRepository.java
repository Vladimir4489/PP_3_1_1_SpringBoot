package com.pp_3_1_1_springboot.repository;

import com.pp_3_1_1_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
