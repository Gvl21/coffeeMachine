import java.util.Scanner;

public class VendingCoffee implements VendingMachine{
    Ingredient ingredient = new Ingredient(50000,400,540,120,9);
    Scanner scn = new Scanner(System.in);
    @Override
    public void buy() {

        String coffee = "";
        System.out.println("어떤 커피를 구매하시겠습니까?");
        System.out.println("1. 에스프레소 (가격: 4000원)");
        System.out.println("2. 라떼 (가격: 7000원)");
        System.out.println("3. 카푸치노 (가격: 6000원)");
        int selectedCoffee = Integer.parseInt(scn.nextLine());

        switch (selectedCoffee) {
            case 1:
                coffee = "에스프레소";
                ingredient.setMoney(4000);
                ingredient.setCoffeeBeans(-16);
                ingredient.setWater(-250);
                ingredient.setDisposableCup(-1);
                break;
            case 2:
                coffee = "라떼";
                ingredient.setMoney(7000);
                ingredient.setWater(-350);
                ingredient.setMilk(-75);
                ingredient.setCoffeeBeans(-20);
                ingredient.setDisposableCup(-1);
                break;
            case 3:
                coffee = "카푸치노";
                ingredient.setMoney(6000);
                ingredient.setWater(-200);
                ingredient.setMilk(-100);
                ingredient.setCoffeeBeans(-12);
                ingredient.setDisposableCup(-1);
                break;
        }
        System.out.println("커피를 구매하였습니다. 감사합니다.");
        System.out.println(coffee + "가 준비되었습니다. 맛있게 드세요!");
    }

    @Override
    public void take(){
        System.out.print("돈을 꺼내기 : ");
        int moneyTake = Integer.parseInt(scn.nextLine());
        if(moneyTake> ingredient.getMoney()){
            System.out.println("금액이 초과하였습니다.");
        }else{
            ingredient.setMoney(-moneyTake);
            System.out.println("인출 완료");
            System.out.println("=============================");
        }
    }

    @Override
    public void fill(){
        int fillAmount;
        System.out.println("추가할 물의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setWater(fillAmount);
        System.out.println("추가할 우유의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setMilk(fillAmount);
        System.out.println("추가할 원두의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setCoffeeBeans(fillAmount);
        System.out.println("추가할 일회용 컵의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.setDisposableCup(fillAmount);
    }
    @Override
    public void quit(){
        System.out.println("커피머신이 종료되었습니다.");

    }
}
