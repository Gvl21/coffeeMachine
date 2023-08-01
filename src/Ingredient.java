public class Ingredient {
    int money;
    int water;
    int milk;
    int coffeeBeans;
    int disposableCup ;

    public Ingredient(int money, int water, int milk, int coffeeBeans, int disposableCup) {
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCup = disposableCup;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public void setWater(int water) {
        this.water += water;
    }

    public void setMilk(int milk) {
        this.milk += milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans += coffeeBeans;
    }

    public void setDisposableCup(int disposableCup) {
        this.disposableCup += disposableCup;
    }

    public int getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCup() {
        return disposableCup;
    }
}
