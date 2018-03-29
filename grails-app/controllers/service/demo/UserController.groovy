package service.demo

import grails.converters.JSON

class UserController {

    def customBean
    def prototypeBean
    TestService testService
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
// checking scope ...
    def customBean() {
        render(["name": customBean.toString()] as JSON)
    }

    def prototypeBean(){
        render(["name": prototypeBean.toString()] as JSON)
    }

    def testBean() {
        render(["name": testService.toString()] as JSON)
    }
}
