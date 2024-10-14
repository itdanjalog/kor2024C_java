package day10;

public class Account {
    // 클래스의 멤버
    // 1. 필드 : 객체가 가질수 있는 속성/특성
    String accNo; // 계좌의 번호
    int balance; // 계좌의 예금액
    boolean use = true; // 계좌 잠금상태
    // 2. 생성자 :
    // 3. 메소드 : 객체가 실행할수 있는 실행문(코드의집합)
    // 반환타입 함수명( 타입 매개변수명 ) {  실행문; return 반환값 }
    // 함수 설계 : 예금기능에는 예금할 금액을 받아서 기존예금에 더하고 반환은 없다.
        // 1. 매개변수 생각( 예금할금액 등등  )
        // 2. 반환값 생각( 문자 , 없음 등등 )
        // 3. 처리할 기능 생각( 기존예금에 더하기 )
    void deposit( int money ){ // (1) 예금 함수 :
        balance += money;
        return; // 생략 가능
    } // method end

    // 함수 설계2 : 출금기능에는 출금할 금액을 받아서 기존예금에 빼기 하고 반환은 출금 성공=1/true , 출금 실패=0/false 여부 반환
    boolean withdraw( int money ){
        if( balance < money ){         // 만약에 기존 예금액보다 더 큰 출금액을 하면 출금 금지
            return false; // 출금 실패 ( 금액부족 )
        }else{
            balance -= money;
            return true; // 출금 성공
        } // if end
    } // method end

} // class end
