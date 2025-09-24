package com.abc.app.user;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userDao;

    public UserServiceImpl(UserRepository userDao){
        this.userDao = userDao;
        ;
    }
    @Override
    public UserInformation addUser(UserInformation userInformation) throws UserException {
            //Optional<UserInformation> optionalUserInformation=userDao.findByEmailId(userDto.getEmailId());

            //if(optionalUserInformation.isEmpty()){
               // UserInformation userInformation= new UserInformation(userDto);
                return this.userDao.save(userInformation);

//            else{
//                throw new UserException("User not found");
//            }
    }

    @Override
    public UserInformation getProductById(Integer id) throws UserException {
        return null;
    }

    @Override
    public UserInformation updateProductPriceById(String emailId, Integer phoneNumber) throws UserException {
        Optional<UserInformation> userOptional = this.userDao.findByEmailId(emailId);
        if(userOptional.isPresent()){
            UserInformation userInformation = userOptional.get();
            userInformation.setPhoneNumber(phoneNumber);
            this.userDao.save(userInformation);
            return userInformation;
        }
        else{
            throw new UserException("User not found");
        }

    }

    @Override
    public Collection<UserInformation> getAllProducts() throws UserException {
        return this.userDao.findAll();
    }

    @Override
    public UserInformation deleteProductById(String emailId) throws UserException {
        Optional<UserInformation> userOptional = this.userDao.findByEmailId(emailId);
        if(userOptional.isPresent()){
            UserInformation userInformation = userOptional.get();
            this.userDao.delete(userInformation);
            return userInformation;
        }
        else{
            throw new UserException("User not found");
        }
    }
}
