package day06;

import java.util.Scanner;

public class STEP3 { // class start
    public static void main(String[] args) { // class start

        Scanner scan = new Scanner(System.in); // **입력객체**

        // [1] 조건문 실습1 : 하나의 점수를 정수타입으로 입력받아 점수가 90점이상이면 '합격' 아니면 '불합격' 출력 하시오.
        System.out.print("[1] 점수 : ");
        int 점수1 = scan.nextInt();
        // (1) 방법1 # 삼항연산자
        System.out.println( 점수1 >= 90 ? "합격" : "불합격" );
        // (2) 방법2 # if문
        if( 점수1 >= 90 ){ // if start
            System.out.println("합격");
        } // if end
        else { // else start
            System.out.println("불합격");
        } // else end

        // [2] 조건문 실습2 : 하나의 점수를 정수타입으로 입력받아
        // 조건상태 : 점수가 90점이상 이면 'A등급' 80점이상 이면 'B등급' 70점이상 이면 'C등급' 그외 '재시험' 출력하시오.
        System.out.print("[2] 점수 : ");
        int 점수2 = scan.nextInt();
        if( 점수2 >= 90 ){  System.out.println("A등급");  }
        else if( 점수2 >= 80 ){ System.out.println("B등급");  }
        else if( 점수2 >= 70 ){ System.out.println("C등급");  }
        else { System.out.println("재시험");  }

        // [3] 조건문 실습3 : 각 2개의 정수타입을 입력받아 가장 큰 수를 출력하시오. 단] 각 정수는 서로 다른 값 이라는 전제
        System.out.print("[3] 정수1 : ");     int 정수1 = scan.nextInt();
        System.out.print("[3] 정수2 : ");     int 정수2 = scan.nextInt();
        if( 정수1 > 정수2 ) { // # 만약에 정수1 이 정수2 보다 크면 정수1 출력
            System.out.println(정수1);
        }else{
            System.out.println(정수2);
        }

        // [4] 조건문 실습4 : 각 3개의 정수타입을 입력받아 가장 큰 수를 출력하시오. 단] 각 정수는 서로 다른 값 이라는 전제
        System.out.print("[4] 정수1 : ");     int value1 = scan.nextInt();
        System.out.print("[4] 정수2 : ");     int value2 = scan.nextInt();
        System.out.print("[4] 정수3 : ");     int value3 = scan.nextInt();
        // 방법1] 각 변수별 값 비교
        if( value1 > value2 && value1 > value3 ) { // #만약에 첫번째 값이 두번째 값보다 크고 첫번째 값이 세번째 값보다 크면
            System.out.println( value1 );
        } else if ( value2 > value3 ) {  System.out.println( value2 ); }
        else{  System.out.println( value3 );  }
        // 방법2] 임의의 변수 활용
        int max = value1; // # 첫번째 값을 max 변수에 대입한다.
        if( max < value2 ) { // # 만약에 max 보다 두번째 값이 더 크면 max변수에 두번째 값 대입한다.
            max = value2;
        }
        if ( max < value3 ){ max = value3; }
        // 여기서 if ~ else if 사용하면 모든 조건 검사를 하지 않기 때문에 if ~ if 사용한다.
        System.out.println( max );

        // [5] 조건문 실습5 : 각 3개의 정수타입을 입력받아 오름차순 으로 출력하시오. 단] 각 정수는 서로 다른 값 이라는 전제

        // * 스왑[ 두 변수간의 값 교체 ]
        /*
            int a = 10 ; int b = 5;
            - 두 a와 b 가 가진 변수 값을 서로 교환 하시오.
            - 주의할점 : 1. 변수는 항상 하나의 값만 저장할수 있다.
                a = b;  a에 b를 대입하면 기존의 a값은 사라진다.
            - 해결방안 : 임시변수temp를 만들어서 시계방향으로 스왑하자.
            1. 임시변수를 하나 선언하다.
                int temp;               a = 10 , b = 5
            2. 첫번째 값을 temp에 대입한다.
                temp = a;               temp = 10 , a = 10 , b = 5
            3. 두번째 값을 a에 대입한다.
                a = b;                  temp = 10 , a = 5 , b = 5
            4. temp 값을 b에 대입한다.
                b = temp;               temp = 10 , a = 5 , b = 10
         */

    } // main end
}// class end











