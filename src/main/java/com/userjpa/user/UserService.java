package com.abc.app.user;

import java.util.Collection;

public interface UserService {

    NormalUser addNewUser(NormalUser user) throws UserException;
    NormalUser getUserById(Integer id) throws UserException;
    NormalUser updateUserNameById(Integer id, String name) throws UserException;
    Collection<NormalUser> getAllUsers() throws UserException;

}
