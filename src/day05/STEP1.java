package day05;

public class STEP1 {
    public static void main(String[] args) {

        int x = 10;     int y = -3;
        // [1] 연산자 : 연산/계산/수식 시 사용되는 기호 들
        // 1. 산술연산자 : 연산/계산 결과를 숫자로 반환
        // + 더하기 , - 빼기 , * 곱하기 , / 나누기 , % 나눈값의 나머지값

        // x+y;    // 오류나는 이유 : 더하기 하고 다음 행위 없어서.
        int z = x + y; // 더하기 후 변수에 대입 한다거나.
        System.out.println( x + y );    // 출력 7
        System.out.println( x - y );    // 13
        System.out.println( x * y );    // -30
        System.out.println( x / y );    // -3.333333333 ~ int가 소수점을 표현하지 못해서 -3
        System.out.println( 10.0 / 3.0 ); // -3.3333333 ~
        System.out.println( x % y );    // 1

        // 2. 연결연산자 : + , 문자열이 포함된 더하기 연산은 연결이 된다.
        // "ABC" + 3  ->  "ABC3"
        System.out.println( "문자열 : " + x + y);  // 1순서 : "문자열 : " + x  , 2순서 : +y
        System.out.println( "문자열 : " + ( x + y ) ); // 1순서 : x + y , 2순서 : "문자열 : "+

        // 3. 비교연산자 : 비교 결과를 boolean 반환
        // 1. == 같다 , 2. != 같지않다. , 3. > 초과/크다 , 4. >=이상/크거나같다 , 5. < 미만/작다 , 6 이하/작거나같다
        System.out.println( x == y ); // 10 == -3  결과 : false
        System.out.println( x != y ); // 10 != -3  결과 : true
        System.out.println( x > y );  // 10 > -3    결과 : true
        System.out.println( x >= y ); // 10 >= -3   결과 : true   ,   x => y [불가능]
        System.out.println( x < y );  // 10 < -3    결과 : false
        System.out.println( x <= y ); // 10 <= -3   결과 : false   ,  =< [불가능]

        // 4. 관계연산자 : 비교 연산자가 2개 이상일 때 사용 , 결과는 boolean 반환
        // System.out.println( 10 < x < 20 ); // 오류 이유 : 범위 논리가 불가능하다.
        // 1. && 이면서 , 이고 , 모두 , 그리고
        // 2개이상의 논리가 모두 true 이면 결과는 true  , 하나라도 false 이면 결과 false 이다.
        // 2. || 이거나 , 또는 , 하나라도
        // 2개이상의 논리가 하나라도 true 이면 결과는 true , 모두 false 이면 결과는 false 이다.
        // 3. ! 부정 , 반대 , true->false , false -> true
        System.out.println( x > 10 && x < 20 ); // false and true -> false
        System.out.println( x >= 5 && x < 20 ); // true and true -> true
        System.out.println( x > 10 || x < 20 ); // false or true -> true
        System.out.println( x >= 5 || x < 20 ); // true or true -> true
        System.out.println( !(x>=20) );         // !(false) -> true

        // 5. 대입 / 복합대입 연산자
        // 1. = 대입연산자 : 오른쪽 값을 왼쪽에 대입/저장 한다.
        // 2. 복합대입연산자 : 짧은 연산자를 이용한 연산하기 위해서 사용.
        // += 오른쪽값과 왼쪽 변수값과 더한 결과를 왼쪽 변수에 대입 한다.
        // -= 오른쪽값과 왼쪽 변수값과 빼기 결과를 왼쪽 변수에 대입 한다.
        // *= 오른쪽값과 왼쪽 변수값과 곱하기 결과를 왼쪽 변수에 대입 한다.
        // /= 오른쪽값과 왼쪽 변수값과 나누기 결과를 왼쪽 변수에 대입 한다.
        // %= 오른쪽값과 왼쪽 변수값과 나머지 결과를 왼쪽 변수에 대입 한다.
        int h = 30;
        // h; // h변수명을 이용한 h의 값 호출
        // h + 1; // h변수명을 이용한 h의 값 호출 후 + 1  => 31
        h = h + 1;
        // 코드 실행순서 : 1. = 기준 으로 오른쪽 h변수명을 이용한 값 호출
        // 2. 호출된 값과 + 1        ,   31
        // 3. 대입                  , h = 31
        h += 1 ;    // h = 32
        h -= 10 ;   // h = 22
        h *= 2 ;    // h = 44
        h /= 2 ;    // h = 22
        h %= 2 ;    // h = 0

        // [1] 삼항 연산자
        // 주로 조건 결과 가 true 일때 다른값 으로 대체 , false 일때 다른값으로 표현할때 사용된다.
        // 조건식 ? 참 : 거짓
        // 중첩 : 조건식1 ? 참1 : 조건식2 ? 참2 : 거짓
        // - 여러번의 중첩이 가능 하지만 가독성(읽기) 떨어진다.
        //    그러므로 다양한 조건의 제어는 IF(조건문) 주로 사용된다.
        // 항 자리에서는 함수호출 , 선언부 은 불가능하다. 리터럴 이나 수식 목적으로 사용된다.
        // 참일때 또는 거짓일때 함수호출 또는 변수생성 시 IF(조건문) 사용해야 한다.
        // 1.
         x = 30;
        String str1 = x >= 20 ? "진실" : "거짓";
        // 2.
         y = 14; // y값이 7의 배수이면 true 대신 '7배수입니다.' 아니면 false 대신 '7배수가 아닙니다.' 표현
        // y % 7 == 0 ? true대체 값 : false대체 값
        String str2 = y % 7 == 0 ? "7배수 입니다" : "7배수 아닙니다.";
        System.out.println("str2 = " + str2);
        // 3.
        int age = 15; // 만약에 나이가 19세 이상이면 '성인' 아니면 '미성년자' 출력하시오
        // - 조건식 : 나이가 19세 이상
        // - 참(true) 일때 '성인'   - 거짓(false) 일때 '미성년자'
        // 1. age >= 19 : 비교연산자 사용시 결과는 true 또는 false 이다..
        String pass = age >= 19 ? "성인" : "미성년자";
        System.out.println("pass = " + pass);
        // 4. 만약에 나이가 19세 이상이면 '성인' , 6세 이상이면 '학생' 아니면 '유아' 출력하시오.
        String pass2 = age >= 19 ? "성인" : age >= 6 ? "학생" : "유아" ;
        System.out.println("pass2 = " + pass2);

    }
}