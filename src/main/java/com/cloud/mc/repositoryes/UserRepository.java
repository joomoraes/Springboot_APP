package com.cloud.mc.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.mc.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
