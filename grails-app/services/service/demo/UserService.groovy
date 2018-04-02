package service.demo

import grails.gorm.transactions.Transactional
import service.demo.co.AddressCO
import service.demo.co.UserCO

//@Transactional
class UserService {

    AddressService addressService

    List<User> getAllUsers() {
        return User.list()
    }

    void createUserData() {
        (1..5).each { it ->
            new User(name: "user${it}", age: it + 10, dob: new Date()).save()
        }
    }

    @Transactional
    User createUser(UserCO userCO){
        User user = new User(name: userCO.name,age: userCO.age,dob: userCO.dob)
        userCO.addresses.each {AddressCO addressCO->
            user.addToAddresses(addressService.createAddress(addressCO))
        }
        return user.save()
    }

    List<User> getSortedUserList() {
        return User.createCriteria().list {
            order('age', 'desc')
        }
    }
}
