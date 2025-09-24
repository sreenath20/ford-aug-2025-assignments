package com.abc.app.Ecommerce;

import com.abc.app.jpa_mapping.Aadhar;
import com.abc.app.jpa_mapping.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EcommerceServiceImpl implements EcommerceService {

    @Autowired
    private UserRepositoryForEcommerce userRepositoryForEcommerce;
    private CartRepository cartRepositoryForEcommerce;

    public EcommerceServiceImpl(UserRepositoryForEcommerce userRepositoryForEcommerce, CartRepository cartRepositoryForEcommerce) {
        this.userRepositoryForEcommerce=userRepositoryForEcommerce;
        this.cartRepositoryForEcommerce=cartRepositoryForEcommerce;
    }


    @Override
    public UserEntity addUser(UserDto user) throws Exception {
        UserEntity  userEntity=new UserEntity(user.getUsername(),user.getEmail(),user.getPassword());
       return  this.userRepositoryForEcommerce.save(userEntity);

    }

    @Override
    public UserEntity updateUserWithCart(CartDto cartDto,Integer Id) throws Exception {
        CartEntity newcartEntity=new CartEntity(cartDto.getCreatedAt(),cartDto.getTotalItems(),cartDto.getTotalPrice());
        CartEntity newcart=this.cartRepositoryForEcommerce.save(newcartEntity);
        UserEntity foundUserEntity=this.userRepositoryForEcommerce.findById(Id).get();
        foundUserEntity.setCartEntity(newcart);
        return this.userRepositoryForEcommerce.save(foundUserEntity);


    }

    @Override
    public List<UserDto> findAllUsersWithCarts(Integer Id) throws Exception {
        CartEntity newUserEntity=this.cartRepositoryForEcommerce.findById(Id).get();
        UserEntity userEntities=newUserEntity.getUserEntity();

        UserDto userDTO = new UserDto(userEntities.getUsername(),userEntities.getEmail(),userEntities.getPassword());
        List<UserDto> userList = new ArrayList<>();
        userList.add(userDTO);



        return userList;

    }

    @Override
    public UserEntity DeleteUserWithCart(Integer Id) throws Exception {
        UserEntity userEntity=this.userRepositoryForEcommerce.findById(Id).get();
        this.userRepositoryForEcommerce.delete(userEntity);
        return userEntity;
    }

    @Override
    public UserEntity getUserWithCartId(Integer Id) throws Exception {
        return userRepositoryForEcommerce.findById(Id).get();
    }

    @Override
    public CartEntity updateCartWithUserId(Integer Id) throws Exception {
        CartEntity cartEntity=this.cartRepositoryForEcommerce.findById(Id).get();
        Integer items= cartEntity.getTotalItems()+1;
        cartEntity.setTotalItems(items);
        return this.cartRepositoryForEcommerce.save(cartEntity);
    }

    @Override
    public CartEntity incrementCartItems(Integer Id, Double Price) throws Exception {
        return null;
    }

    @Override
    public CartEntity decrementingCartItems(Integer Id) throws Exception {
        return null;
    }
}
