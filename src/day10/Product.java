package day10;

// - 제품 객체 설계도 클래스
public class Product {
    // - 클래스 멤버
    // 1. 멤버변수/필드 // 왜? 필드개 2개인가요? 제품의 속성을 간단하게 2개로 표현하는 예제
    String name; // 제품명
    int price;  // 가격
    // 2. 생성자  // 왜?? 생성자 3개만드셨죠? 객체 생성시 상황에 따라 초기화 하기 위해서
    Product(){} // 기본생성자
    Product( String name ){ // 매개변수 1개를 갖는 생성자
        this.name = name;
    }
    Product( String name , int price ){ // 매개변수 2개를 갖는 생성자
        this.name = name;
        this.price = price;
    }
    // 3. 메소드 // 가격 인상 함수 : 새로운 가격을 받아서 기존가격에 수정처리후 수정상태를 반환
    boolean updatePrice( int newPrice ){
        this.price = newPrice; // 매개변수로 들어오는 값을 객체내 가격에 대입한다(수정)
        return true; // 수정 성공 했다는 뜻 // 개발자가 의미 임의로 정하기
    }
    // 제품 정보 출력해주는 함수 : 현재 객체의 속성[멤버변수]의 정보를 출력하는 함수.
    // this :  현재 메소드/생성자를 호출한 객체를 뜻한다.
    void info( ) { // 매개변수도 없고 반환값도 없는 단순 함수처리 하는 함수정의
        System.out.printf("제품명 : %s , 가격 : %d \n" , this.name , this.price );
    }

}
