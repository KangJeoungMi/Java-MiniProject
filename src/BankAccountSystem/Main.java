package BankAccountSystem;

import java.util.Scanner;

// 사용자
//  계좌 등록(이름, 계좌번호, 비밀번호), 계좌 조회(잔액조회, 거래내역 조회), 입금, 출금, 계좌번호로 계좌 찾기
// 관리자
//  계좌 목록확인, 등록, 수정, 삭제

//계정 클래스(속성 : 계좌번호, 계좌이름, 비밀번호, 잔액 / 메서드 : 입금, 출금, 조회)

public class Main {
    public static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("    0. 종료 | 1. 계좌 조회 | 2. 계좌 생성 ");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print(">>");

            int choice = sc.nextInt();

            sc.nextLine();
            switch (choice) {
                case 0:
                System.out.println("종료합니다");
                    return;
                case 1:
                    Transition.ShowAccount();
                    break;
                case 2:
                    Account.MakeAccount();
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        }
    }
}
