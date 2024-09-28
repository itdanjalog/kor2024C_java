package day04;

import java.util.Scanner; // 입력 관련 클래스를 가져오기

public class STEP1 { // class start
    public static void main(String[] args) { // main start
        // 실습1 : 이름(문자열-String) 과 국어점수(정수-int) , 영어점수(정수-int) 를 *입력받아 입력받은 3개를 *출력하시오.
        // [입력]
            // 1. 입력객체
        Scanner scan = new Scanner( System.in );
            // 2. 이름 입력받기
        System.out.println(">> 이름 입력해주세요.");// sout # 안내 문구 출력
        String name = scan.next(); // console에서 입력받은 값을 변수에 저장
            // 3. 국어점수 입력받기
        System.out.println(">> 국어점수 입력해주세요.");
        int kor = scan.nextInt();
            // 4. 영어점수 입력받기
        System.out.println(">> 영어점수 입력해주세요.");
        int eng = scan.nextInt();
        // [출력]
        System.out.println("-------- 3학년 10반 ------- "); // 문자열 리터럴 자료를 출력함수에 대입 해서 출력하였다.
        // -- 변수명을 호출해서 출력함수에 대입 했더니 변수값이 출력되었다.
        System.out.println( name ); // 변수명을 작성하면 변수에 저장된 자료가 반환/호출/가져온다
        System.out.println( kor );
        System.out.println( eng );

    } // main end
} // class end
/*
"유재석" ----> String

신문지 ---- > 종이
라면비닐봉지 ---- > 비닐
아이스크림비닐 ----> 비닐
*/






