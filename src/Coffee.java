
    public class Coffee extends Ingredient {
        String coffee = "";
        int money;
        int water;
        int coffeeBeans;
        int milk;


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

        public String getName(){return coffee;}
    }


