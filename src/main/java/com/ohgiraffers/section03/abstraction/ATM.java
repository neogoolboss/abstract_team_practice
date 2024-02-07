package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class ATM {

    private boolean emptyCard; // 초기에 카드가 없는 false 상태

    private int accountBalance = 0;

    public void insertCard() {
        if (emptyCard) {
            System.out.println("카드가 이미 있습니다.");
        } else {
            this.emptyCard = true;
            System.out.println("카드가 삽입되었습니다.");
        }
    }

    public void deposit() {
        if(emptyCard) {
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
        if(emptyCard) {
            Scanner sc = new Scanner(System.in);
            System.out.print("출금하실 금액을 입력해주세요 : ");
            int withdraWMoney = sc.nextInt();

            if (withdraWMoney > this.accountBalance) {

                System.out.println("잔액이 부족하여 출금할 수 없습니다. 현재 잔액은 " + this.accountBalance + "입니다.");
            } else {
                this.accountBalance -= withdraWMoney;
                System.out.println(withdraWMoney + "원이 출금되었습니다. 현재 잔액은 " + this.accountBalance + "원 입니다.");
            }
        } else {
            System.out.println("카드가 없습니다. 카드를 삽입해주세요.");
        }
    }

    public void removeCard() {
        if(emptyCard) {
            System.out.println("카드를 제거합니다. 안녕히가세요.");
            this.emptyCard = false;
            this.accountBalance = 0;
        } else {
            System.out.println("카드가 없습니다. 카드를 삽입해주세요.");
        }
    }


}
