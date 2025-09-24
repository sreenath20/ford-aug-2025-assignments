package com.abc.app.user;


public class UserDto {
    String username;
    String emailId;
    String password;
    Integer phoneNumber;

    public UserDto() {
    }

    public UserDto( String username, String emailId, String password, Integer phoneNumber) {
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
