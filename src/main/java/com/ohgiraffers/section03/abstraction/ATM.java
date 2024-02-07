package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class ATM {

    private boolean insertedCard; // 초기에 카드가 없는 false 상태

    private int accountBalance = 0; // 초기 계좌에 잔액은 0원으로 설정

    public void insertCard() {

        if (insertedCard) {

            System.out.println("카드가 이미 있습니다.");

        } else {

            this.insertedCard = true;
            System.out.println("카드가 삽입되었습니다.");

        }

    }

    public void deposit() {

        if(insertedCard) {

            Scanner sc = new Scanner(System.in);
            System.out.print("입금하실 금액을 입력해주세요 : ");
            int depositMoney = sc.nextInt();
            this.accountBalance += depositMoney;
            System.out.println(depositMoney + "원 이 입금되었습니다. 현재 계좌에 " + this.accountBalance + "원이 있습니다.");

        } else {

            System.out.println("카드가 없습니다. 카드를 삽입해주세요.");

        }

    }

    public void withdraw() {

        if(insertedCard) {

            Scanner sc = new Scanner(System.in);
            System.out.print("출금하실 금액을 입력해주세요 : ");
            int withdrawMoney = sc.nextInt();

            if (withdrawMoney > this.accountBalance) {

                System.out.println("잔액이 부족하여 출금할 수 없습니다. 현재 잔액은 " + this.accountBalance + "입니다.");

            } else {

                this.accountBalance -= withdrawMoney;
                System.out.println(withdrawMoney + "원이 출금되었습니다. 현재 잔액은 " + this.accountBalance + "원 입니다.");

            }

        } else {

            System.out.println("카드가 없습니다. 카드를 삽입해주세요.");

        }

    }

    public void removeCard() {

        if(insertedCard) {

            System.out.println("카드를 제거합니다. 안녕히가세요.");
            this.insertedCard = false;
//            this.accountBalance = 0;

        } else {

            System.out.println("카드가 없습니다. 카드를 삽입해주세요.");

        }

    }

}
