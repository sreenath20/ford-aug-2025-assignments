package com.abc.app.user;

import java.util.Collection;

public interface UserService {
    public Users addUser(Users newUser) throws UserException;
    public Users getUserById(Integer id) throws UserException;
    public Users updateUserNameById(Integer id, String name) throws UserException;
    public Collection<Users> getAllUsers() throws UserException;
}
