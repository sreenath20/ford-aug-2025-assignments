package com.abc.app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users addUser(Users newUser) throws UserException {
        return this.userRepository.save(newUser);
    }

    @Override
    public Users getUserById(Integer id) throws UserException {
        Optional<Users> foundUser = this.userRepository.findById(id);
        if(foundUser.isEmpty()){
            throw new UserException("User not found");
        }
        return foundUser.get();
    }

    @Override
    public Users updateUserNameById(Integer id, String name) throws UserException {
        Optional<Users> updateUser = this.userRepository.findById(id);
        if(updateUser.isEmpty()){
            throw new UserException("User not found");
        }
        Users user = updateUser.get();
        user.setUserName(name);
        this.userRepository.save(user);
        return user;
    }

    @Override
    public Collection<Users> getAllUsers() throws UserException {
        return this.userRepository.findAll();
    }
}
