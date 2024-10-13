package day09;

// 클래스 사용처 : 1.객체의 설계도 2.main함수를 갖는 실행클래스

// (1) 객체의 설계도 (-해당 클래스만으로 자바를 실행 할 수 없다.
public class Person {
    // 클래스 멤버
    // 1. 멤버변수 또는 필드 : 고유한 성질의 (객체) 상태
    String name; // 객체내 '이름'속성/필드
    int age; //객체내 '나이' 속성/필드

    // 3. 메소드 또는 멤버함수 : (객체) 행위/이벤트
    void eat( String food ){ // 먹기 이벤트
        System.out.println( name +"이/가 "+food+" 를 먹습니다.");
    } // method end

    void birthday( ){ // 생일 이벤트
        System.out.println( name + "의 생일 축하합니다.");
        age += 1 ;
    }// method end
} // class end
