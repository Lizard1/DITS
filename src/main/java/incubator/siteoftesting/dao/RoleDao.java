package incubator.siteoftesting.dao;

import incubator.siteoftesting.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> findAllRoles();
    Role findRoleById(int id);
    void create(Role role);
    void update(Role role);
    void deleteRole(Role role);
}
