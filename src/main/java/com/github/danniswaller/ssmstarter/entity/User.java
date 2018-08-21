package com.github.danniswaller.ssmstarter.entity;

import java.time.LocalDateTime;

/**
 * Created by danniswalle on 2018/8/20.
 */
public class User {


    private LocalDateTime createAt;
    private LocalDateTime createBy;
    private String        id;
    private String        password;
    private LocalDateTime updateAt;
    private LocalDateTime updateBy;
    private String        username;


    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getCreateBy() {
        return createBy;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * getter method for id.
     *
     * @return  String
     */
    public String getId() {
        return id;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * getter method for password.
     *
     * @return  String
     */
    public String getPassword() {
        return password;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * getter method for update at.
     *
     * @return  LocalDateTime
     */
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * getter method for update by.
     *
     * @return  LocalDateTime
     */
    public LocalDateTime getUpdateBy() {
        return updateBy;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * getter method for username.
     *
     * @return  String
     */
    public String getUsername() {
        return username;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for create at.
     *
     * @param   createAt  LocalDateTime
     *
     * @return  User
     */
    public User setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;

        return this;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for create by.
     *
     * @param   createBy  LocalDateTime
     *
     * @return  User
     */
    public User setCreateBy(LocalDateTime createBy) {
        this.createBy = createBy;

        return this;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for id.
     *
     * @param   id  String
     *
     * @return  User
     */
    public User setId(String id) {
        this.id = id;

        return this;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for password.
     *
     * @param   password  String
     *
     * @return  User
     */
    public User setPassword(String password) {
        this.password = password;

        return this;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for update at.
     *
     * @param   updateAt  LocalDateTime
     *
     * @return  User
     */
    public User setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;

        return this;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for update by.
     *
     * @param   updateBy  LocalDateTime
     *
     * @return  User
     */
    public User setUpdateBy(LocalDateTime updateBy) {
        this.updateBy = updateBy;

        return this;
    }

    //~ ------------------------------------------------------------------------------------------------------------------

    /**
     * setter method for username.
     *
     * @param   username  String
     *
     * @return  User
     */
    public User setUsername(String username) {
        this.username = username;

        return this;
    }
}

