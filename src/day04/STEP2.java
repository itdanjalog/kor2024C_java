package day04;

import java.util.Arrays;

public class STEP2 {
    public static void main(String[] args) {

        // 1. 변수란? 하나의 값을 저장하는 메모리 공간
        // 정수 5개를 저장하기 위해 변수 5개 선언
        int var1 = 1; int var2 = 2; int var3 = 3; int var4 = 4; int var5 = 5;
        // 2. [배열선언] 하나의 변수에 여러개 값을 저장하는 타입 = 배열타입
        // 정수 5개를 저장하기 위해 배열 1개 선언
        int[] array1 = new int[]{ 1,2,3,4,5 };
        System.out.println(Arrays.toString( array1 ) );
        int[] array2 = new int[5];
        System.out.println( Arrays.toString( array2 ) );
        // 3. [요소값호출] 배열의 요소의 자료 호출
        System.out.println( array1[0] );    // 1
        System.out.println( array1[1] );    // 2
        System.out.println( array1[2] );    // 3
        System.out.println( array1[3] );    // 4
        System.out.println( array1[4] );    // 5
        // System.out.println( array1[5] );    // 오류발생 , 왜? 존재하지 않는 인덱스 입니다.
        //4. [요소값수정] 배열 요소의 자료 수정
        array1[0] = 21; // array1 이라는 배열내 첫번째 인덱스 요소에 21를 대입
        array1[1] = 31; // array1 이라는 배열내 두번째 인덱스 요소에 31를 대입
        System.out.println( Arrays.toString( array1 ) );
        //5. [요소삭제 , 요소값삭제 ] 배열에 지원하지 않는 기능
        //6. 주의할점 : 선언된 배열 타입과 맞지 않는 자료는 대입이 불가능하다.  단. 캐스팅(타입변환)가능
        //array1[2] = "유재석";오류발생 , 왜?? array1 배열은 int 타입 이므로 int 만 대입 가능하다.

    }
}
