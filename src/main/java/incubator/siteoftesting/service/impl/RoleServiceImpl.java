package incubator.siteoftesting.service.impl;

import incubator.siteoftesting.dao.RoleDao;
import incubator.siteoftesting.model.Role;
import incubator.siteoftesting.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional
    public List<Role> getAllRoles() {
        return roleDao.findAllRoles();
    }

    @Override
    @Transactional
    public Role getRoleById(int id) {
        return roleDao.findRoleById(id);
    }

    @Override
    @Transactional
    public void create(Role role) {
        roleDao.create(role);
    }

    @Override
    @Transactional
    public void update(Role role) {
        roleDao.update(role);
    }

    @Override
    @Transactional
    public void deleteRole(Role role) {
        roleDao.deleteRole(role);
    }
}
