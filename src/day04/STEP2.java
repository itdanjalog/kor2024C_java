package day04;

import java.util.Scanner;

public class STEP2 { // class s
    public static void main(String[] args) { // main s

        int a = 3;
        // 1. 배열 자료 만들기
        int[] array1 = new int[3];
            // 배열의 길이 : 3  // 인덱스 : 0~2
        int[] array2 = { 30 , 20 , 10 };
            // 인덱스 : 30[인덱스=0] , 20[인덱스=1] , 10[인덱스=2]

        // 2. 인덱스를 활용한 배열내 자료 수정/대입
        array1[0] = 10; // 배열내 1번째 위치한 0번 인덱스 에 10를 대입
        array1[1] = 20; // 배열내 2번째 위치한 1번 인덱스 에 20를 대입
        array1[2] = 30; // 배열내 3번째 위치한 2번 인덱스 에 30를 대입

        // 3. 인덱스를 활용한 배열내 자료 호출
        System.out.println( array1 ); //sout // 배열이 실제 저장된 메모리 주소(???)
        System.out.println( array1[0] ); //10
        System.out.println( array1[1] ); //20
        System.out.println( array1[2] ); //30
        System.out.println( array2[0] ); //30
        System.out.println( array2[1] ); //20
        System.out.println( array2[2] ); //10

        // 실습1 : 2명의 학생이 존재하고 국어점수,영어점수,수학점수 를 각각 입력하고 저장하여 출력 하는 프로그램
        // [생각순서]
        // 1. 각 입력값들의 타입 생각 # 점수에는 실수가 아닌 정수형으로 받기 위해서 int 선택
        // 2. 입력값 개수 : 국어점수,영어점수,수학점수 ,국어점수,영어점수,수학점수  # 각 3개점수 , 총 2명 => 6개
        // 3. 변수 6개 ----> 동일한 타입이면 묶기 ---->  1. { } , { } 배열2개   2. { } 배열1개 중 하나 선택
        // 4. 메모리/저장소 선언 # 배열 선언
        int[] student1 = new int[3]; // 첫번째 학생의 점수 3개를 저장하는 배열
        int[] student2 = new int[3]; // 두번째 학생의 점수 3개를 저장하는 배열
        // 5. 입력받기 # 배열내 요소의 값 대입하기.
        Scanner scan = new Scanner(System.in); // 입력객체
        System.out.print("(1)학생의 국어점수 입력하세요 : ");
        student1[0] = scan.nextInt();   // 키보드로부터 입력받은 값을 배열내 0번 인덱스에 저장
        System.out.print("(1)학생의 영어점수 입력하세요 : ");
        student1[1] = scan.nextInt();   // 키보드로부터 입력받은 값을 배열내 1번 인덱스에 저장
        System.out.print("(1)학생의 수학점수 입력하세요 : ");
        student1[2] = scan.nextInt();   // 키보드로부터 입력받은 값을 배열내 2번 인덱스에 저장

        System.out.print("(2)학생의 국어점수 입력하세요 : ");
        student2[0] = scan.nextInt();   // 키보드로부터 입력받은 값을 배열내 0번 인덱스에 저장
        System.out.print("(2)학생의 영어점수 입력하세요 : ");
        student2[1] = scan.nextInt();   // 키보드로부터 입력받은 값을 배열내 1번 인덱스에 저장
        System.out.print("(2)학생의 수학점수 입력하세요 : ");
        student2[2] = scan.nextInt();   // 키보드로부터 입력받은 값을 배열내 2번 인덱스에 저장
        // 6. 배열내 요소 값 출력하기
        System.out.println("1번 학생 국어점수 : " + student1[0] ); // " 문자열 " + 변수명    # 문자열 과 변수값이 연결된다.
        System.out.println("1번 학생 영어점수 : " + student1[1] );
        System.out.println("1번 학생 수학점수 : " + student1[2] );

        System.out.println("2번 학생 국어점수 : " + student2[0] ); // " 문자열 " + 변수명    # 문자열 과 변수값이 연결된다.
        System.out.println("2번 학생 영어점수 : " + student2[1] );
        System.out.println("2번 학생 수학점수 : " + student2[2] );






    } // main e
} // class e


















