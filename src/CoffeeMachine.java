import java.util.Scanner;

public class CoffeeMachine extends VendingCoffee{


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
            System.out.println("물 : " + ingredient.getWater()+"ml");
            System.out.println("우유 : " + ingredient.getMilk()+"ml");
            System.out.println("원두 : " + ingredient.getCoffeeBeans()+"g");
            System.out.println("일회용 컵 : " + ingredient.getDisposableCup()+"개");
            System.out.println("돈 : " + ingredient.getMoney()+"원");
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

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();
    }

    }


