package day03; // 현재 파일이 위치한 폴더명

public class STEP1 { // { 클래스 시작 // 클래스 밖 코드는 컴파일(번역) 안된다.
    // main + 엔터
    public static void main(String[] args) { // 메인함수 시작 // 코드 실행 구역

        int a = 2; // 코드 번역 // 코드 실행 O // 변수 선언 O

        // [1] 출력함수 # 함수??? 기능 # 종류 : 1.라이브러리(미리 만들어진 함수/기능) 2.정의함수(내가만드는함수/기능)
            // 1. System : 시스템 관련된 기능 제공하는 클래스???
            // 2. . : 앞에있는 클래스의 접근 연산자
            // 3. out : 출력 관련 속성
            // 4. .
            // 5. print( 데이터 또는 변수명 ) : 출력 함수
        System.out.print( 3 ); // 리터럴 3 를 콘솔창에 출력 하는 함수
        // print() 자동완성 : sout + 엔터
        System.out.println( 3.15 ); // 리터럴 3.15 를 콘솔창 출력 하는 함수
        System.out.println( 'a' );  // 리터럴 'a' 를 콘솔창 출력 하는 함수
        System.out.println( "abc"); // 리터럴 "abc" 를 콘솔창 출력 하는 함수
        System.out.println( true ); // 리터럴 true 를 콘솔창 출력 하는 함수

        // [2] 출력함수의 종류 :
            // 1.System.out.print();    : ( ) 안에 있는 자료 및 변수값을 출력 하는 함수
            // 2.System.out.println();  : ( ) 안에 있는 자료 및 변수값을 출력 하고 *줄바꿈처리* 함수
            // 3.System.out.printf();   : f(포멧/형식/틀) 에 따른 ( ) 안에 있는 자료 및 변수값을 출력 하는 함수
        System.out.print("자바 안녕");          // sout+엔터 -> ln 지우기  # 출력만
        System.out.println("자바 안녕2");       // sout+엔터              # 출력후 줄바꿈처리
        System.out.println("자바 안녕3");       // print() 보다 많이 사용된다.
        System.out.printf("자바 안녕%d" , 4 ) ; // souf + 엔터

        // [3] printf() 의 형식문자 # 다양한 형식 지정자를 이용한 문자열 형식 만들기 # 사용처 : 백엔드 로그(기록)
            /*
                지정 형식 문자
                    1. %[자릿수][형식문자]      : 자릿수만큼 자릿수를 차지 , 만일 데이터가 자릿수만큼 비어 있으면 공백처리 # 오른쪽 정렬
                    2. %-[자릿수][형식문자]     : 자릿수만큼 자릿수를 차지 , 만일 데이터가 자릿수만큼 비어 있으면 공백처리 # 왼쪽 정렬
                    3. %[전체자릿수].[소수점자릿수]F : 전체자릿수 만큼 자릿수 차지 , 소수점자릿수까지 소수점이 표시
                    4. %0[자릿수]D/F           : 자릿수만큼 자릿수를 차지 , 만일 데이터가 자릿수만큼 비어 있으면 0 으로 처리
            */
            // 1. %d : 정수 뜻
        System.out.printf( "문자열 %d 문자열" , 13 ); // printf( "문자열1 형식문자1 문자열2" , 값1 )
        System.out.printf( "문자열 %d 문자열 %d" , 100 , 13 );
        // printf( "문자열1 형식문자1 문자열2 형식문자2" , 값1 , 값2 );
            // 2. %f : 실수 뜻 #  %.소수점자릿수f
        System.out.printf( "문자열 %f 문자열 %.2f" , 3.141592 , 3.141592 ); // 문자열 3.141592 문자열 3.14
            // 3. %s : 문자열 뜻 # %자릿수s # 정렬
        System.out.printf( "문자열 %s 문자열 %10s 문자열 %-10s" , "바나나" , "바나나" , "바나나" );

        // [중간실습1] 3가지의 변수가 주어졌을때. 그림과 같이 printf 이용한 출력 하는 코드를 작성하시오.
        int num = 1;    // 정수 1 를 저장하고 있는 int 타입 'num' 변수 선언
        String writer = "유재석"; // 문자열 "유재석" 를 저장하고 있는 String타입 'writer' 변수 선언
        String content = "안녕하세요!"; // 문자열 "안녕하세요!"를 저장하고 있는 String타입 'content' 변수 선언
        // [1]
        System.out.println(); // 줄바꿈 출력 함수
        System.out.printf("============ %s ============" , "방문록" ); // souf + 엔터
        System.out.println();
        System.out.printf("%-5s %-5s %-10s" , "번호" , "작성자" , "방문록" );
        System.out.println();
        System.out.printf("%-6d %-5s %-10s" , num , writer , content );
        // 폰트 와 자료에 따라 자리(너비) 다르기 때문에 적확히 정렬 맞추기 쉽지 않다. # 정수5자리 , 문자5자리
        System.out.println();
        System.out.printf("============================");

        // [4] 이스케이프/제어 문자 # 백슬래시 이용한 기능 # 제어가 가능한 문자 # 다른 프로그래밍 언어 와 공통
            // 백슬래시 '\' : 주로 키보드 엔터 위에 원화기호 vs 슬래시 /
            // 제어 문자 : 1. \n : 줄바꿈   2. \t : 들여쓰기[tab키]  3. \\ : \ 한개 출력  4. \" : " 한개 출력  5. \' : ' 한개 출력
        System.out.println("자바\n안녕"); // "자바" 출력후 줄바꿈 "안녕" 출력
        System.out.println("자바\t\t안녕\t\t2"); //
        System.out.println("자바\\안녕3");  // \백슬래시 문자 출력할때
        System.out.println("자바\"안녕4\""); // \"   "문자 출력할떄
                        // " : 문자열을 식별하는 큰따옴표    // \" : 큰따옴표 그 자체 문자
        System.out.println("자바\'안녕5\'");

        // [중간실습2] 그림과 같이 이스케이프 문자를 이용하여 출력하는 코드 작성하시오.
        System.out.println("|\\_/|");           // | : shift키 + 엔터 위에 백슬래시
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`");           // ` : 키보드 왼쪽에 tab키 위에 `(백틱)
        System.out.println("||_/=\\\\__|");

    } // 메인함수 끝
} // } 클래스 끝















