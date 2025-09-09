package com.abc.app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public NormalUser addNewUser(NormalUser user) throws UserException {
        return this.userRepository.save(user);
    }

    @Override
    public NormalUser getUserById(Integer id) throws UserException {
        Optional<NormalUser> user = this.userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserException("User not found");
        }
        return user.get();
    }

    @Override
    public NormalUser updateUserNameById(Integer id, String name) throws UserException {
        Optional<NormalUser> user = this.userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserException("User not found");
        }
        NormalUser updatedUser = user.get();
        updatedUser.setName(name);
        return this.userRepository.save(updatedUser);
    }

    @Override
    public Collection<NormalUser> getAllUsers() throws UserException {
        return this.userRepository.findAll();
    }
}
