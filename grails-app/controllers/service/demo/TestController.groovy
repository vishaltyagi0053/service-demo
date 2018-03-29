package service.demo

import grails.converters.JSON


class TestController {

    TestService testService

    def customBean
    def index() {
        println("this is the test controller ... ")
        testService.showMessage()
        render ([status:true] as JSON)
    }

    def getRandom(int max){
        render (["number":customBean.getRandomNumber(max)] as JSON)
    }
}
