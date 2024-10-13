package day09;

// 실행 클래스
public class STEP2 {
    public static void main(String[] args) {

        // 객체 생성
        Car car = new Car();

        // 1. 객체가 인자값을 전달하지 않고(매개변수가없고) 실행후 반환값이 없는 함수 실행
        car.powerOn(); // 객체가 함수 호출

        // 2. 객체가 인자값을 전달하지 않고(매개변수가없고) 실행후 반환값이 speed 인 함수 실행
        int speed = car.currentSpeed(); // 객체가 함수 호출

        // 3. 객체가 인자값을 전달 하고(매개변수가 있고-"유재석") 실행후 반환값이 owner 인 함수 실행
        String owner = car.updateOwner( "유재석" ); // 객체가 함수 호출

        // 4. 객체가 인자값을 전달 하고(매개변수가 있고 - 10) 실행후 반환값이 없는 함수 실행
        car.speedUp( 10 ); // 객체가 함수 호출

    } // main end
} // CLASS END
