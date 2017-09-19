package project.obj;

import javax.persistence.*;

/**
 * Created by Stephen on 2015/01/04.
 */
@Entity
public class TeaCourse {
    private int id;
    private int teacherid;
    private int courseid;

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
    @Column(name = "teacherid")
    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    @Basic
    @Column(name = "courseid")
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeaCourse teaCourse = (TeaCourse) o;

        if (courseid != teaCourse.courseid) return false;
        if (teacherid != teaCourse.teacherid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherid;
        result = 31 * result + courseid;
        return result;
    }
}
