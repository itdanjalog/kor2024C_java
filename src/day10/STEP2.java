package day10;

// - 실행 클래스
public class STEP2 {
    public static void main(String[] args) {

        // 주제 : 제품 관리 프로그램 구현

        // [1] 제품 생산 : 콜라 , 1000원
        Product p1 = new Product( );
            // - 객체가 함수를 호출한다.
            p1.info(); // # 객체변수명.함수명() # 제품명 : null , 가격 : 0 # info함수를 호출
        p1.name = "콜라";
        p1.price = 1000;
            p1.info(); // # 제품명 : 콜라 , 가격 : 1000

        // [2] 제품 생산 : 사이다 , 1500원
        Product p2 = new Product( "사이다" );
            p2.info(); // 제품명 : 사이다 , 가격 : 0
        p2.price = 1500;
            p2.info(); // 제품명 : 사이다 , 가격 : 1500

        // [3] 제품 생산 : 환타 , 2000원
        Product p3 = new Product( "환타" , 2000);
            p3.info(); // 제품명 : 환타 , 가격 : 2000

        // [4] 3개의 제품을 제품목록(배열/리스트) 에 담아보기
        // 배열이란: 하나의 타입의 여러 자료들을 하나의 자료로 표현
        //          product 타입의 여러 제품들을 하나의 제품목록으로 표현
        // (1) Product 객체 3개를 저장할수 있는 배열
        Product[ ] pArray = new Product[3];
        // int[] iArray = new int[3];  int 타입의 자료를 3개 저장할수 있는 배열
        pArray[0] = p1;
        pArray[1] = p2;
        pArray[2] = p3;
        // - 주로 여러개 객체들을 하나의 배열또는리스트에 저장되는 경우가 많다.

        // [5] 사이다의 가격을 1500원 에서 3000원 으로 수정하시오.
        // 1. 제품목록에서 사이다 찾기 위해서 목록 순회한다.
        for( int index = 0 ; index < pArray.length ; index++ ){
            // 2. 사이다 찾기 // 기본타입 비교 == , 참조타입 비교  .equals( )
            if( pArray[index].name.equals( "사이다" ) ){ // 만약에 index번째의 제품명이 '사이다'이면
                pArray[index].updatePrice(3000); // index번째의 제품의 함수 호출한다.
                break; // 한개만 수정할 예정이므로 수정 성공시 사이다찾기 중단.
            }
        } // for end

        System.out.println("pArray[1].price = " + pArray[1].price);

    } // m end
} // c end








