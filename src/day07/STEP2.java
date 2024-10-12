package day07;

import java.util.Scanner;

public class STEP2 { // class start
    public static void main(String[] args) { // main start

        // [반복문]
        System.out.println("java 1");
        System.out.println("java 2");
        System.out.println("java 3");
        System.out.println("java 4");
        System.out.println("java 5");
        // - 코드를 5줄 입력하고 보았더니 중복되는 부분이 많다.
        // 1. 중복되는 코드 : System.out.println("java O");
        // 2. 중복되지 않는 코드 : 1 2 3 4 5
        // 3. 중복되지 않는 코드의 패턴 : 1부터 5까지 1씩 증가 # 패턴 찾기
        for( int 숫자 = 1 ; 숫자<=5 ; 숫자++  ){
            System.out.println("java "+숫자);
        } // for end

        // 예제1] 1부터 10까지 출력하시오.
            // 방법1[반복문없이]
        System.out.println( 1 ); System.out.println( 2 ); System.out.println( 3 );
        System.out.println( 4 ); System.out.println( 4 ); System.out.println( 5 );
        System.out.println( 6 ); System.out.println( 7 ); System.out.println( 8 );
        System.out.println( 9 ); System.out.println( 10 );
            // 방법2[반복문활용]
                // 중복코드 : System.out.println( ~ );
                // 중복되지 않는 코드 : 1 2 3 4 5 6 7 8 9 10
                // 중복되지 않는 코드 의 패턴 : 1부터 10까지 1씩증가 => for( int i = 1 ; i<=10 ; i++ ) { }
         for( int i = 1 ; i<=10 ; i++ ){
             System.out.println( i );
         }

         // 예제2] 1부터 10까지 누적합계(총합계 계산하여) 를 출력하세요.
            // 방법1[반복문없이]
                // 누적 - 하나의 변수에서 관리
            int sum = 0;    // 1부터 10까지 누적으로 하나씩 더해서 를 저장할 변수
            sum = sum + 1 ;  sum = sum + 2 ;
            sum += 3;   // 복합대입연산자
            sum += 4;  sum += 5; sum += 6;  sum += 7;
            sum += 8;  sum += 9; sum += 10;
            System.out.println( sum );
            // 방법2[반복문활용]
                // - 반복 되는 코드 : sum += ~;
                // - 반복 되지 않는 코드 :
                    // 1. int sum = 0; , 2. System.out.println( sum ); 3. 1 2 3 4 5 6 7 8 9 10
                // - 반복 되지 않는 코드에서 패턴 찾기 : 1부터 10까지 1씩증가 => for( int i = 1 ; i<=10 ; i++ )
            int sum2 = 0;
            for( int i = 1 ; i<=10 ; i++ ){ // for문 시작
                sum2 += i; // for 반복 실행 코드
            } //  for문 종료
            System.out.println( sum2 );

        // 예제3 ] 1 부터 100까지 7의 배수만 누적합계를 구하시오.
            // 방법1 : if 사용해서 7배수 값 흐름 제어 하기
        int sum3 = 0;
        for( int i = 1 ; i<=100 ; i++ ){ // i는 1부터 100까지 1씩증가 하면서 대입 되는 변수
            if( i % 7 == 0 ) sum3 += i;
            // * 배수찾기 : 특정한 값에 어떤 수 를 나누었을때 나머지가 0 이면 값은 어떤 수의 배수
            // i 가 나누기 7 했을때 나머지가 0 이면 i는 7의 배수이다.
        } //for end
        System.out.println( sum3 );
            // 방법2 : 7씩 증가하기 # 증감식에 1씩증가 가 아닌 7씩증가를 하자.
        int sum4 = 0;
        for( int i = 0 ; i<=100 ; i += 7 ){
            sum4 += i;
        }
        System.out.println( sum4 );

        // 예제4] 키보드로 부터 입력받은 수(조건문) 만큼 '안녕하세요' 출력하시오.
            // i는 1부터 입력받은 수 까지 i는 1씩증가
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        for( int i = 1 ; i <= value ; i++ ){
            System.out.println("안녕하세요.");
        }

    } // main end
}// class end

























