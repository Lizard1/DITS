package incubator.siteoftesting.service;

import incubator.siteoftesting.model.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(int id);
    void create(Role role);
    void update(Role role);
    void deleteRole(Role role);
}
