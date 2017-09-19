package project.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import project.obj.StudentInfo;

import java.util.ArrayList;

/**
 * Created by Stephen on 2015/01/02.
 */
public class StudentInfoService {

    private static SessionFactory factory;

    private static ServiceRegistry serviceRegistry;

    public StudentInfoService() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public StudentInfo getStudent(int studentid) {

        Session session = factory.openSession();

        Transaction tr = null;

        StudentInfo result = null;

        try {

            tr = session.beginTransaction();

            result = (StudentInfo) session.get(StudentInfo.class, studentid);

            tr.commit();

        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    public ArrayList<StudentInfo> getAllStudent() {

        Session session = factory.openSession();

        Transaction tr = null;

        ArrayList<StudentInfo> result = null;

        try {

            tr = session.beginTransaction();

            result = (ArrayList<StudentInfo>) session.createQuery("FROM StudentInfo ").list();

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
