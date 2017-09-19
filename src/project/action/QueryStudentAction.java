package project.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import project.obj.StudentInfo;
import project.service.StudentInfoService;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Stephen on 1/6/2015.
 */
public class QueryStudentAction extends ActionSupport implements SessionAware {

    private SessionMap<String, Object> session;
    private int studentid;
    private String studentname;
    private String gender;
    private String email;
    private String phone;
    private String stupass;


    private ArrayList<StudentInfo> student = null;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStupass() {
        return stupass;
    }

    public void setStupass(String stupass) {
        this.stupass = stupass;
    }

    public ArrayList<StudentInfo> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<StudentInfo> student) {
        this.student = student;
    }

    public String execute() {

        StudentInfoService sic = new StudentInfoService();

        student = sic.getAllStudent();

        session.put("selectedStudent", studentid);

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

