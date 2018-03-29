package service.demo

import grails.converters.JSON

class UserController {

    UserService userService
// wrong way
    def getAllUsers() {
        List<User> userList = User.list()
        render userList as JSON
    }
//correct way
    def getUsers() {
        render userService.getAllUsers() as JSON
    }

    // wrong way
    def getSortedUserList() {
        List<User> users = User.createCriteria().list {
            order('age', 'desc')
        }
        render users as JSON
    }

    // correct way
    def getSortedUsers() {
        render userService.getSortedUserList() as JSON
    }
}
