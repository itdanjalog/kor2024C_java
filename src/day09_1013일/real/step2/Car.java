package day09_1013일.real.step2;


public class Car { // class start
    String model = "모닝"; // 모델
    String color;   // 색상 속성/필드 명 정의
    int speed;      // 속도 속성/필드 명 정의
    boolean power = false ; // 전원 상태
    String 차주명;

    void powerOn(){
        System.out.println("시동 걸었습니다.");
        power = true;
    }
    void powerOff(){
        System.out.println("시동을 껐습니다.");
        power = false;
    }
    // 차량 속도 증가
    void speedUp(){
        System.out.println("");
        speed++;
    }
    // 차량 속도 감소
    void speedDown(){
        speed--;
    }

} // class end
