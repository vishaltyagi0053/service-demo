package service.demo

import grails.converters.JSON


class TestController {

    TestService testService
    def prototypeBean
    def customBean

    def index() {
        println("this is the test controller ... ")
        testService.showMessage()
        render([status: true] as JSON)
    }

    def getRandom(int max) {
        render(["number": customBean.getRandomNumber(max)] as JSON)
    }
// checking scope ....
    def customBean() {
        render(["name": customBean.toString()] as JSON)
    }

    def prototypeBean() {
        render(["name": prototypeBean.toString()] as JSON)
    }

    def testBean() {
        render(["name": testService.toString()] as JSON)
    }
}
