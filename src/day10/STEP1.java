package day10; // - 현재 클래스가 위치한 패키지명

/*
    [1] 클래스를 만드는 방법
    방법1] 패키지 오른쪽클릭->new -> java class -> .java파일 생성
    방법2] 기존의 .java파일에서 여러개 클래스를 선언해도 된다.
        #하나의 java파일의 여러개 클래스를 정의할수 있다. - 비권장 : 유지보수 힘들다.
    [2] 클래스 사용처
        1] 객체의 설계도 클래스  : 객체의 속성 과 행위를 정의한 클래스 의미한다.
        2] 실행 클래스 : main 갖고 있는 클래스 의미한다. - 프로그램 1개당 main함수는 항상 1개이다.
    [3] 클래스 구성멤버
        1] 멤버변수/필드/속성(특성) : 객체가 가질수 있는 객체의 고유한속성/특성의 저장하고 있는 객체내 변수 ( vs 일반 변수 )
        2] 생성자 : 객체를 생성할때 멤버변수에 값을 초기화(처음에 값을 대입하는 과정) 하는 메소드
        3] 메소드/멤버함수 : 객체가 호출 할수 있는 코드집합 # 코드집합에 매개변수(인자값) 넣고 코드를 실행(처리) 하고 결과(반환값)를 받을수 있는 구조
            - 생활속 예시 :  '바나나'(인자값) ---->(매개변수=과일) 믹서기( 처리-갈기) ---> 바나나 주스(결과)
    [4] this : 현재 메소드/생성자를 호출하는 객체 식별
        1. 객체내 멤버변수와 메소드/생성자의 매개변수 이름이 동일했을때 멤벼변수 식별이 불가능하다.
            - 멤버변수 와 메소드의 매개변수 가 동일하지 않으면 this 안써도 된다.
        2. 해결방안] this.멤버변수 : this 키워드를 이용한 객체내 멤버변수를 출력하기.

*/
class Person{ // class start
    // - 클래스 구성멤버
    // 1. 멤버변수/필드
    String name ; // 사람의 이름 속성
    String phone ; // 사람의 연락처 속성
    int age; // 사람의 나이 속성

    // 2. 생성자 :
    // 반환이 없는 메소드와 비슷하다.
    // 생성자를 만드는 방법
    // 1. 생성자명은 무조건 클래스명과 동일하다.
    // 2. 생성자가 1개도 없을 경우 에는 기본생성자가 자동으로 할당된다.
    // 3. 생성자가 1개 이상이면 기본생성자는 직접 정의해야 한다.
    // 4. 리턴은 없지만 매개변수는 존재한다.
    // 5. 오버로딩 : 동일한 이름으로 메소드과 생성자 명을 만들수 없다.
    //  - 오버로딩이란? 메소드/생성자에서 메소드명/생성자 명이 중복 되더라도
    //               매개변수의 개수,순서,타입 에 따라 여러개 선언할수있다.

    Person( ){ } // [1] 기본생성자 정의하기

    Person( String newName ) { // [2] 매개변수가 1개인 생성자를 정의하기
        this.name = newName;
    }
    // Person( String newPhone) {} // 오버로딩을 적용되지 않는다. : 매개변수의 개수,순서,타입이 다를경우 적용.
    // # [3] 매개변수를 2개 갖는 생성자
    Person( String newName ,String newPhone){
        // # 매개변수와 멤버변수의 이름 충돌이 없다. this생략가능
        name  = newName;
        phone = newPhone;
    }
    // #[4] 매개변수를  N개 갖는 생성자
    Person( String name , String phone , int age ){
        // # 매개변수 와 멤버변수의 이름 충돌이 있다. // # this를 이용한 멤버변수를 식별한다.
        this.name = name;
        this.phone = phone;
        this.age = age ;
    }
    Person( int age , String phone , String name ){ } // 오버로딩이 적용되었다. : 매개변수의 개수,순서,타입이 다를경우 적용,

    // 3. 메소드

} // class end











public class STEP1 { // class star // t
    public static void main(String[] args) { // main s

        // [1] 기본 생성자를 이용한 객체 생성/만들기
        Person p1 = new Person(); // 객체상태예상={ name=null , phone=null , age=0 }
        System.out.println("p1 = " + p1);

        // [2] 매개변수 1개인 생성자를 이용한 객체 생성/만들기
        Person p2 =  new Person("유재석"); // 객체상태예상 = { name="유재석" , phone=null , age = 0 }
        System.out.println("p2 = " + p2);

        // [3] 매개변수 2개인 생성자를 이용한 객체 생성/만들기
         Person p3 = new Person( "신동엽" , "01012341234");
        // 객체상태예상 = { name="신동엽" , "phone=01012341234" , age = 0 }
        System.out.println("p3 = " + p3);

         // [4] 매개변수 3개인 생성자를 이용한 객체 생성/만들기
        Person p4 = new Person( "강호동" , "22-2222-2222" , 50);
        System.out.println("p4 = " + p4.name );

        // - 참고
        // - 클래스가 몇개 인가요? 1개
        // - 객체는 몇개 인가요? 4개 ( new 개수만큼 )
        // - 클래스내 name 변수 정의는 1개
        // - 전체 객체의 name 변수 개수는 4개 ( 각 객체마다 name,phone,age) 할당
        // - 왜?? 객체는 독립적인 구조인가? 붕어빵틀 왜 사용해? 미리 정해진 틀/설계에 따라 빠르게 붕어빵을 만들기위해
            // - 클래스(설계도) 기반으로 서로 다른 형태물을 대량 생산이 가능하다.
        /*
                                                ----> new Person()
                Person 클래스                             { name=null , phone=null , age=0 }
                    - name
                    - phone                      ----> new Person()
                    - age                                    { name="유재석" , phone=null , age = 0 }
                                                ----> new Person()
                                                         { name="신동엽" , "phone=01012341234" , age = 0 }
                                                ----> new Person()
                                                         { name="강호동" , "phone=22-2222-2222" , age = 50 }
         */

    } // main e
} // class end










