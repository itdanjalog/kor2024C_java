package day06_1007월; // 해당 클래스가 포함된 패키지/폴더명

public class Step1 { // class start

    public static void main(String[] args) { // main start


        // [1] if
        int age = 10;

        // 1. 변수 선언
        // 2. 해당 변수를 논리
        if( age >= 19 ) System.out.println("[1] 성인 입니다.");

        // [2] if{ }
        if( age >= 19 )
            System.out.println("[2] 성인 입니다.");
            System.out.println("[2] 서비스 이용할수 있습니다.");   // 성인이 아닌데 '서비스 이용 '출력된다.

        if( age >= 19 ) {
            System.out.println("[2] 성인 입니다.");
            System.out.println("[2] 서비스 이용할수 있습니다.");   // 성인일때만 '서비스 이용' 출력된다.
        }

        // [3] if{ } else { }
        if( age >= 19 ){  System.out.println("[3] 성인 입니다."); }
        else{  System.out.println("[3] 미성년자 입니다.");  }

        // [4] if{ } else if{ } else if{ } else{ }
        if( age >= 40 ) { System.out.println("[4] 중년");  }
        else if( age >= 19 ){  System.out.println("[4] 청년"); }
        else if( age >= 7 ){ System.out.println("[4] 학생");}
        else{ System.out.println("[4] 유아"); }
            // if ~ else if : 다수 조건에 따른 하나의 결과를 얻기
            // vs
            // if 다수 : 다수 조건에 따른 다수 결과를 얻기
        if( age >= 40 ) { System.out.println("[4] 중년");  }
        if( age >= 19 ){  System.out.println("[4] 청년"); }
        if( age >= 7 ){ System.out.println("[4] 학생");}
        else{ System.out.println("[4] 유아"); }

        // [5] if중첩
        char gender = 'M';
        if( age >= 19 ){
            if( gender == 'W'){ // age >= 19 and gender == 'W'
                System.out.println("[5] 성인 여성 입니다. ");
            }else{
                System.out.println("[5] 성인 남성 입니다. ");
            }
        }else{
            System.out.println("[5] 미성년자 입니다. ");
        }

    } // main end
    // main { } 밖에 코드선언(변수선언)는 가능 하지만 실행(변수호출)코드는 불가능하다.
} // class end
// class { } 밖에 코드 입력시 컴파일(번역) 오류 발생 : 꼭 { } 체크 하자.









