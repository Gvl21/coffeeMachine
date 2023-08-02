public class Espresso extends Coffee {
    String coffee = "에스프레소";


    private final int money = 4000;
    private final int water = 250;
    private final int coffeeBeans = 16;
    private final int milk = 0;





    @Override
    public int getMoney() {

        return money;

    }

    @Override
    public int getWater() {
        return water;
    }



    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }
    public String getName(){return coffee;}


}
