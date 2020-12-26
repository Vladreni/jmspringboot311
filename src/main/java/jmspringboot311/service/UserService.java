package jmspringboot311.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import jmspringboot311.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);
    List<User> listUsers();
    void del(User user);
    void update(User user);
    User getUserById(Long id);

    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
