package Self_Practice;

public class Data_Type_Practice {
    public static void main(String[] args) {
        System.out.println("==교제 49p 연습 숫자 더하기");
        short sVal = 10;
        byte bVal = 20;
        System.out.println(sVal+bVal);  // short와 byte의 덧셈확인
        System.out.println("==교제 52p 문자형 연습");
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); //ch1에 해당하는 값을 정숫값(ASCII)로 출력
        char ch2 = 66; //char에 정숫값 대입
        System.out.println(ch2); // 정숫값에 해당하는 문자를 출력
        int ch3 = 67;
        System.out.println(ch3); // 정수값 출력
        System.out.println((char)ch3); // 정숫값에 해당하는 문자 출력

        System.out.println("==교제 53p 문자형 연습 : 유니코드 활용");
        char uch1 = '한';
        char uch2 = '\uD55C';
        System.out.println(uch1);
        System.out.println(uch2);

        System.out.println("==문자형 연습 : 음수 오류 확인");
        int a = 65;
        int b = -65;
        char a2 = 65;
        // char b2 = -65; 문자열에는 음수가 들어갈 수 없어 오류가 나므로 주석처리 해야한다
        System.out.println(a);
        System.out.println(b);
        System.out.println(a2);

        System.out.println("==교제 55p 실수형 변수 선언");
        double dNum = 3.14;
        float fNum = 3.14F; // flaoat를 사용시에는 숫자 뒤에 F를 사용하여 이 숫자가 float의 형태인 것을 식별해주서야 한다
        System.out.println(dNum);
        System.out.println(fNum);

        System.out.println("==교제 56p 부동소숫점 오류");
        double d_Num = 1;
        for (int i = 0; i < 1000; i++) // for 반복문 i = 0 시작 조건 : i<1000 일 때 반복 증감 i++ -> i를 1씩 증가시킴
                                       // 즉 i는 0부터 시작해서 1씩 숫자가 상승해 1000이되면 반복을 멈추게 됨
        {d_Num = d_Num + 0.1;}
        System.out.println(d_Num);

        System.out.println("==교제 57p 논리형 변수 선언");
        boolean isMarried = true;
        System.out.println(isMarried);

        System.out.println("==교제 58p var를 사용하여 변수 선언하기");
        // 지역 변수 자료형 추론(local variable type inference) : 자료형을 명확하게 지정하지 않아도 변수를 사용할 수 있음
        var i = 10; // int i = 10으로 컴파일
        var j = 10.0; // double j = 10.0으로 컴파일
        var str = "Hello"; // String str = "Hello"로 컴파일

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        System.out.println(str);

    }
}
