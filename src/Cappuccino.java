public class Cappuccino extends Coffee {
    String coffee = "카푸치노";


    private final int money = 6000;
    private final int water = 200;
    private final int coffeeBeans = 12;
    private final int milk = 100;


    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public int getWater() {
        return water;
    }

    @Override
    public int getMilk() {
        return milk;
    }

    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }


}
