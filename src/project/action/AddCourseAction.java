package project.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import project.obj.StuCourse;
import project.service.StuCourseService;

import java.util.Map;


public class AddCourseAction extends ActionSupport implements SessionAware {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private SessionMap<String, Object> session;

    private int courseid;
    private int studentid;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String execute() {
        StuCourse sc = new StuCourse();

        sc.setCourseid(courseid);
        sc.setStudentid(studentid);
        sc.setMidexam(0);
        sc.setAdjustment(0);
        sc.setHomework(0);
        sc.setFinalexam(0);
        sc.setFinalscore(0);

        StuCourseService scs = new StuCourseService();
        scs.insertStuCourse(sc);

        return "success";

    }


    public void setSession(SessionMap<String, Object> session) {
        this.session = session;
    }

    public SessionMap<String, Object> getSession() {
        return session;
    }


    public void setSession(Map map) {
        this.session = (SessionMap) map;

    }

}
