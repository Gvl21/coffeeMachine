import java.util.Scanner;


public class VendingCoffee implements VendingMachine {
    Ingredient ingredient = new Ingredient(50000,400,540,120,9);
    Espresso espresso = new Espresso();
    Latte latte =  new Latte();
    Cappuccino cappuccino = new Cappuccino();
    Scanner scn = new Scanner(System.in);


    @Override
    public void buy() {
        String coffee = "";
        System.out.println("어떤 커피를 구매하시겠습니까?");
        System.out.println("1." + espresso.coffee +  "(가격: "+ espresso.getMoney()+"원)");
        System.out.println("2." + latte.coffee +  "(가격: "+ latte.getMoney()+"원)");
        System.out.println("3." + cappuccino.coffee +  "(가격: "+ cappuccino.getMoney()+"원)");
        System.out.print(">");
        int selectedCoffee = Integer.parseInt(scn.nextLine());


        switch (selectedCoffee){
            case 1:
                if (espresso.getWater()> ingredient.getWater()){
                    System.out.println("물이 부족합니다");
                    break;
                }
                if (espresso.getMilk()> ingredient.getMilk()){
                    System.out.println("우유가 부족합니다");
                    break;
                }
                if (espresso.getCoffeeBeans()> ingredient.getCoffeeBeans()){
                    System.out.println("원두가 부족합니다");
                    break;
                }
                else {
                coffee = espresso.coffee;
                ingredient.setMoney(espresso.getMoney());
                ingredient.setWater(-espresso.getWater());
                ingredient.setMilk(-espresso.getMilk());
                ingredient.setCoffeeBeans(-espresso.getCoffeeBeans());
                ingredient.setDisposableCup(-1);
                break;}
            case 2:
                if (latte.getWater()> ingredient.getWater()){
                    System.out.println("물이 부족합니다");
                    break;
                }
                if (latte.getMilk()> ingredient.getMilk()){
                    System.out.println("우유가 부족합니다");
                    break;
                }
                if (latte.getCoffeeBeans()> ingredient.getCoffeeBeans()){
                    System.out.println("원두가 부족합니다");
                    break;
                }
                else {
                coffee = latte.coffee;
                ingredient.setMoney(latte.getMoney());
                ingredient.setWater(-latte.getWater());
                ingredient.setMilk(-latte.getMilk());
                ingredient.setCoffeeBeans(-latte.getCoffeeBeans());
                ingredient.setDisposableCup(-1);
                break;}
            case 3:
                if (cappuccino.getWater()> ingredient.getWater()){
                    System.out.println("물이 부족합니다");
                    break;
                }
                if (cappuccino.getMilk()> ingredient.getMilk()){
                    System.out.println("우유가 부족합니다");
                    break;
                }
                if (cappuccino.getCoffeeBeans()> ingredient.getCoffeeBeans()){
                    System.out.println("원두가 부족합니다");
                    break;
                }
                else {
                coffee = cappuccino.coffee;
                ingredient.setMoney(cappuccino.getMoney());
                ingredient.setWater(-cappuccino.getWater());
                ingredient.setMilk(-cappuccino.getMilk());
                ingredient.setCoffeeBeans(-cappuccino.getCoffeeBeans());
                ingredient.setDisposableCup(-1);
                break;}
        }
        if(coffee!=""){
        System.out.println("커피를 구매하였습니다. 감사합니다.");
        System.out.println(coffee + "가 준비되었습니다. 맛있게 드세요!");
        System.out.println("======================================");}
    }



    @Override
    public void take(){
        System.out.print("돈을 꺼내기 : ");
        int moneyTake = Integer.parseInt(scn.nextLine());
        if(moneyTake> ingredient.getMoney()){
            System.out.println("******************");
            System.out.println("금액이 초과하였습니다.");
            System.out.println("******************");
        }else{
            ingredient.setMoney(-moneyTake);
            System.out.println("인출 완료");
            System.out.println("=============================");
        }
    }

    @Override
    public void fill(){
        int fillAmount;
        System.out.print("추가할 물의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setWater(fillAmount);
        System.out.print("추가할 우유의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setMilk(fillAmount);
        System.out.print("추가할 원두의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setCoffeeBeans(fillAmount);
        System.out.print("추가할 일회용 컵의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setDisposableCup(fillAmount);
        System.out.println("======================================");
    }
    @Override
    public void quit(){
        System.out.println("커피머신이 종료되었습니다.");

    }
}
