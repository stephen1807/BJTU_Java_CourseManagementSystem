package project.obj;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Stephen on 2015/01/02.
 */
@Entity
public class StudentInfo {
    private int studentid;
    private String studentname;
    private String gender;
    private String email;
    private String phone;
    private String stupass;

    @Id
    @Column(name = "studentid")
    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    @Basic
    @Column(name = "studentname")
    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "stupass")
    public String getStupass() {
        return stupass;
    }

    public void setStupass(String stupass) {
        this.stupass = stupass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInfo that = (StudentInfo) o;

        if (studentid != that.studentid) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (studentname != null ? !studentname.equals(that.studentname) : that.studentname != null) return false;
        if (stupass != null ? !stupass.equals(that.stupass) : that.stupass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentid;
        result = 31 * result + (studentname != null ? studentname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (stupass != null ? stupass.hashCode() : 0);
        return result;
    }
}
