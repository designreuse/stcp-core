package com.kmutt.stcp;

import javax.persistence.*;

/**
 * Created by jirapatj on 2/12/16.
 */
@Entity
@Table(name = "course_plan", schema = "", catalog = "stcpdb")
public class CoursePlanEntity {
    private int id;
    private Integer semester;
    private Integer status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "semester")
    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursePlanEntity that = (CoursePlanEntity) o;

        if (id != that.id) return false;
        if (semester != null ? !semester.equals(that.semester) : that.semester != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
