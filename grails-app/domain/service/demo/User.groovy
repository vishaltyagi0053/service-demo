package service.demo

class User {

    String name;
    Integer age;
    Date dob;

    static hasMany = [addresses: Address]

    static constraints = {
    }
}
