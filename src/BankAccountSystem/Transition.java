package BankAccountSystem;

import java.util.Scanner;

class Transition {
    public static Scanner sc = new Scanner(System.in);
    String AccountNum;
    String type;
    int amount;
    // 계좌조회
    public static void ShowAccount(){
        System.out.println("계좌 조회(번호로 조회해주세요.) : ");
        while (true) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("   0. 종료 | 1. 입금 | 2. 출금 | 3. 잔액조회");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print(">>");

            int choice = sc.nextInt();

            sc.nextLine();
            switch (choice) {
                case 0:
                System.out.println("종료합니다");
                    return;
                case 1:
                deposite();
                    
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    ShowMoney();
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        }
    }
    //잔액조회
    public static void ShowMoney(){
        System.out.println("잔액조회");
    }

    // 입금
    public static void deposite(){
        System.out.println("입금");
    }

    // 출금
    public static void withdraw(){
        System.out.println("출금");

    }

}
