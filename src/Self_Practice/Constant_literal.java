package Self_Practice;

public class Constant_literal {
    public static void main(String[] args) {
        // 상수(Constant) : 변하지 않는 값 Final로 선언
        final double PI = 3.14;
        final int Max_NUM = 100;
        final int Min_NUM;

        Min_NUM = 0;

        System.out.println(Max_NUM);
        System.out.println(Min_NUM);
       // Max_NUM = 1000; 상수 값을 변경할 수 없으므로 오류 발생
       // 상수는 PG내부에서 반복적으로 사용하고 변하지 않아야하는 값을 선언할 때 사용

       // Literal : 프로그램에서 사용하는 모든 숫자, 문자, 논리값
       // 리터럴은 변수나 상숫값으로 대입할 수 있디
       char ch = 'A'
       int num = 10;
       final double PI = 3.14;
        // 'A', 1-, 3.14같은 값을 리터럴 또는 리터럴 상수라고 한다. 리터럴은 프로그램이 시작할 때 시스템에 같이 로딩되이 특정 메모리 공간인
        // 상수 풀에서 놓는다.
    }
}
