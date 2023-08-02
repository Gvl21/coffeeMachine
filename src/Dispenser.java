
public class Dispenser {
    boolean lackOfWater;
    boolean lackOfMilk;
    boolean lackOfBeans;
    public void dispenser(Coffee c, Ingredient ingredient) {
        if (lackOfWater = c.getWater() > ingredient.getWater()) {
            System.out.println("물이 부족합니다");
        }
        if (lackOfMilk = c.getMilk() > ingredient.getMilk()) {
            System.out.println("우유가 부족합니다");
        }
        if (lackOfBeans = c.getCoffeeBeans() > ingredient.getCoffeeBeans()) {
            System.out.println("원두가 부족합니다");
        }
        if (!lackOfWater && !lackOfBeans && !lackOfMilk)
            {
            ingredient.setMoney(c.getMoney());
            ingredient.setWater(-c.getWater());
            ingredient.setMilk(-c.getMilk());
            ingredient.setCoffeeBeans(-c.getCoffeeBeans());
            ingredient.setDisposableCup(-1);
            System.out.println("커피를 구매하였습니다. 감사합니다.");
            System.out.println(c.getName() + "가 준비되었습니다. 맛있게 드세요!");
            System.out.println("======================================");
        }
    }
}
