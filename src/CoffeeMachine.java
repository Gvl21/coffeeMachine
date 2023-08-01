import java.util.Scanner;

public class CoffeeMachine{

    Ingredient ingredient = new Ingredient();
    Scanner scn = new Scanner(System.in);
    void run() {
        boolean isRun = true;
        boolean isRun2 = isRun;
        if (isRun==false) {
            System.out.println("커피머신이 작동중이지 않습니다.");
        }
        while (isRun) {
            System.out.println("커피 머신이 가동되었습니다.");
            System.out.println("");
            System.out.println("현재 커피머신 상태 : 작동중");
            break;
        }
        while (isRun2) {
            System.out.println("남은 재료와 돈 상태");
            System.out.println("물 : " + ingredient.water);
            System.out.println("우유 : " + ingredient.milk);
            System.out.println("원두 : " + ingredient.coffeeBeans);
            System.out.println("일회용 컵 : " + ingredient.disposableCup);
            System.out.println("돈 : " + ingredient.money);
            System.out.println("");
            System.out.println("옵션을 선택하세요");
            System.out.println("(1. 구매, 2. 채우기, 3. 가져가기, 4. 종료)");

            int selectOption = Integer.parseInt(scn.nextLine());
            switch (selectOption) {
                case 1:
                    buy();
                    break;
                case 2:
                    fill();
                    break;
                case 3: 
                    take();
                    break;
                case 4:
                    quit();
                    isRun2 =  false;
                    break;

            }


        }


        }
    public void buy(){


        System.out.println("어떤 커피를 구매하시겠습니까?");
        System.out.println("1. 에스프레소 (가격: 4000원)");
        System.out.println("2. 라떼 (가격: 7000원)");
        System.out.println("3. 카푸치노 (가격: 6000원)");
        int selectedCoffee = Integer.parseInt(scn.nextLine());
        switch (selectedCoffee){
            case 1:
                ingredient.money += 4000;
                ingredient.coffeeBeans -= 16;
                ingredient.water -= 250;
                ingredient.disposableCup -= 1;
                break;
            case 2 :
                ingredient.money += 7000;
                ingredient.water -= 350;
                ingredient.milk -= 75;
                ingredient.coffeeBeans -= 20;
                ingredient.disposableCup -= 1;
                break;
            case 3:
                ingredient.money += 6000;
                ingredient.water -= 200;
                ingredient.milk -= 100;
                ingredient.coffeeBeans -= 12;
                ingredient.disposableCup -= 1;
                break;
        }
        System.out.println("커피를 구매하였습니다. 감사합니다.");
        System.out.println("가 준비되었습니다. 맛있게 드세요!");



    }
    public void fill(){
        int fillAmount;
        System.out.println("추가할 물의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.water += fillAmount;
        System.out.println("추가할 우유의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.milk += fillAmount;
        System.out.println("추가할 원두의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.coffeeBeans += fillAmount;
        System.out.println("추가할 일회용 컵의 양을 입력하세요.");
        fillAmount = Integer.parseInt(scn.nextLine());
        ingredient.disposableCup += fillAmount;
    }
    public void take(){
        System.out.print("돈을 꺼내기 : ");
        int moneyTake = Integer.parseInt(scn.nextLine());
        if(moneyTake> ingredient.money){
            System.out.println("금액이 초과하였습니다.");
        }else{
            ingredient.money -= moneyTake;
            System.out.println("인출 완료");
            System.out.println("=============================");
        }
    }
    public void quit(){
        System.out.println("커피머신이 종료되었습니다.");

    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();
    }

    }


