package com.harold.spring_jpa_jdbc_hibernate.rest_controller.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harold.spring_jpa_jdbc_hibernate.rest_controller.User;

public interface CustomerRepository extends JpaRepository<User, Integer> {

}
