package com.ramin.helpdesk.api.service.impl;

import com.ramin.helpdesk.api.repository.UserRepository;
import com.ramin.helpdesk.api.security.entity.User;
import com.ramin.helpdesk.api.service.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User createOrUpdate(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    public void delete(String id) {
    	userRepository.deleteById(id);
    }

    public Page<User> findAll(int page, int count) {
    	Pageable pageable = PageRequest.of(page, count);
        return userRepository.findAll(pageable);
    }
}
