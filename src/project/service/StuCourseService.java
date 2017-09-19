package project.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import project.obj.StuCourse;

import java.util.ArrayList;

/**
 * Created by Stephen on 2015/01/02.
 */
public class StuCourseService {

    private static SessionFactory factory;

    private static ServiceRegistry serviceRegistry;

    public StuCourseService() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }


    public void insertStuCourse(StuCourse stuc) {

        Session session = factory.openSession();

        Transaction tr = null;

        try {

            tr = session.beginTransaction();

            session.save(stuc);

            tr.commit();

        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteStuCourse(int id) {

        Session session = factory.openSession();
        Transaction tr = null;

        try {
            tr = session.beginTransaction();

            StuCourse stu = (StuCourse) session.get(StuCourse.class, id);

            session.delete(stu);

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public StuCourse getStuCourse(int studentid, int courseid) {

        Session session = factory.openSession();

        Transaction tr = null;

        StuCourse result = null;

        try {
            tr = session.beginTransaction();

            ArrayList<StuCourse> temp = (ArrayList<StuCourse>) session.createQuery("FROM  StuCourse  WHERE studentid = :stuid AND courseid = :courseid")
                    .setParameter("stuid", studentid).setParameter("courseid", courseid).list();

            if (!temp.isEmpty()) {
                result = temp.get(0);
            }

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    public ArrayList<StuCourse> getStuCourseByStuID(int studentID) {

        Session session = factory.openSession();

        Transaction tr = null;

        ArrayList<StuCourse> result = null;

        try {
            tr = session.beginTransaction();

            result = (ArrayList<StuCourse>) session.createQuery("FROM StuCourse WHERE studentid = :stuid").setParameter("stuid", studentID).list();

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    public ArrayList<StuCourse> getStuCourseByCourseID(int courseID) {

        Session session = factory.openSession();

        Transaction tr = null;

        ArrayList<StuCourse> result = null;

        try {
            tr = session.beginTransaction();

            result = (ArrayList<StuCourse>) session.createQuery("FROM StuCourse WHERE courseid = :cid").setParameter("cid", courseID).list();

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

    public void updateMidExam(int id, int midexam) {
        Session session = factory.openSession();

        Transaction tr = null;

        try {
            tr = session.beginTransaction();

            StuCourse stu = (StuCourse) session.get(StuCourse.class, id);


            stu.setMidexam(midexam);

            session.save(stu);

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateFinalExam(int id, int finalexam) {
        Session session = factory.openSession();
        Transaction tr = null;

        try {
            tr = session.beginTransaction();

            StuCourse stu = (StuCourse) session.get(StuCourse.class, id);


            stu.setFinalexam(finalexam);

            session.save(stu);

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateHomework(int id, int homework) {
        Session session = factory.openSession();

        Transaction tr = null;

        try {
            tr = session.beginTransaction();

            StuCourse stu = (StuCourse) session.get(StuCourse.class, id);

            stu.setHomework(homework);

            session.save(stu);

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateAdjustment(int id, int adjustment) {
        Session session = factory.openSession();

        Transaction tr = null;

        try {
            tr = session.beginTransaction();

            StuCourse stu = (StuCourse) session.get(StuCourse.class, id);


            stu.setAdjustment(adjustment);

            session.save(stu);

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateFinalScore(int id, int finalscore) {

        Session session = factory.openSession();

        Transaction tr = null;

        try {
            tr = session.beginTransaction();

            StuCourse stu = (StuCourse) session.get(StuCourse.class, id);

            stu.setFinalscore(finalscore);

            session.save(stu);

            tr.commit();
        } catch (HibernateException e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
