package day08;

import java.util.Scanner;

public class STEP2 {
    public static void main(String[] args) {

        // -배열 과 반복문 관계
        // 배열이란 : 여러 자료들을 순서대로 저장된 하나의 자료
        // 인덱스이란 :  배열 자료에 저장된 여러개 자료들의 저장순서 번호( 0 ~ )
        // 인덱스패턴 :  0부터 (마지막자료의인덱스번호) 까지 1씩 증가
        // 마지막인덱스
        //  1. 배열의 길이 반환 : 배열변수명.length
        //  2. 마지막인덱스 찾기 : 배열변수명.length - 1
        //      # 왜 -1 넣죠?? 인덱스 0부터 길이 1부터 이므로 마지막길이를 마지막인덱스 변경하기 위해서

        // 예제1] 3명의 점수를 가지는 배열 선언
        int[] array1 = new int[3]; // - int형 자료 3개를 저장할수 있는 배열 자료 선언
        array1[0] = 83; // - 0번 인덱스에 83 자료 대입
        array1[1] = 90; // - 1번 인덱스에 90 자료 대입
        array1[2] = 67; // - 2번 인덱스에 67 자료 대입
        System.out.println( array1.length ); // - 총 길이/개수 = 3  , - 총 인덱스 : 0 1 2

        // 생각하기] array1 배열내 모든 자료들을 출력하시오.
            // 방법1 [반복문 없이 ]
        System.out.println( array1[0] ); // 배열내 특정 인덱스의 자료 호출 하는 방법
        System.out.println( array1[1] ); // 배열변수명[인덱스번호]
        System.out.println( array1[2] );
            // 방법2 [반복문 활용 ]
                // - 반복되는 코드  :   System.out.println( array1[~] );
                // - 반복되지 않는 코드  : 0 1 2
                // - 반복되지 않는 코드 패턴 : 0부터 2( 배열의 마지막인덱스 , 배열변수명.length-1 ) 까지 1씩증가
                    // # for( int i = 0 ; i<=2 ; i++ ) { }
        for( int i = 0 ; i <= array1.length-1 ; i++ ){
            System.out.println( array1[i] );
        }

        // 예2] 키보드 로부터 3명의 점수를 입력받아 하나의 배열에 저장하시오.
        Scanner scan = new Scanner(System.in);
        int[] array2 = new int[3]; // int형 자료 3개를 저장할수 있는 int 배열 선언
            // [반복문 없이 ]
        array2[0] = scan.nextInt(); // 키보드로부터 입력받은 자료 를 0번 인덱스에 대입
        array2[1] = scan.nextInt();
        array2[2] = scan.nextInt();
            // [ 반복문 활용 ]
        for( int i = 0 ; i<= array2.length -1 ;  i++  ){
            array2[i] = scan.nextInt();
        } // for end

    } // main end
} // class end






