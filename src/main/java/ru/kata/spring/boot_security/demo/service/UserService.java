package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    public List<User> findByName(String name);
    public User findOne(Long id);
    public void save(User user);
    public void update(Long id, User updatedUser);
    public void delete(Long id);

}
