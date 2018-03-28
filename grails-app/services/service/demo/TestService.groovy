package service.demo

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    String showMessage(){
        return "this message from service ..."
    }
}
