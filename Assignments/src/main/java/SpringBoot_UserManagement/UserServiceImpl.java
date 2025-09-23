package SpringBoot_UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userDao;

    @Autowired
    public UserServiceImpl(UserRepository userDao) {
        this.userDao = userDao;
    }

    @Override
    public User addUser(User user) throws UserException {
        try{
            return this.userDao.save(user);
        }catch(Exception e){
            throw new UserException(e.getMessage());
        }
    }

    @Override
    public User getUserById(Integer id) throws UserException {
        Optional<User> user = this.userDao.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        else{
            throw new UserException("User not found with id: " + id);
        }
    }

    @Override
    public User updateUserPasswordById(Integer id,User user) throws UserException {

        Optional<User> updateuser = this.userDao.findById(id);
        if(updateuser.isPresent()){
            User updatedUser=updateuser.get();
            updatedUser.setPassword(user.getPassword()+"updated");
            this.userDao.save(updatedUser);
            return updatedUser;
        }
        else{
            throw new UserException("User not found with id: " + id);
        }

    }

    @Override
    public User deleteUserById(Integer id) throws UserException {

        Optional<User> existingUser= userDao.findById(id);
        if(existingUser.isPresent()){
            this.userDao.deleteById(id);
            return existingUser.get();
        }
        else{
            throw new UserException("User not found with id: " + id);
        }

    }

    @Override
    public List<User> getAllUsers() throws UserException {
        return userDao.findAll();
    }
}
