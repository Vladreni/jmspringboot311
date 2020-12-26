package jmspringboot311.dao;

import jmspringboot311.model.Role;

public interface RoleDao {
    Role getDBRole(String role);
    void addDBRole(Role role);
}
