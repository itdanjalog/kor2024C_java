package day10_1014월.real.STEP1;

import day09_1013일.real.step3.Americano;

public class Step2 { // class s

    public static void main(String[] args) { // main s

        // 실습2 : 은행 계좌 시스템 만들기
            // 계좌 속성 설계 : 계좌번호 와 예금액
            // 계좌 2개 생성 : 계좌번호 : 123-123 , 계좌번호 : 456-789
            // 계좌번호 123-123의 10000 입금
            // 계좌번호 123-123의 5000 출금

        // 첫번째 계좌
        Account acc1 = new Account();
            // 계좌번호 대입
        acc1.number = "123-123";

        // 두번째 계좌
        Account acc2 = new Account();
        acc2.number = "456-789";

        // 첫번째 계좌에 10000 입금( 입금이란? 기존 자료의 더해주는 개념 )
        // acc1.balance = 10000; // 변수/필드 는 자료를 1개 저장
        acc1.balance += 10000;
        // vs // acc1.balance = acc1.balance + 10000;

        // 첫번재 계좌에 5000 출금 ( 출금이란? 기존 자료의 빼주는 개념 )
        acc1.balance -= 5000;




    } // main e
} // class e
















