package project.obj;

import javax.persistence.*;

/**
 * Created by Stephen on 2015/01/02.
 */
@Entity
public class StuCourse {
    private int id;
    private int studentid;
    private int courseid;
    private Integer midexam;
    private Integer finalexam;
    private Integer homework;
    private Integer adjustment;
    private Integer finalscore;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT NOT NULL AUTO_INCREMENT")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "studentid")
    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    @Basic
    @Column(name = "courseid")
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Basic
    @Column(name = "midexam")
    public Integer getMidexam() {
        return midexam;
    }

    public void setMidexam(Integer midexam) {
        this.midexam = midexam;
    }

    @Basic
    @Column(name = "finalexam")
    public Integer getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(Integer finalexam) {
        this.finalexam = finalexam;
    }

    @Basic
    @Column(name = "homework")
    public Integer getHomework() {
        return homework;
    }

    public void setHomework(Integer homework) {
        this.homework = homework;
    }

    @Basic
    @Column(name = "adjustment")
    public Integer getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(Integer adjustment) {
        this.adjustment = adjustment;
    }

    @Basic
    @Column(name = "finalscore")
    public Integer getFinalscore() {
        return finalscore;
    }

    public void setFinalscore(Integer finalscore) {
        this.finalscore = finalscore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StuCourse stuCourse = (StuCourse) o;

        if (courseid != stuCourse.courseid) return false;
        if (studentid != stuCourse.studentid) return false;
        if (adjustment != null ? !adjustment.equals(stuCourse.adjustment) : stuCourse.adjustment != null) return false;
        if (finalexam != null ? !finalexam.equals(stuCourse.finalexam) : stuCourse.finalexam != null) return false;
        if (finalscore != null ? !finalscore.equals(stuCourse.finalscore) : stuCourse.finalscore != null) return false;
        if (homework != null ? !homework.equals(stuCourse.homework) : stuCourse.homework != null) return false;
        if (midexam != null ? !midexam.equals(stuCourse.midexam) : stuCourse.midexam != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentid;
        result = 31 * result + courseid;
        result = 31 * result + (midexam != null ? midexam.hashCode() : 0);
        result = 31 * result + (finalexam != null ? finalexam.hashCode() : 0);
        result = 31 * result + (homework != null ? homework.hashCode() : 0);
        result = 31 * result + (adjustment != null ? adjustment.hashCode() : 0);
        result = 31 * result + (finalscore != null ? finalscore.hashCode() : 0);
        return result;
    }
}
