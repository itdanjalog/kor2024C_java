package day08;

import java.util.Scanner;

public class STEP3 {
    public static void main(String[] args) {

        // - 무한 반복(루프) 문 : 24시간 실행되는 프로그램/코드 작성할때 사용한다.
        // (방법1)
        // for( ; ; ){  System.out.println("무한 실행중");   }
        // (방법2) : while( 조건문 ) { 실행문; }
        // while( true ){   System.out.println("무한 실행중2");  }

        // 실습 : 회원들의 명단(등록,삭제,확인 기능) 관리하는 프로그램 구현 # 회원의 명단은 최대 10명
        // 5. 배열을 선언 # 최대 문자열(이름) 10개 저장할수 있는 배열 선언/만들기
        String[] memberArray = new String[10]; // String[문자열] 10개를 저장할수 있는 배열 선언 (1)
        System.out.println( memberArray[0] ); // null // ???? // 우리가 배열 만들고 아무런 값을 대입하지 않았다면 기본적으로 임의값이 들어가 있다.
        // 배열내 초기(자동) 기본값 : 정수타입(0) 실수타입(0.0)참조[클래스-String]타입(null)
        while ( true ){ // 1. 무한 반복/루프 문
            // - 현재 주제에서 배열을 while 안에 만들면 안되는 이유 : 명단(목록)은 누적으로 사용하므로 선언은 1번만 한다.
            // String[] memberArray = new String[10]; // String[문자열] 10개를 저장할수 있는 배열 선언 (1)
            System.out.print("1.명단등록 2.명단확인 3.명단삭제 4.프로그램종료 : "); // 2. 출력문 # 기능선택 메뉴
            Scanner scan = new Scanner( System.in);
            int 메뉴번호 = scan.nextInt(); // 3.입력받기 # 기능선택 번호 입력받기
            // 4. 조건문 # 키보드로부터 입력받은 번호에 따라 기능/코드 수행
            if( 메뉴번호 == 1 ) { // 만약에 입력한 값이 1 이면
                System.out.println(">> 명단 등록 기능을 선택 했습니다. ");
                System.out.print(">>>> 등록할 새로운 회원명을 입력해주세요 : ");
                String 회원명 = scan.next(); // - 등록할 회원의 이름)문자열) 을 입력받기
                // 6. 배열내 빈 공간의 인덱스를 찾아서 이름을 대입한다. # 빈공간??? 배열내 null 이 존재하면 빈 공간 이라는 뜻 (임의)
                for( int i = 0 ; i < memberArray.length  ; i++ ){ // i는 0부터 배열길이 미만 까지 1씩증가 # 배열 인덱스 순회(처음부터 끝까지)
                    if( memberArray[i] == null ){ // 배열내 빈공간 찾기 = null # 만약에 i번째 인덱스의 값이 null 이면
                        memberArray[i] = 회원명; // = 대입 vs == 같다 # 키보드로 입력받은 문자열(이름)을 대입한다.
                        break; // 한명 회원만 등록 하기 때문에 등록성공시 break 이용한 for(가장가까운반복문)를 종료한다.
                    } //if end
                }// for end
            } // if end

            if( 메뉴번호 == 2 ) { // 만약에 입력한 값이 2 이면
                System.out.println(">> 명단 확인 기능을 선택 했습니다. ");
                // - 배열내 모든 인덱스에 해당 하는 자료 출력하시오. # 배열내 모든 회원명 출력하기
                for( int i = 0 ; i < memberArray.length ; i++ ){ // # i는 0부터 마지막 인덱스 까지 1씩증가
                    // # 만약에 i번째 인덱스의 회원명 대신 null(회원명 없다뜻) 이면
                    // continue;(가장 가까운 반복문(증감식)으로 이동)하고 아래 코드는 실행되지 않는다.
                    if( memberArray[i] == null ){ continue;}
                    System.out.printf( "> 회원번호 : %d  , 회원명 : %s \n" , i , memberArray[i] );
                } // for end
            } // if end

            if( 메뉴번호 == 3 ) {
                System.out.println(">> 명단 삭제 기능을 선택 했습니다.");
            } // if end

            if( 메뉴번호 == 4 ){
                System.out.println(">> 프로그램 종료 합니다.");
                break; // 가장 가까운 반복문을 강제 종료/탈출
            } // if end

        } // while end // 무한루프 끝
    } // main end
} // class end






