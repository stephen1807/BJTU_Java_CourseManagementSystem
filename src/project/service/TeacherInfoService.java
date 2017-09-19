package project.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import project.obj.TeacherInfo;

/**
 * Created by Stephen on 2015/01/02.
 */
public class TeacherInfoService {

    private static SessionFactory factory;

    private static ServiceRegistry serviceRegistry;

    public TeacherInfoService() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            factory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public TeacherInfo getTeacher(int teacherID) {

        Session session = factory.openSession();

        Transaction tr = null;

        TeacherInfo result = null;

        try {

            tr = session.beginTransaction();

            result = (TeacherInfo) session.get(TeacherInfo.class, teacherID);

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
