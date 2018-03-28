package service.demo

import grails.converters.JSON


class TestController {

    TestService testService
    def index() {
        println("this is the test controller ... ")
        testService.showMessage()
        render ([status:true] as JSON)
    }
}
