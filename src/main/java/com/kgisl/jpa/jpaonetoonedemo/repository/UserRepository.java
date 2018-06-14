package com.kgisl.jpa.jpaonetoonedemo.repository;

import com.kgisl.jpa.jpaonetoonedemo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}