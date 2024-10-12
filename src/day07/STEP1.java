package day07;

import java.util.Scanner;

public class STEP1 { // class start
    public static void main(String[] args) { // main start

        // [5] 조건문 실습5 : 각 3개의 정수타입을 입력받아 오름차순 으로 출력하시오.
        // 단] 각 정수는 서로 다른 값 이라는 전제

        // 요구사항 분석
        // - 알고리즘/순서도 : 코드 흐름 순서도
        // 1. 입력받는다. // 2. (타입에 맞는)변수에 저장
        Scanner scan = new Scanner(System.in); // (1) 입력객체 생성
        int a = scan.nextInt(); // (2) 입력 함수를 이용한 입력값 정수로 반환받기
        int b = scan.nextInt();
        int c = scan.nextInt();
        // 3. 연산식/계산식. # 오름차순 # 변수간의 데이터 교환 = swap
        if( a > b ){  // (1/2) a와 b를 비교 해서 만약에 결과가 true 이면 값 교체 /swap
            int temp  = a; // temp = 10 , a = 10 , b = 2
            a = b;        // temp = 10 , a = 2 , b = 2
            b = temp;       // temp = 10 , a = 2 , b = 10 # 이후 temp 변수 사용안함.
        }
        if( a > c ){  int temp = a; a = c ; c = temp;  } // 조건 충족시 스왑
        if( b > c ){  int temp = b ; b = c ; c = temp; } // 조건 충족시 스왑
        // 4. 출력
        System.out.printf(  " %d   %d   %d  " , a , b , c ); // 2   5   10

            // 데이터를 비교하여 작으면 앞으로 이동 하고 크면 뒤로 이동 # 오름차순
            // 데이터를 비교하여 작으면 뒤로 하고 크면 앞으로 이동 # 내림차순
        /*
                a           b           c
                10          2           5
                - 오름차순 : 2 5 10 , 내림차순 : 10 5 2
                - 컴퓨터는 한번에 여러개를 비교할수 없다. ( 하나씩 비교하는 코드 )
                1. a 와 b를 비교한다
                2. 만약에 a가 크면 a 와 b 의 값을 교체 해준다.
                3. a 와 c를 비교한다.
                4. 만약에 a가 크면 a와 c의 값을 교체 해준다.
                5. b 와 c를 비교한다.
                6. 만약에 b가 크면 b와 c의 값을 교체 해준다.
        */
        // 4. 출력한다.

    } // main end
}// class end











