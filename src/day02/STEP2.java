package day02; // 현재 파일이 위치한 패키지/폴더 명

public class STEP2 { // { : class start  // 자바는 클래스 단위로 컴파일(번역)된다.
    // - main 함수 는 컴파일된 코드를 최초 실행하는 함수이다.
    // m 입력후 엔터 : 자동완성
    public static void main(String[] args) { // { : main start

        // [1] 자료 및 리터럴 입력
        // 3;
        // 3.14;
        // 'a';
        // "abc";
        // true;
        // null;
        // [2] 리터럴 자료를 변수에 저장/대입
            // 1. 변수 선언/만들기
            // ( 자료 를 파악해서 타입을 고른다 )
            // ( 변수명을 작성한다. )
            // ( 대입 )
            // ( 리터럴/값 )

        // 1. 불리언 타입
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = 10;  // boolean 허용범위 벗어남 오류

        // 2. 정수 타입
            // - byte 타입 : 1바이트  # +-100정도 저장.
        byte by1 = 100;
        byte by2 = 21;
        // byte by3 = 300; // - byte 허용범위 벗어남 오류
            // - short 타입 : 2바이트 # +-3만정도 저장
        short sh1 = 300;
        // short sh2 = 40000;  // chort 허용범위 벗어남 #오류
            // - int 타입 : 4바이트 # +-21억정도 저장 # 정수 리터럴의 타입
        int it1 = 3000000;
        // int it2 = 3000000000; // int 허용범위 벗어남 # 오류
            // - long 타입 : 8바이트 # +-21억이상 저장 # 자료가 리터럴(int)인 경우 자료뒤에 L,l 붙이자
        long lo1 = 3000000000L;         // int 리터럴 자료를 long 변환

        // 3. 실수타입(부동소수점)
            // - double 타입 : 8바이트 # 소수점 17 자리 까지 표현 # 실수 리터럴의 타입
        double d1 = 0.123456789123456789;
        // soutv 입력후 엔터 : 가장 가까운 변수의 값 출력 함수
        System.out.println("d1 = " + d1);
        double d2 = 0.123456789123456789123456789;
        System.out.println("d2 = " + d2);
            // - float 타입 : 4바이트 # 소수점 8자리 까지 표현 #자료가 리터럴(double) 인경우 자료뒤에 F,f 붙이자
        float f1 = 0.123456789123456789F; // double 리터럴 자료를 float 변환
        System.out.println("f1 = " + f1);

        // 4. 문자타입
            // - char 타입 : 2바이트 # ' ' 한글자만 가능
        char c1 = 'a';
        // char c2 = 'abc'; /// 오류 발생 : 한글자만 가능
            // - String 참조타입 # " " 문자열 # S 대문자 # 클래스(참조)타입
        String s1 = "abc";
        // String s2 = 'abc'; // 오류 발생 : " " 로 사용해야 한다.

        // ; 세미콜론 란 ? 실행 명령어 단위 마침 뜻한다. # 명령어 처리해

    } // } : main end
} // } : class end









