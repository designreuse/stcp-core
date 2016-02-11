package com.kmutt.stcp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jirapatj on 2/12/16.
 */
@Entity
@Table(name = "course_time", schema = "", catalog = "stcpdb")
public class CourseTimeEntity {
    private int id;
    private Timestamp studyTime;
    private Timestamp examTime;
    private Integer status;
    private Integer semester;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "study_time")
    public Timestamp getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Timestamp studyTime) {
        this.studyTime = studyTime;
    }

    @Basic
    @Column(name = "exam_time")
    public Timestamp getExamTime() {
        return examTime;
    }

    public void setExamTime(Timestamp examTime) {
        this.examTime = examTime;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "semester")
    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseTimeEntity that = (CourseTimeEntity) o;

        if (id != that.id) return false;
        if (examTime != null ? !examTime.equals(that.examTime) : that.examTime != null) return false;
        if (semester != null ? !semester.equals(that.semester) : that.semester != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (studyTime != null ? !studyTime.equals(that.studyTime) : that.studyTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (studyTime != null ? studyTime.hashCode() : 0);
        result = 31 * result + (examTime != null ? examTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (semester != null ? semester.hashCode() : 0);
        return result;
    }
}
