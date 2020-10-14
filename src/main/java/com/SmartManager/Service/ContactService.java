package com.SmartManager.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SmartManager.Model.User;

public interface ContactService extends JpaRepository<User, Integer> {

}
