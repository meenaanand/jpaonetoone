package com.kgisl.jpa.jpaonetoonedemo.repository;

import com.kgisl.jpa.jpaonetoonedemo.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}