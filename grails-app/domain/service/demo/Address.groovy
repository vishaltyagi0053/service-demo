package service.demo

class Address {

    String streetName;
    Integer houseNumber;
    String city;

    static belongsTo = [user: User]

    static constraints = {
        streetName nullable: false, blank: false, minSize: 4
        houseNumber nullable: true
        city nullable: false, blank: true
    }
}
