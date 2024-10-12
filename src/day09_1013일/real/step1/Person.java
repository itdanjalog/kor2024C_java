package day09_1013일.real.step1;

// 클래스는 만드는 행위
// --> 머리속에 있는 추상적인(객체) 개념 를 설계
public class Person {
    String name;
    int age;

    void 밥먹다( String 음식 ){
        System.out.println( name + " 이/가 " + 음식 + " 먹습니다." );
    }
    void 생일( ) {
        System.out.println( name + " 의 생일 축하합니다.");
        this.age++;
    }
}
