package day3;

public class OperatorPrecedence { // 연산자 우선순위
    public static void main(String[] args) {
        /*
        * 연산자 우선순위
        * 괄호 -> 단항 -> 이항(산술 -> 비교 -> 관계 -> 논리 -> 대입) -> 삼항
        * 그냥 괄호에 쓰거나 변수에 저장하고 코드 순서에 유의하는것이 더 가독성이 좋다(코드 품질 향상)
        * */

     // 1. 곱셈과 덧셈의 우선순위
        int result1 = 2+(3*4);
        System.out.println("result1=" + result1);
     // 2. 괄호를 사용해 우선순위를 변경
        int result2 = (2+3)*4;
        System.out.println("result2="+result2);
     // 3. 대입 연산자와 산술 연산자의 우선순위 -- 산술연산자 실행 후 대입을 한다
        int a = 10;
        int b = 5;
        a = b + 2;
        System.out.println("a=" + a);
     // 4. 비교연산자와 논리연산자의 우선순위 -- 비교 후 논리 후 대입
        boolean result3 = 5>3 && 2<4;
        System.out.println("result3=" + result3);
    // 5. 우선순위 total
        int result4 = 10-3+2*5/(1+1);
       // (1+1)이 먼저 실행된 후 2*5가 실행 그 후 2*5/(1+1)가 실행 후 10-3+방금 실행한 2*5/(1+1)의 결과값이 실행
       // 10/2 = 5  10-3+5 = 12 따라서 결과값은 12가 나온다
        System.out.println("result4=" + result4);


    } // 메인 메서드 끝
} //클래스 끝
