package day04;

public class STEP3 { // class s
    public static void main(String[] args) { // main s

        // 변수의 타입 변환 # 캐스팅 # 다형성( 다양한 형태의 성질 = 다양한 타입을 가질수 있다. )
        // [1] 자동 타입 변환 # 묵시적 # 타입의 표현크기가 작은 것에서 큰 순으로 변환 # 자료의 손실 없다.
            // byte -> short -> int -> long -> float -> double
        byte byte1 = 10;
        short short1 = byte1; // byte 변수 자료를 short 변수에 대입한다. ( 자동 타입변환 실행 )
        int int1 = short1;    // short 변수 자료를 int 변수에 대입한다.  ( 자동 타입변환 실행 )
        long long1 = int1;    // int 변수 자료를 long 변수에 대입한다.  ( 자동 타입변환 실행 )
        float float1 = long1; // long 변수 자료를 float 변수에 대입한다. ( 자동 타입변환 실행 )
        double double1 = float1; // float 변수 자료를 double 변수에 대입한다. ( 자동 타입변환 실행 )

        // [2] 강제 타입 변환 # 명시적 # 타입의 표현크기가 큰 것에서 작은 순으로 변환 # (변환한 타입의 크기가 넘치면) 자료의 손실 있다.
            // byte <- short <- int <- long <- float <- double
            // ( 변한할타입명시 )기존자료
        // float float2 = double1; // double 변수 자료를 float 변수에 대입 할수 없어. 왜?? double 이 더 큰 자료 이라서.
        float float2 = (float) double1; // double 변수 자료를 float 변수에 대입한다 ( 강제 타입변환 실행 )
        long long2 = (long) float2;
        int int2 = (int) long2;
        short short2 = (short) int2;
        byte byte2 = (byte) short2;
        
    } // main e
} // class e


















