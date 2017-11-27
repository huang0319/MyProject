package com.ruimin.oadsp.model;

import javax.persistence.*;

@Table(name = "usr_bs_inf")
public class UsrBsInf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String userpwd;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return userpwd
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * @param userpwd
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}