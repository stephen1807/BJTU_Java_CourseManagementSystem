package project.obj;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Stephen on 2015/01/02.
 */
@Entity
public class TeacherInfo {
    private int teacherid;
    private String teachername;
    private String gender;
    private String email;
    private String phone;
    private String tpass;

    @Id
    @Column(name = "teacherid")
    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    @Basic
    @Column(name = "teachername")
    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
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
    @Column(name = "tpass")
    public String getTpass() {
        return tpass;
    }

    public void setTpass(String tpass) {
        this.tpass = tpass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherInfo that = (TeacherInfo) o;

        if (teacherid != that.teacherid) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (teachername != null ? !teachername.equals(that.teachername) : that.teachername != null) return false;
        if (tpass != null ? !tpass.equals(that.tpass) : that.tpass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherid;
        result = 31 * result + (teachername != null ? teachername.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (tpass != null ? tpass.hashCode() : 0);
        return result;
    }
}
