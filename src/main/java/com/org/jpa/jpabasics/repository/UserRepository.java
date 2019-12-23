package com.org.jpa.jpabasics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.jpa.jpabasics.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
