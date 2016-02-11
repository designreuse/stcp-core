package com.kmutt.stcp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jirapatj on 2/12/16.
 */
@Entity
@Table(name = "user", schema = "", catalog = "stcpdb")
public class UserEntity {
    private int id;
    private String firstname;
    private String lastname;
    private Integer gender;
    private String address;
    private String email;
    private Timestamp birthday;
    private String mobile;
    private String citizenId;
    private int semester;
    private String studyProgram;
    private String faculty;
    private String major;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "citizen_id")
    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    @Basic
    @Column(name = "semester")
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "study_program")
    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    @Basic
    @Column(name = "faculty")
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (semester != that.semester) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (citizenId != null ? !citizenId.equals(that.citizenId) : that.citizenId != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (faculty != null ? !faculty.equals(that.faculty) : that.faculty != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (major != null ? !major.equals(that.major) : that.major != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (studyProgram != null ? !studyProgram.equals(that.studyProgram) : that.studyProgram != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (citizenId != null ? citizenId.hashCode() : 0);
        result = 31 * result + semester;
        result = 31 * result + (studyProgram != null ? studyProgram.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + (major != null ? major.hashCode() : 0);
        return result;
    }
}
