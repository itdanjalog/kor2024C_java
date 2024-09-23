package day03;

import java.util.Scanner;

public class STEP2 { // class start
    public static void main(String[] args) { //  main start
        // [2] 입력 함수
            // * 따라하기
            // 1. Scanner : 입력 관련 기능 제공하는 클래스
                // 현재 클래스 밖에서 import java.util.Scanner;
                // - Scan + 엔터 " 자동완성으로 작성시 위 코드가 자동으로 작성된다.
            // 2. scan : 변수명(아무거나)
            // 3. =
            // 4. new : 객체 생성 연산자
            // 5. Scanner( System.in); : 생성자
        // [1] 입력 객체 생성 # 콘솔창에서 키보드로 입력받을때 필요한 코드
        Scanner scan = new Scanner( System.in );

        // [2] 키보드로 부터 입력 받고 입력받은 자료를 반환 하는 함수/기능
        // scan.next();

        // [3] 각 자료들을 입력받아 변수에 저장 # 콘솔에서 키보드로 부터 입력후 엔터(enter) 기준으로 입력이 종료 된다.
        // 1. 문자열 입력받기 # .next()
        System.out.println("(1) 문자열 입력하세요.");   // 입력 전에 안내문구 출력
        String str1 = scan.next(); // 키보드로부터 입력받은 자료를 문자열로 가져오기 // 문자열 변수에 대입
            // - 실행순서
                // 1. scan.next(); ---> 키보드로부터 입력대기 ---> enter 입력종료 --> 입력값 반환(돌려준다)
                // 2. 예] "java"; 콘솔에 입력했다면 String str1 = "java";
                // 3. str1 변수에 "java" 대입
        System.out.println("(1) 입력한 자료는 " + str1 ); // "문자열" + 변수값  : 연결된 문자열
        // 2. 정수 입력받기 #  .nextInt()
        System.out.println("(2) 정수 입력하세요."); // 안내출력
        int value1 = scan.nextInt(); // 만약에 키보드로부터 52 를 입력했다면 int value1 = 52;
        System.out.println("(2) 입력한 자료는 " + value1 );
        // 3. 실수 입력받기 # .nextDouble()
        System.out.println("(3) 실수 입력하세요."); // 안내출력
        double value2 = scan.nextDouble();
        System.out.println("(3) 입력한 자료는 " + value2 );
        // 4. 불리언 입력받기 # .nextBoolean();
        System.out.println("(4) 불리언 입력하세요.");
        boolean value3 = scan.nextBoolean();
        System.out.println("(4) 입력한 자료는 " + value3 );
        // 5. 그외 정수 # .nextByte() #.nextShort() #.nextLong()  , 실수 # .nextFloat()
        // 6. 문자(char) 입력 없음 ,
        // 7. 문자열 입력 사용 : .next() 공백 입력불가능 vs . nextLine() 공백 입력가능
        System.out.println("(5) 띄어쓰기(스페이바) 포함된 문자열 입력하세요. ");
        scan.nextLine(); // 의미없는 입력 함수를 사이에 추가 ( day03 강의 시간 외 추가된 코드 )
        String str2 = scan.nextLine();
        System.out.println("(5) 입력한 자료는 " + str2 );
    } // main end
} // class end






