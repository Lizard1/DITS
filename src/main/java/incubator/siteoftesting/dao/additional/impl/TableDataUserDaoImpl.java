package incubator.siteoftesting.dao.additional.impl;

import incubator.siteoftesting.dao.additional.TableDataUserDao;
import incubator.siteoftesting.model.additional.TableDataUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TableDataUserDaoImpl implements TableDataUserDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<TableDataUser> findDataForUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("").list();
    }
}
