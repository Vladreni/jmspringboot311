package jmspringboot311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jmspringboot311.dao.RoleDao;
import jmspringboot311.model.Role;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Transactional
    @Override
    public void addRole(Role role) {

        Role roleFromDB = roleDao.getDBRole(role.getRole());
        if (roleFromDB != null) {
            return ;
        }

        roleDao.addDBRole(role);
    }

}
