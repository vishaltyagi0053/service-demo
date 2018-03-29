// Place your Spring DSL code here
beans = {

    customBean(service.demo.CustomBean){

    }
    prototypeBean(service.demo.PrototypeBean){bean->
        bean.scope = 'prototype'
    }
}
