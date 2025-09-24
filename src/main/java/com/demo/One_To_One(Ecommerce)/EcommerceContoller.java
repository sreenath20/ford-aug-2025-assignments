package com.abc.app.Ecommerce;

import com.abc.app.jpa_mapping.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EcommerceContoller {

    private EcommerceService ecomerceService;

    @Autowired
    public EcommerceContoller(EcommerceService ecomerceService) {
        this.ecomerceService = ecomerceService;
    }



    @PostMapping ("/user")//to only post data in user
    public UserEntity save(@RequestBody UserDto userDto)throws Exception {

        return this.ecomerceService.addUser(userDto);
       // return userRepositoryForEcommerce.save(new UserEntity(userDto.getUsername(),userDto.getEmail(), userDto.getPassword()));
    }

    @PostMapping("/User/Cart/{Id}")
    public UserEntity addCart(@RequestBody CartDto carDto,@PathVariable("Id") Integer id) throws Exception{
        return this.ecomerceService.updateUserWithCart(carDto,id);
    }
    @GetMapping("/get/{id}")
    public UserEntity getUserById(@PathVariable("id")Integer Id) throws Exception{
        return this.ecomerceService.getUserWithCartId(Id);
    }
    @DeleteMapping("/delete/{id}")
    public UserEntity deleteUserById(@PathVariable("id")Integer Id) throws Exception{
        return this.ecomerceService.DeleteUserWithCart(Id);
    }

    @GetMapping("/Cart/{id}")
    public List<UserDto> getUserCartById(@PathVariable("id")Integer Id) throws Exception{
        return this.ecomerceService.findAllUsersWithCarts(Id);
    }

    @PutMapping("/cart/{id}")
    public CartEntity getCartById(@PathVariable("id")Integer Id) throws Exception{
        return this.ecomerceService.updateCartWithUserId(Id);
    }

//    @PostMapping("/cart/{userId}")
//    public UserEntity save(@RequestBody CartDto cartDto,@PathVariable Integer userId) {
//        CartEntity cartEntity =this.cartRepository.save(new CartEntity(cartDto.getCreatedAt(),cartDto.getTotalItems(),cartDto.getTotalPrice()));
//        Optional<UserEntity> foundUserEntity = this.userRepositoryForEcommerce.findById(userId);
//        foundUserEntity.get().setCartEntity(cartEntity);
//       this.userRepositoryForEcommerce.save(foundUserEntity.get());
//       return foundUserEntity.get();
//
//
//    }
//    @GetMapping
//    public List<UserEntity> findAll() {
//        return userRepositoryForEcommerce.findAll();
//
//    }
//    @GetMapping("/{id}")
//    public UserEntity getEmployeeById(@PathVariable("id") Integer employeeId) throws Exception {
//        return this.userRepositoryForEcommerce.findById(employeeId).
//                orElseThrow(() -> new Exception("User id does not exists"));
//    }
//
//    public EcommerceService getEcomerceService() {
//        return ecomerceService;
//    }

//    public void setEcomerceService(EcommerceService ecomerceService) {
//        this.ecomerceService = ecomerceService;
//    }
}
