package project.obj;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Stephen on 2015/01/02.
 */
@Entity
public class Course {
    private int courseid;
    private String coursename;
    private int minscore;

    @Id
    @Column(name = "courseid")
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Basic
    @Column(name = "coursename")
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Basic
    @Column(name = "minscore")
    public int getMinscore() {
        return minscore;
    }

    public void setMinscore(int minscore) {
        this.minscore = minscore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (courseid != course.courseid) return false;
        if (minscore != course.minscore) return false;
        if (coursename != null ? !coursename.equals(course.coursename) : course.coursename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseid;
        result = 31 * result + (coursename != null ? coursename.hashCode() : 0);
        result = 31 * result + (int) minscore;
        return result;
    }
}
