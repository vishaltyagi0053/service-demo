package service.demo

import grails.gorm.transactions.Transactional
import service.demo.co.AddressCO

//@Transactional
class AddressService {

    Address createAddress(AddressCO addressCO) {
        return new Address(streetName: addressCO.streetName, city: addressCO.city, houseNumber: addressCO.houseNumber)
    }
}
