package BankAccountSystem;

import java.util.Scanner;

class Account{
    public static Scanner sc = new Scanner(System.in);
    String AccountNum; // 계좌번호
    String name; // 이름
    int balance; // 잔액
    int PW; // 비밀번호

    public void Account(String AccountNum, String name, int balance, int PW){
        this.AccountNum = AccountNum;
        this.name = name;
        this.balance = balance;
        this.PW = PW;
    }

    // 게좌 생성
    public static void MakeAccount(){ // String AccountNum, String name, int PW
        System.out.print("이름 : ");
        sc.nextLine();
        System.out.println("계좌번호 : ");
        sc.nextLine();
        System.out.println("비밀번호 : ");
        sc.nextInt();

    }
   
}