package project.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import project.obj.TeaCourse;

import java.util.ArrayList;

/**
 * Created by Stephen on 2015/01/04.
 */
public class TeaCourseService {

    private static SessionFactory factory;

    private static ServiceRegistry serviceRegistry;

    public TeaCourseService() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public ArrayList<TeaCourse> getTeaCourse(int teacherID) {

        Session session = factory.openSession();

        Transaction tr = null;

        ArrayList<TeaCourse> result = null;

        try {

            tr = session.beginTransaction();

            result = (ArrayList<TeaCourse>) session.createQuery("FROM TeaCourse WHERE teacherid = :tid").setParameter("tid", teacherID).list();

            tr.commit();

        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

}
