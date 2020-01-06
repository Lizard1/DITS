package incubator.siteoftesting.dao.impl;

import incubator.siteoftesting.dao.RoleDao;
import incubator.siteoftesting.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Role> findAllRoles() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Role").list();
    }

    @Override
    public Role findRoleById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Role.class, id);
    }

    @Override
    public void create(Role role) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(role);
    }

    @Override
    public void update(Role role) {
        Session session = sessionFactory.getCurrentSession();
        session.update(role);
    }

    @Override
    public void deleteRole(Role role) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(role);
    }
}
