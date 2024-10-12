package day07;

public class STEP3 { // class start
    public static void main(String[] args) { // main start

        // 실습1 : 구구단 중에서 2단 만 콘솔 출력하시오.
        // [ 반복문없이 ]
        // 형식문자 : %d 정수 , %f실수 , %c문자 , %s문자열  , %자릿수d
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 1 , 2*1 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 2 , 2*2 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 3 , 2*3 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 4 , 2*4 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 5 , 2*5 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 6 , 2*6 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 7 , 2*7 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 8 , 2*8 );
        System.out.printf( "%d  X  %d = %2d \n" , 2 , 9 , 2*9 );
        // [ 반복문 변경 ]// 반복 패턴 : 곱이 1부터 9까지 1씩증가 반복 -> for( int 곱 = 1 ; 곱<=9 ; 곱++ ){ }
        for( int 곱 = 1 ; 곱<=9 ; 곱++ ){
            System.out.printf( "%d  X  %d = %2d \n" , 2 , 곱 , 2*곱 );
        } // for end

        // 실습2 : 구구단 출력하시오.
            // 단 : 2 3 4 5 6 7 8 9      # 2부터 9까지 1씩 증가 -> for( int 단 = 2 ; 단 <= 9 ; 단++ ) { }
            // 곱 : 1 2 3 4 5 6 7 8 9    # 1부터 9까지 1씩 중가 -> for( int 곱 = 1 ; 곱 <= 9 ; 곱++ ) { }
        // [1] 단 과 곱 패턴 찾기
        for( int 단 = 2 ; 단<=9 ; 단++ ){ // # 2 ~ 9
            System.out.println( 단 );
        } // for end
        for( int 곱 = 1 ; 곱<=9 ; 곱++ ) { // # 1 ~ 9
            System.out.println( 곱 );
        } // for end

        // [2] 단 과 곱 출력문 합치기 # 생각해보기 : 1.단 마다 곱 출력/단 안에 곱 포함 2.곱 마다 단 출력/ 곱 안에 단 포함
        // 하나의 단이 출력될때 곱은 1~9 모두 출력된다.# 단 마다 모든곱(1~9) 이 출력한다.
        // for문의 중첩 : for(){ for(){} } # 첫번째 for문이 1회전 할때 마다 두번째 for문은 전체 반복을 한다.
        for( int 단 = 2 ; 단<=9 ; 단++ ){ // # 2 ~ 9           # 8회전 # 상위에 있는 for문에 1회전마다
            for( int 곱 = 1 ; 곱<=9 ; 곱++ ) { // # 1 ~ 9      # 9회전 # 하위에 있는 for문은 전체 회전 # 72회(8*9)
                System.out.printf( "%d  X  %d = %2d \n" , 단 , 곱 , 단 * 곱 );
            }//for end
        } // for end

        // 실습3 :  아래 코드에서 '안녕하세요' 의 출력 횟수 생각해보기 # 정답 : 30번
        for( int i = 1 ; i<=5 ;i ++ ){                  // i는 1부터 5까지 1씩증가 = 총 5회
            for( int j = 1 ; j<=3 ; j++ ){              // j는 1부터 3까지 1씩증가 = 총 3회 -> 5*3 => 15회전 실횅
                for( int k = 1 ; k<=2 ; k++ ){          // k는 1부터 2까지 1씩증가 = 총 2회 -> 15*2 => 30회전 실행
                    System.out.println("안녕하세요");        // 하위 반복문은 상위 반복문 1회전 마다 전체회전
                } // for end
            } // for end
        } // for end

        // 반복문에서 주요 키워드 # 키워드란: 기능이 내포된 단어들
        // [1] continue : 가장 가까운 반복문(증감식) 으로 흐름 이동
        for( int i = 1 ; i<=5; i++ ){
            if( i == 3 ){ continue;} // 만약에 i가 3이면 가장가까운 반복문으로 이동한다.
            // # 코드흐름이 continue 만나면 아래코드는 실행되지 않느다.
            System.out.println( i ); // 1 2 4 5 # 3은 continue 만났기 때문에  출력되지 않는다.
        }// for end

        // [2] break : 가장 가까운 반복문 강제 종료
        for( int i = 1 ; i<=5 ; i++ ){
            if( i == 3 ){ break; } // 만약에 i가 3이면 가장가까운 반복문을 강제 종료한다. for{} 탈출한다.
            System.out.println( i ); // 1 2 # i가 3일때 break 를 만났기 때문에 for문은 종료되서 3 4 5 는 출력되지 않는다.
        } // for end

    } // main end
}// class end

























