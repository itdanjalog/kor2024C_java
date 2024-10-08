package day06;

import java.util.Scanner;

public class STEP1 { // class start

    public static void main(String[] args) { // class start

        // 연산자 실습문제1 : 학생의 점수를 입력받아 각 조건에 따라 출력 하는 프로그램을 만드시오.
        // 입력조건 : 국어점수,수학점수,영어점수 를 각 정수타입으로 입력받으시오.
        // 계산조건 : 총점 과 평균을 계산하여 출력하시오.
        // 논리조건 : 평균이 80점이상이면 합격 , 아니면 불합격 으로 출력하시오.
        // 1. 입력 Scanner /출력 System.out.print() 에 필요한 도구/기능 필요하다.
        Scanner scan = new Scanner(System.in); // (1) 입력객체 - 키보드로부터 입력받은 값을 변수에 저장된 객체변수이다.
        System.out.print("국어점수 : ");
        int 국어 = scan.nextInt(); // (2) 입력객체내 저장된 입력값 가져오기
        System.out.print("수학점수 : ");
        int 수학 = scan.nextInt(); // (2) 입력객체내 저장된 입력값 가져오기
        System.out.print("영어점수 : ");
        int 영어 = scan.nextInt(); // (2) 입력객체내 저장된 입력값 가져오기

        // 2. 계산 # 총점 : 세점수를 더한 값  # 평균 : 총점에 나누기 과목수
        int 총점 = 국어 + 수학 + 영어;
        int 평균 = 총점 / 3; // 3(int) 3.0(double)
        System.out.println( "총점 : " + 총점 + ", 평균 : " + 평균 ); // 연결 연산자 # "문자열"+자료

        // 3. 논리 # 삼항연산자 : 조건 ? 참 : 거짓 # 참 또는 거짓 중에서 하나의 결과값을 갖는다.
        String 결과 = 평균 >= 80 ? "합격" : "불합격" ;  // 문자열 타입은 String 타입이다.
            // - 평균변수의 값이 80 이상이면 "합격" 아니면 "불합격" 문자열을 '결과' 라는 변수에 대입한다.
        System.out.println(" 결과 : " + 결과 );













    } // main end
}// class end
