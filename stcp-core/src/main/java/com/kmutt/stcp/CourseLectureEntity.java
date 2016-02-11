package com.kmutt.stcp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jirapatj on 2/12/16.
 */
@Entity
@Table(name = "course_lecture", schema = "", catalog = "stcpdb")
public class CourseLectureEntity {
    private int id;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseLectureEntity that = (CourseLectureEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
