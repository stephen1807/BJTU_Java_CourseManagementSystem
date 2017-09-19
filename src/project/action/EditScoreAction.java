package project.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import project.obj.Course;
import project.obj.StuCourse;
import project.service.CourseService;
import project.service.StuCourseService;

import java.util.ArrayList;
import java.util.Map;


public class EditScoreAction extends ActionSupport implements SessionAware {

    private SessionMap<String, Object> session;
    private int id;
    private int courseid;
    private int studentid;

    private ArrayList<StuCourseN> stuc = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public ArrayList<StuCourseN> getStuc() {
        return stuc;
    }

    public void setStuc(ArrayList<StuCourseN> stuc) {
        this.stuc = stuc;
    }

    public String execute() {
        StuCourseService scs = new StuCourseService();

        stuc = new ArrayList<StuCourseN>();

        for (StuCourse sc : scs.getStuCourseByStuID(studentid)) {

            StuCourseN scn = new StuCourseN();

            scn.parse(sc);

            stuc.add(scn);
        }

        return "success";

    }

    public SessionMap<String, Object> getSession() {
        return session;
    }

    public void setSession(Map map) {
        this.session = (SessionMap) map;
    }

    private class StuCourseN {
        private int courseid;
        private String coursename;
        private int studentid;
        private int homework;
        private int midexam;
        private int finalexam;
        private int adjustment;
        private int finalscore;
        private int id;

        public void parse(StuCourse stu) {
            this.courseid = stu.getCourseid();
            this.studentid = stu.getStudentid();
            this.homework = stu.getHomework();
            this.midexam = stu.getMidexam();
            this.finalexam = stu.getFinalexam();
            this.adjustment = stu.getAdjustment();
            this.finalscore = stu.getFinalscore();
            this.id = stu.getId();

            CourseService cs = new CourseService();

            for (Course c : cs.getAllCourse()) {
                if (c.getCourseid() == stu.getCourseid()) {
                    this.coursename = c.getCoursename();
                }
            }
        }


        public int getCourseid() {
            return courseid;
        }

        public void setCourseid(int courseid) {
            this.courseid = courseid;
        }

        public String getCoursename() {
            return coursename;
        }

        public void setCoursename(String coursename) {
            this.coursename = coursename;
        }

        public int getStudentid() {
            return studentid;
        }

        public void setStudentid(int studentid) {
            this.studentid = studentid;
        }

        public int getHomework() {
            return homework;
        }

        public void setHomework(int homework) {
            this.homework = homework;
        }

        public int getMidexam() {
            return midexam;
        }

        public void setMidexam(int midexam) {
            this.midexam = midexam;
        }

        public int getFinalexam() {
            return finalexam;
        }

        public void setFinalexam(int finalexam) {
            this.finalexam = finalexam;
        }

        public int getAdjustment() {
            return adjustment;
        }

        public void setAdjustment(int adjustment) {
            this.adjustment = adjustment;
        }

        public int getFinalscore() {
            return finalscore;
        }

        public void setFinalscore(int finalscore) {
            this.finalscore = finalscore;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}
