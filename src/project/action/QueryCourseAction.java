package project.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import project.obj.Course;
import project.service.CourseService;

import java.util.ArrayList;
import java.util.Map;


public class QueryCourseAction extends ActionSupport implements SessionAware {

    public ArrayList<Course> course = null;
    private SessionMap<String, Object> session;
    private int courseid;
    private int loginID;

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public SessionMap<String, Object> getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = (SessionMap) session;
        session.put("login", "true");
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public String execute() {
        CourseService cs = new CourseService();
        course = cs.getAllCourse();
        return "success";

    }

}
