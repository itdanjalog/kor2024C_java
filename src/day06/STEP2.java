package day06;

public class STEP2 { // class start

    public static void main(String[] args) { // class start

        int age = 10;

        // [1] if문 # 만약에 age(나이)가 19 이상이면 '입장가능' 출력하시오.
        if( age >= 19 ) System.out.println("[1]입장가능");
            // age(10) >= 19 는 false 이므로 출력문이 실행되지 않는다.

        // [2] if문 # 만약에 age(나이)가 19 이상이면 '성인입니다' '입장가능' 출력하시오.
        if( age >= 19 )
            System.out.println("[2]성인입니다.");
            System.out.println("[2]입장가능");
            // # 오류 : age가 false 임에도 입장가능이 출력된다

        if( age >= 19 ){ // if start
            System.out.println("[3]성인입니다.");
            System.out.println("[3]입장가능");
        } // if end # { }를 이용한 여러개 명령문을 묶어 오류 해결하기.

        // [3] if ~ else 문 # 만약에 나이가 19 이상이면 '성인입니다' 아니면 '미성년자입니다' 출력하시오.
        if( age >= 19 ){
            System.out.println("[4]성인 입니다.");
        } // if end
        else{
            System.out.println("[4]미성년자 입니다.");
        } // else end

        // [4] if ~ else if ~ else if ~ else 문
        // # 만약에 나이가 40 이상이면 '중년' 19세이상이면'청년' 7세이상이면'학생' 그외 '유아'
        // # 중년 또는 청년 또는 학생 또는 유아 중 하나만 결과값
        if( age >= 40 ){System.out.println("[5]중년");}
        else if( age >= 19 ) { System.out.println("[5] 청년"); }
        else if( age >= 7 ) { System.out.println("[5] 학생"); }
        else { System.out.println("[5] 유아"); }
        // if ~ else if : 다수 조건에 따른 하나의 결과를 얻는다.
        // vs
        // if if  : 다수 조건에 따른 다수 결과를 얻는다.
        if( age >= 40 ){System.out.println("[6]중년");}
        if( age >= 19 ) { System.out.println("[6] 청년"); }
        if( age >= 7 ) { System.out.println("[6] 학생"); }
        if( age < 7){ System.out.println("[6] 유아"); }

        // [5] 중첩 if문
        char gender = 'M';
        if( age >=19 ){
            if( gender == 'W'){
                System.out.println("[7] 성인 여성 입니다.]");
            }else{
                System.out.println("[8] 남성 입니다.");
            }
        }
    } // main end
}// class end











