package day08;

import java.util.Scanner;

public class STEP1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 입력객체
        // 실습1 : 키보드로 부터 입력한 수만큼 '*' 출력
        System.out.print("[1] 별 개수 : ");
        int value1 = scan.nextInt();
            // 패턴 : 초기값(1부터) , 조건문(입력받은수-value1) , 증감식(1씩증가)  // 문법 : for( int i = 1 ; i<=value1 ; i++ ){ }
        for( int i = 1 ; i<=value1 ; i++ ){
            System.out.print(" * ");
        }//for end

        // 실습2 : 키보드로 부터 입력한 줄수 만큼 아래와 같이 출력
        /* 입력예] 5  , 출력예] 입력받은 줄수만큼의 5줄 직삼각형 별 출력하기. ( 왼쪽 정렬 )
            변수 :        line        star                구구단       단         곱
            *             1          1                               2단        1 2 3 4 5 6 7 8 9
            **            2          1 2                             3단        1 2 3 4 5 6 7 8 9
            ***           3          1 2 3                           4단        1 2 3 4 5 6 7 8 9
            ****          4          1 2 3 4                         5단        1 2 3 4 5 6 7 8 9
            *****         5          1 2 3 4 5
            line 패턴 :   1부터 5까지 1씩 증가.                          단 패턴 : 1부터  9까지 1씩증가
            stat 패턴 :   1부터 현재 줄수(line) 까지 1씩증가              곱 패턴 : 1부터  9까지 1씩증가
            - 줄 마다 모든 별 출력                                      - 단 마다 모든 곱 출력
        */
        System.out.println();
        System.out.print("[2] 줄 수 : ");
        int value2 = scan.nextInt();
        for( int line = 1 ; line <= value2 ; line++ ) { //(1) 줄 은 1부터 입력받은수(value2)까지 1씩증가
            // (2) 별출력
            for( int star = 1 ; star <= line ; star++ ){ // (2) 별 은 1부터 현재 줄수(line)까지 1씩증가
                System.out.print("*"); // print[o] println[x]
            }// for end
            // (2) 줄바꿈 : 1.  System.out.println();  2. \n : 제어문자
            System.out.println("");
        } // for end

        // 실습3 : 키보드로 부터 입력한 줄수 만큼 아래와 같이 출력
        /* 입력예] 5  , 출력예] 입력받은 줄수만큼의 5줄 직삼각형 별 출력하기. ( 오른쪽 정렬 )
                - 왼쪽부터 출력시에는 공백이 필요없지만 오른쪽에 출력시에는 공백 필요.
                변수      line        blank           star
                 *          1        1 2 3 4         1
                **          2        1 2 3           1 2
               ***          3        1 2             1 2 3
              ****          4        1               1 2 3 4
             *****          5        -               1 2 3 4 5
             line패턴 : 1부터 5까지 1씩증가
             blank패턴 : 1부터 ( 입력받은줄수[최대줄수] - 현재줄수 ) 까지 1씩 증가
             star패턴 : 1부터 현재 줄수(line)까지 1씩증가
         */
        System.out.print("[3] 줄 수 : ");
        int value3 = scan.nextInt();
        for( int line = 1 ; line<=value3 ; line++ ){ //(*) 줄 은 1부터 입력받은 수 까지 1씩증가
            // (1) 공백 출력  : 공백은 1부터 최대줄수-현재줄수 까지 1씩증가
            for( int blank = 1 ;  blank <= value3 - line ; blank++  ){
                System.out.print(" "); // 공백 출력 : "스페이바"
            } // for end
            // (2) 별 출력 : 별은 1부터 현재줄수 까지 1씩증가
            for( int star = 1 ; star <= line ; star++ ){
                System.out.print("*");
            } // for end
            // (3) 줄바꿈
            System.out.println();
        } // for end
        // 실습4 : 키보드로 부터 입력한 줄수 만큼 아래와 같이 출력
        /* 입력예] 5  , 출력예] 입력받은 줄수만큼의 5줄 삼각형 별 출력하기.
                변수          line         blank          star                    현재줄수*2 - 1
                 *              1         1 2 3 4        1                          2       1
                ***             2         1 2 3          1 2 3                      4       3
               *****            3         1 2            1 2 3 4 5                  6       5
              *******           4         1              1 2 3 4 5 6 7              8       7
             *********          5         -              1 2 3 4 5 6 7 8 9          10      9
             line패턴 : 1부터 5까지 1씩증가
             blank패턴 : 1부터 (4 3 2 1 0 , 최대줄수[입력받은수] - 현재줄수 ) 까지 1씩증가
             star패턴 : 1부터 ( 1 3 5 7 9 , 현재줄수*2-1 ) 까지 1씩 증가
         */
        System.out.print("[4] 줄 수 : ");
        int value4 = scan.nextInt();
        for( int line = 1 ; line <= value4 ; line++ ){ // (1) 줄은 1부터 입력받은 수 까지 1씩증가
            // (2) 공백 출력 : 공백은 1부터 입력받은수[최대줄수] - 현재줄수 까지 1씩증가
            for( int blank = 1 ; blank <= value4 - line ; blank++ ){
                System.out.print(" ");
            } // for end
            // (2) 별 출력 : 별 은 1부터 현재줄수*2-1 까지 1씩증가
            for( int star = 1 ; star <= line*2-1 ; star++ ){
                System.out.print("*");
            } // for end
            // (2) 줄바꿈
            System.out.println("");
        } // for end

    } // main end
} // class end






