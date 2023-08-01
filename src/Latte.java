public class Latte extends Coffee {
    String coffee = "라떼";


    private final int money = 7000;
    private final int water = 350;
    private final int milk = 75;
    private final int coffeeBeans = 20;


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
