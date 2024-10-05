package day05; // - 현재 클래스가 위치한 패키지/폴더

public class STEP1 { // 클래스 시작 중괄호 // 자바는 클래스 단위로 번역하기 때문에
    // main + 엔터 : 자동완성
    public static void main(String[] args) { // main함수 후 시작 중괄호 // 번역된 코드를 실행해주는 흐름 기능 포함

        int a = 10 ;    // a변수에 10 대입
        int b = -3 ;    // b변수에 -3 대입

        // 1. 산술연산자
        System.out.println( a + b ); // ( 10 + -3 ) // 7 // sout + 엔터
        System.out.println( a - b ); // 13
        System.out.println( a * b ); // -30
        System.out.println( a / b ); // -3.333333 ~~~~[x] // -3
        System.out.println( 10.0 / -3.0 ); // 3.3333333333333335
        System.out.println( a % b ); // 1
        // * 3 가지 포인트 : 1. 결과값은 항상 하나이다. 2.변수명을 작성하여 변수값 호출한후 연산 3. 피연산자( 연산할 자료 )의 타입에 따라 결과 타입도 정해진다.

        // 2.연결연산자
        System.out.println( "더하기 : " + a + b ); // 더하기 : 10-3 // 문자열과 연결 후에 b를 더했다.
        System.out.println( "더하기 : " + (a+b) ); // 더하기 : 7 // 문자열과 연결 전에 a+b를 더했다.

        // 3. 비교연산자
        System.out.println( a == b ); // 같다 # 10 == -3  false 아니다.
        System.out.println( a != b ); // 다르다 # 10 != -3  true 맞다.
        System.out.println( a > b ); // 초과/크다 # 10 > -3 true 맞다.
        System.out.println( a < b ); // 미만/작다 # 10 < -3 false 아니다.
        System.out.println( a >= b ); // 크거나같다/이상 # 10 >= -3 true 맞다 .
        System.out.println( a <= b ); // 작거나같다/이하 # 10 <= -3 false 아니다.

        // 4. 논리/관계 연산자 , & : 쉬프트+8 , || : 쉬프트 + 엔터위원화기호
        System.out.println( a > 10 && a < 20 ); // false and true // false // a는 10보다 크고 a는 20보다 작다.
        // 10 < a < 20 [x] 자바에서는 동시 연산이 불가능하다.
        System.out.println( a >= 5 && a < 20 ); // true and true // true
        System.out.println( a > 10 || a < 20 ); // false or true // true
        System.out.println( a >= 5 || a < 20);
        System.out.println( !(a>=20) ); // false -> !false -> true

        // 5. ( 복합 ) 대입 연산자
        int h = 31; // 대입 얀산자
        h += 3;
        h -= 3;
        System.out.println( h ); // 31
        h *= 2;
        System.out.println( h ); // 62
        h /= 2;
        System.out.println( h ); // 31

        // 6. 증감 연산자
        a++; // ++ : 1증가
        System.out.println( a ) ; // 10[x] // 11[o]
        System.out.println( a++ ); // 12[x] // 11[o]
        System.out.println( a ); // 12

        // 7. 삼항 연산자
        System.out.println( a >=20 ? "진실" : "거짓");
                        //  조건   ?  참 일때  : 거빗 일떄
        char gender = 'M';
        System.out.println( gender == 'M' ? "남자" : "여자");
        int age = 25;
        System.out.println( age >= 40 ? "중년" : age >= 19 ? "성인" : "미성년자");


    } // main 함수 끝 중괄호
} // 클래스 끝 중괄호












