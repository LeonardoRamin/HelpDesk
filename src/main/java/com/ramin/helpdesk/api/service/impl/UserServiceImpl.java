package com.ramin.helpdesk.api.service.impl;

import com.ramin.helpdesk.api.entity.User;
import com.ramin.helpdesk.api.repository.UserRepository;
import com.ramin.helpdesk.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User createOrUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Page<User> findAll(int page, int count) {
        return null;
    }
}
