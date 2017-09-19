package project.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import project.obj.StuCourse;
import project.service.CourseService;

import java.util.ArrayList;
import java.util.Map;


public class EditCourseAction extends ActionSupport implements SessionAware {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private SessionMap<String, Object> session;
    private int courseid;
    private int minscore;

    private ArrayList<StuCourse> stuc = null;

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public int getMinscore() {
        return minscore;
    }

    public void setMinscore(int minscore) {
        this.minscore = minscore;
    }


    public ArrayList<StuCourse> getStuc() {
        return stuc;
    }

    public void setStuc(ArrayList<StuCourse> stuc) {
        this.stuc = stuc;
    }

    public String execute() {
        CourseService cs = new CourseService();

        cs.updateMinScore(courseid, minscore);

        return "success";

    }


    public void setSession(Map map) {
        this.session = (SessionMap) map;

    }

    public SessionMap<String, Object> getSession() {
        return session;
    }

    public void setSession(SessionMap<String, Object> session) {
        this.session = session;
    }


}
