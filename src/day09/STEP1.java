package day09;

import java.sql.SQLOutput;

// (2) 실행클래스( main함수 갖는 )
public class STEP1 {
    public static void main(String[] args) {

        // 1. 객체 만들기
            // 1. new : 객체(인스턴스)를 물리적으로 생성해주는 키워드(연산자)
            // 2. 클래스명 작성 : 객체를 만들고자하는 설계도인 클래스 선택한다.
            // 3. ( ) : 객체 생성시 초기(처음값 설정)화 할수 있는 생성자
        new Person(); // [1] 객체 1개
        new Person(); // [2] 객체 2개
        new Person(); // [3] 객체 3개

        // 2. 객체를 만들고 주로 변수에 담아둔다(참조한다.)
            // 왜? 객체(주소)를 변수에 담아두나요? 왜 변수를 쓰나요?
            // 1. 변수의 타입 작성 : 변수가 가지는 객체의 클래스를 작성한다.
            // 2. 변수명 작성 : 아무거나.
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // - 이해 돕기
        System.out.println( 3+3 ); // 연산을 바로 출력 가능.
        int value1 = 3+3; // 연산을 변수(담을 자료의 타입 적절하게 선택) 에 담아서 출력해도 된다.
        System.out.println( value1 );

        System.out.println( new Person() ); // 객체를 바로 출력 가능
        Person value2 = new Person(); // 객체를 변수(담을 객체의 타입[클래스] 정확하게 선택) 에 담아서 출력해도 된다.
        System.out.println( value2 );

        // - 객체의 활용
        // (1) Pserson 클래스(설계도) 로 객체1개 만들기
        // new Person(); // 1. 객체 생성
        Person person1 = new Person();// 2. 객체(위치주소)를 변수에 저장한다.(참조한다)
        System.out.println( person1 ); // ?? 변수에 뭐가 들어 있나요? 객체가 저장된 16진수 가상메모리 위치주소 # day09.Person@4eec7777
        // (2) 객체내 필드의 값 호출
        System.out.println( person1.name ); // 3. 객체의 필드를 호출/접근 한다. # 객체변수명.필드명 # null
        // . : 접근연산자 또는 도트연산자 란? 변수가 참조 하고 있는 객체내 필드 와 메소드에 접근/호출 할수 있도록 접근하는 연산자
        // (3) 객체내 필드의 값 수정
        person1.name = "유재석";
        person1.age = 40;
        System.out.println( person1.name ); // # 유재석
        System.out.println( person1.age ); // # 40

        // (4) Person 클래스(설계도) 로 객체1개 만들기
        Person person2 = new Person();
        System.out.println( person2 ); // person1 과 person2 가 가지는 주소는 다르다. # day09.Person@3b07d329
        System.out.println( person2.name ); // # null # person1이 가리키는 객체에 name에 '유재석' 대입했기 때문에
        person2.name = "강호동";
        person2.age = 50;
        System.out.println( person2.name ); // # 강호동
        System.out.println( person2.age ); // # 50

        // 실습1 : Person 클래스 를 이용하여 name은 '신동엽' age는 60 를 가지는 객체를 생성하시오.
        // new Person();  // 1. 객체를 만들고자 하는 클래스를 선택하여 new 클래스명();
        Person person3 = new Person();// 2. 객체를 만들고 객체가 위치한 메모리 주소 를 변수에 대입한다. ( 변수가 객체를 참조한다 ) # 참조타입
        // 3. 해당 변수에 저장된 객체 주소 에 참조하여 객체내 필드와 메소드 사용.
        person3.name = "신동엽";
        person3.age = 60;
        System.out.println( person3.name ); // # 신동엽
        System.out.println( person3.age ); // # 60


        // - 메소드란 : 각각의 객체가 함수/이벤트 를 사용할수 있다.
        // person1 age : 40  , person2 age : 50 , person3 age : 60
        // (5) 객체를 이용한 메소드 호출하기
        person1.birthday(); // 생일 이벤트 호출 했기 떄문에 age 가 1씩증가
        System.out.println( person1.age ); // # 41

        // (6) birthday() 메소드를 호출한 객체는 person1 객체이므로 person1의 age만 1증가한다.
        System.out.println( person2.age ); // # 50
        System.out.println( person3.age ); // # 60

    } // main end
} // class end










