package day09;

/*
    Car 클래스 설계 하고 여러개 car 객체를 사용하는 프로그램
 */

// 클래스 사용처 :1. 객체설계도 클래스 2. 실행클래스
// CAR객체 설계도 클래스
public class Car {
    // 클래스 구성 멤버
    // 1. 멤버변수 또는 필드 : 객체의 상태
    String model = "모닝"; // 자동차(객체)의 모델 명 상태
    String color ; // 자동차(객체)의 색상 상태
    int speed; //   자동차(객체)  의 속도 상태
    boolean power = false; // 자동차(객체) 의 시동 상태
    String owner; // 자동차(객체) 의 소유주 명 상태
        // - 객체 생성시 초기화가 없으면 멤버변수의 기본값이 적용된다.
        // - 배열/객체 기본값 : 정수(0) , 실수(0.0) , 참조타입(null)

    // 2. 생성자 : 객체의 초기화 메소드

    // 3. 메소드 또는 멤버함수 : 객체의 행위
        // (1) 매개변수 없고 리턴값이 없는 함수/메소드
    void powerOn(){
        System.out.println("시동 걸었습니다.");
        power = false;
    }
        // (2) 매개변수 없고 리턴값이 있는 함수/메소드
    int currentSpeed( ){
        return speed;
    }
        // (3) 매개변수 있고 리턴값이 있는 함수/메소드
    String updateOwner( String newOwner ){
        owner = newOwner;
        return newOwner;
    }
        // (4) 매개변수 있고 리턴값이 없는 함수/메소드
    void speedUp( int speedValue ){
        speed += speedValue;
    }

} // CLASS END
