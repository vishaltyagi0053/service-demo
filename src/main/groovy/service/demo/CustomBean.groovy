package service.demo

class CustomBean {

    Integer getRandomNumber(int maxlimit){
        Random random = new Random()
        return random.nextInt(maxlimit)
    }
}
