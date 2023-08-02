import java.util.Scanner;


public class VendingCoffee{
    Ingredient ingredient = new Ingredient(50000,400,540,120,9);
    Espresso espresso = new Espresso();
    Latte latte =  new Latte();
    Cappuccino cappuccino = new Cappuccino();
    Scanner scn = new Scanner(System.in);
    Dispenser dispenser = new Dispenser();



    public void buy() {
        System.out.println("어떤 커피를 구매하시겠습니까?");
        System.out.println("1." + espresso.coffee +  "(가격: "+ espresso.getMoney()+"원)");
        System.out.println("2." + latte.coffee +  "(가격: "+ latte.getMoney()+"원)");
        System.out.println("3." + cappuccino.coffee +  "(가격: "+ cappuccino.getMoney()+"원)");
        System.out.print(">");
        int selectedCoffee = Integer.parseInt(scn.nextLine());
        switch (selectedCoffee){
            case 1:
               dispenser.dispenser(espresso, ingredient);
               break;
            case 2:
                dispenser.dispenser(latte, ingredient);
                break;
            case 3:
                dispenser.dispenser(cappuccino, ingredient);
                break;
            }
    }




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

    public void quit(){
        System.out.println("커피머신이 종료되었습니다.");

    }
}
