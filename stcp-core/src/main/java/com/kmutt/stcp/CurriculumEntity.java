package com.kmutt.stcp;

import javax.persistence.*;

/**
 * Created by jirapatj on 2/12/16.
 */
@Entity
@Table(name = "curriculum", schema = "", catalog = "stcpdb")
public class CurriculumEntity {
    private int id;
    private String name;
    private String startedYear;
    private Integer accId;
    private String startYear;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "started_year")
    public String getStartedYear() {
        return startedYear;
    }

    public void setStartedYear(String startedYear) {
        this.startedYear = startedYear;
    }

    @Basic
    @Column(name = "acc_id")
    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    @Basic
    @Column(name = "start_year")
    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurriculumEntity that = (CurriculumEntity) o;

        if (id != that.id) return false;
        if (accId != null ? !accId.equals(that.accId) : that.accId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (startYear != null ? !startYear.equals(that.startYear) : that.startYear != null) return false;
        if (startedYear != null ? !startedYear.equals(that.startedYear) : that.startedYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (startedYear != null ? startedYear.hashCode() : 0);
        result = 31 * result + (accId != null ? accId.hashCode() : 0);
        result = 31 * result + (startYear != null ? startYear.hashCode() : 0);
        return result;
    }
}
