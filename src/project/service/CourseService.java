package project.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import project.obj.Course;

import java.util.ArrayList;

/**
 * Created by Stephen on 2015/01/02.
 */
public class CourseService {

    private static SessionFactory factory;

    private static ServiceRegistry serviceRegistry;

    public CourseService() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void insertCourse(Course course) {

        Session session = factory.openSession();

        Transaction tr = null;

        try {

            tr = session.beginTransaction();

            session.save(course);

            tr.commit();

        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public ArrayList<Course> getAllCourse() {

        Session session = factory.openSession();

        Transaction tr = null;

        ArrayList<Course> result = null;

        try {

            tr = session.beginTransaction();

            result = (ArrayList<Course>) session.createQuery("FROM Course").list();

            tr.commit();

        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    public Course getCourse(int courseID) {

        Session session = factory.openSession();

        Transaction tr = null;

        Course result = null;

        try {

            tr = session.beginTransaction();

            result = (Course) session.get(Course.class, courseID);

            tr.commit();

        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    public void updateMinScore(int courseID, int minscore) {

        Session session = factory.openSession();

        Transaction tr = null;

        try {

            tr = session.beginTransaction();

            Course temp = (Course) session.get(Course.class, courseID);

            temp.setMinscore(minscore);

            session.save(temp);

            tr.commit();

        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
