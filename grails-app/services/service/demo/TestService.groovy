package service.demo

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    static scope = 'prototype'
    String showMessage(){
        return "this message from service ..."
    }
}
