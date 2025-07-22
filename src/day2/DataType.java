package day2;

public class DataType {
    // 데이터를 저장하는 공간의 크기는 바이트 단위로 말한다
    // 변수를 선언할 때 데이터 타입을 정해야 한다
    /*
     * 기본 자료형
     * 정수형 : byte(1) short(2) int(4) long(8)
     * 문자형 : char(2)
     * 실수형 : float(4) double(8)
     * 논리형 : boolean(1)
     * 각 자료형은 담을 수 있는 데이터의 크기가 다르다. 데이터가 넘치면 오류가 난다
     *
     * 참조 자료형(...은 나중에)
     * 문자열을 저장하는 String > 참조자료에 속함
     * 값을 저장하는 방식과 그 값에 접근하는 방식에서 차이가 난다
     * 참조 자료형은 실제 데이터는 다른곳에 있고 그 위치가 어디인지를 변수에 저장하는 방식
     * */

    public static void main(String[] args) {
        // 정수형
        byte bVal = 20;
       //  byte overByteVal = 128 // 컴파일 오류 int 만큼 큰 값인데 bye를 씀
        int iVal = 40;
        short sVal = 30;
        System.out.println(bVal+sVal+iVal);

        long lVal = 1234567890L;

        // 문자형
        // 문자를 변수에 대입하면 문자 그대로 저장되는 것이 아니라 그 숫자에
        // 해당하는 정수값(ASCII)이 저장됨
        char ch1 = 'A';
        // char ch1 = "A"; 문자역 작성 시 작은 따옴표로 사용
        System.out.println(ch1);
        System.out.println((int)ch1); // 강제 형변환
        char ch2 = 77;
        System.out.println(ch2);
        System.out.println((int)ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        char ch4 = '한';
        char ch5 = '\uD55c';
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println((int)ch4);  // 54620

 //       char ch6 = -65;  //char(문자형)에는 음수값이 대입되면 오류

       // 논리형
        boolean isStudent = true;
        System.out.println(isStudent);
//      System.out.println((int)isStudent); 논리형은 정수 형으로 형태변환을 할 수 없다

        // 실수형
        double dNum = 3.14D;       // 알파벳 필수 아님
        float fNum = 3.14F;        // 알파벳 F가 필수적으로 들어가야함 but 소문자 f도 가능은 함
        System.out.println(dNum);
        System.out.println(fNum);

        System.out.println(0.1+0.2);    // 0과 1로 소주점 아래의 숫자를 정확하게 표현할 수 없기 때문에 연산 결과에 오차가 생긴다
        // 컴퓨터의 2진수와 현실의 10진수 각 표현방식의 차이로 인해 표현 가능한 값의 차이가 생기기 때문

        // 참조자료형 맛보기
        String s1 = "hello";
        System.out.println(s1);

    }
}






