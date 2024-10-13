package day10_1014월.real.STEP1;

// 계좌[통장] 설계
public class Account {

    String number; // 계좌번호
    int balance; // 예금액
    boolean use = true; // 사용여부

    void 예금액확인(){
        System.out.println( balance );
    }
    void 예금( int 예금액 ){
        balance += 예금액;
    }
    boolean 계좌번호받기( ){
        return use;
    }
    int 예금액반환받기( String 환전 ){
        if( 환전 == "달러" ){
            return balance/1300;
        }else if( 환전 == "엔화"){
            return balance/900;
        }else{
            return 0;
        }
    }

}
