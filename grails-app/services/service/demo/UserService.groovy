package service.demo

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    List<User> getAllUsers() {
        return User.list()
    }

    void createUserData() {
        (1..5).each { it ->
            new User(name: "user${it}", age: it + 10, dob: new Date()).save()
        }
    }

    List<User> getSortedUserList() {
        return User.createCriteria().list {
            order('age', 'desc')
        }
    }
}
