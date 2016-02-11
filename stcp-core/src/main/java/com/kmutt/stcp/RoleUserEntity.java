package com.kmutt.stcp;

import javax.persistence.*;

/**
 * Created by jirapatj on 2/12/16.
 */
@Entity
@Table(name = "role_user", schema = "", catalog = "stcpdb")
public class RoleUserEntity {
    private int id;
    private String desc;
    private String role;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleUserEntity that = (RoleUserEntity) o;

        if (id != that.id) return false;
        if (desc != null ? !desc.equals(that.desc) : that.desc != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
