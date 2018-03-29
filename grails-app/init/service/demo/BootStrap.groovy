package service.demo

class BootStrap {

    UserService userService
    def init = { servletContext ->
        if (User.count() == 0) {
            createUserData()
        }
    }
    def destroy = {
    }


    void createUserData() {
        userService.createUserData()
        println "*******************Userdata created*******************"
    }
}
