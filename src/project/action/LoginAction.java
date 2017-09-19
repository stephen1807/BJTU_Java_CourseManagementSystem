package project.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import project.obj.StudentInfo;
import project.obj.TeacherInfo;
import project.service.StudentInfoService;
import project.service.TeacherInfoService;

import java.util.Map;

/**
 * Created by Stephen on 2015/01/02.
 */
public class LoginAction extends ActionSupport implements SessionAware {

    private int loginID;
    private String loginpass;


    private SessionMap<String, Object> session;

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    public void setSession(Map map) {
        this.session = (SessionMap) map;
        session.put("login", "true");
    }

    public String execute() {

        TeacherInfoService tis = new TeacherInfoService();

        TeacherInfo ti = tis.getTeacher(loginID);

        if (ti == null) {

            StudentInfoService sis = new StudentInfoService();

            StudentInfo si = sis.getStudent(loginID);

            if (si != null) {
                if (si.getStupass().equals(loginpass)) {
                    session.put("accounttype", "student");
                    session.put("accountid", loginID);
                    return "login_student";
                }
            }

        } else {
            if (ti.getTpass().equals(loginpass)) {
                session.put("accounttype", "teacher");
                session.put("accountid", loginID);
                return "login_teacher";
            }
        }
        addActionError("Invalid Login ID / Password");
        return "login_error";


    }

    public String logout() {
        session.invalidate();
        return "logout_success";
    }
}
