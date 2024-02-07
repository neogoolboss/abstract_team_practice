package com.ohgiraffers.section03.abstraction;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*  ATM
            0.계좌 잔고 를 선언해준다.(전역변수)

            1. 인출자(사람)은 카드 삽입, 입금, 출금 , 카드 뽑기

            2. ATM은 카드 인입, 출금, 입금, 카드 사출

            3. ATM은 처음에 카드가 없는 상태이다.

            카드가 없는 상태로 입금,출금,카드 뽑기 를 누르면 "카드를 넣어주세요" 라는 문구를 출력한다.

            4. 인출자(사람)은 먼저 ATM에 카드를 넣는다.
            이미 들어가 있는 경우 다시 넣을 수 없다.
            "이미 삽입된 카드가 있습니다"

            5. ATM은 출금은 계좌 잔액을 넘어갈 수 없다.

            6. 사람이 카드를 뽑으면 ATM은 "안녕히 가세요" 라는 문구를 출력한다.

            7. 출금, 입금 중 일 때 카드를 뽑을 수 없다.
        */

        Customer customer = new Customer();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("───────── 💲ATM💲 ─────────");
            System.out.println("       1. 카드삽입");
            System.out.println("        2. 입금");
            System.out.println("        3. 출금");
            System.out.println("       4. 카드뽑기");
            System.out.println("       9. 종료하기");
            System.out.println("     0. 메뉴로 돌아가기");
            System.out.print("       메뉴 선택 : ");


            int no = sc.nextInt();


            switch(no) {

                case 1 :
                    customer.emptyCard();
                    break;

                case 2 :
                    customer.depositMoney();
                    break;

                case 3 :
                    customer.withdrawMoney();
                    break;

                case 4 :
                    customer.removeCard();
                    break;

                case 9 :
                    System.out.println("시스템을 종료합니다.");
                    break;

                case 0 :
                    System.out.println("목록으로 돌아갑니다.");
                    continue;

                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }

            if(no == 9) {

                break;

            }

        }

    }

}
