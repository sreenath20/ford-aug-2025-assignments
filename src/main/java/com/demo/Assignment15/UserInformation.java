package com.abc.app.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //says to springboot / hibernate to map with the database
public class UserInformation {
    @Id
    private String username;
    private String emailId;
    private String password;
    private Integer phoneNumber;

    public UserInformation() {
    }

    public UserInformation(UserDto userDto) {
        this.username = userDto.username;
        this.emailId = userDto.emailId;
        this.password = userDto.password;
        this.phoneNumber = userDto.phoneNumber;
    }
    public UserInformation(String username, String emailId, String password, Integer phoneNumber) {
        this.username = username;
        this.emailId = emailId;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
