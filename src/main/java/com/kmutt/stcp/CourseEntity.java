package com.kmutt.stcp;

import javax.persistence.*;

/**
 * Created by jirapatj on 2/12/16.
 */
@Entity
@Table(name = "course", schema = "", catalog = "stcpdb")
public class CourseEntity {
    private int id;
    private String code;
    private String name;
    private int minStudent;
    private int maxStudent;
    private String detail;
    private int credit;
    private int status;
    private int type;
    private int courseId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "min_student")
    public int getMinStudent() {
        return minStudent;
    }

    public void setMinStudent(int minStudent) {
        this.minStudent = minStudent;
    }

    @Basic
    @Column(name = "max_student")
    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    @Basic
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "credit")
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "course_id")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (courseId != that.courseId) return false;
        if (credit != that.credit) return false;
        if (id != that.id) return false;
        if (maxStudent != that.maxStudent) return false;
        if (minStudent != that.minStudent) return false;
        if (status != that.status) return false;
        if (type != that.type) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + minStudent;
        result = 31 * result + maxStudent;
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + credit;
        result = 31 * result + status;
        result = 31 * result + type;
        result = 31 * result + courseId;
        return result;
    }
}
