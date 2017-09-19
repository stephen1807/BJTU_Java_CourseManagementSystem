package project.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import project.service.StuCourseService;

import java.util.Map;

/**
 * Created by Stephen on 2015/01/06.
 */
public class SaveScoreAction extends ActionSupport implements SessionAware {

    private int courseid;
    private int studentID;
    private int homework;
    private int midexam;
    private int finalexam;
    private int adjustment;
    private int id;

    private SessionMap<String, Object> session;

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getHomework() {
        return homework;
    }

    @IntRangeFieldValidator(min = "0", max = "100", message = "Score must be between ${min} and ${max}")
    public void setHomework(int homework) {
        this.homework = homework;
    }

    public int getMidexam() {
        return midexam;
    }

    @IntRangeFieldValidator(min = "0", max = "100", message = "Score must be between ${min} and ${max}")
    public void setMidexam(int midexam) {
        this.midexam = midexam;
    }

    public int getFinalexam() {
        return finalexam;
    }

    @IntRangeFieldValidator(min = "0", max = "100", message = "Score must be between ${min} and ${max}")
    public void setFinalexam(int finalexam) {
        this.finalexam = finalexam;
    }

    public int getAdjustment() {
        return adjustment;
    }

    @IntRangeFieldValidator(min = "0", max = "100", message = "Score must be between ${min} and ${max}")
    public void setAdjustment(int adjustment) {
        this.adjustment = adjustment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String execute() {
        StuCourseService scs = new StuCourseService();

        scs.updateHomework(id, homework);
        scs.updateMidExam(id, midexam);
        scs.updateFinalExam(id, finalexam);

        float result = (float) (0.2 * homework + 0.3 * midexam + 0.5 * finalexam + adjustment);

        if (result < 0) {
            adjustment = 0;
            addActionMessage("Adjustment value has been adjusted to " + adjustment);
        } else if (result > 100) {
            adjustment -= result - 100;
            addActionMessage("Adjustment value has been adjusted to " + adjustment);
        }

        scs.updateAdjustment(id, adjustment);

        result = (float) (0.2 * homework + 0.3 * midexam + 0.5 * finalexam + adjustment);

        scs.updateFinalScore(id, (int) result);

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
