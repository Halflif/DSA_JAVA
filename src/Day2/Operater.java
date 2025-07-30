package Day2;

public class Operater {
    public static void main(String[] args) {
        // Operater = 연산자 연산에 사용되는 기호
        // 항 : 연산에 사용하는 값

        // 연산자의 종류
        /*
         * 1. 대입연산자 : 오른쪽 항에 있는 값을 왼쪽 항에 대입 왼쪽에는 변수나 상수가 와야 한다 =
         * 1-1 복합대입 연산자 :
         * 2. 사칙연산 : 산술연산자와 나머지 연산(+, -, *, /, %)
         * 3. 증감연산자 : 증가 연산자와 감소 연산자가 존재한다
         * 3-1. 증감연산자는 단항 연산자이다 ++, --
         * 4. 관계연산자 : 오른쪽 항과 왼쪽항을 비교하는 연산자
         * 5. 논리연산자 : and(&&) or(||) not(!)
         * 6. 비트연산자 :
         * 7. 조건연산자(삼향연산자) :
         * 8. 인스턴스 연산자 :
         * 9. 항변환 연산자 :
         * */

        // 산술연산자
        int mathScore = 50;
        int englishScore = 61;

        int totalScore = mathScore + englishScore;
        System.out.println(totalScore);

        double avgScore = totalScore / (float) 2;
        System.out.println(avgScore);
        System.out.println(5 * 3);
        System.out.println(5 - 3);
        System.out.println(5 % 2);

        System.out.println("증감연산자");
        // 증감연산자 -- 증감 연산자는 해당 값 자체가 변경이 된다
        int gameScore = 150;
        int lastScore = ++gameScore;
        System.out.println(lastScore);
        System.out.println(gameScore);
        System.out.println(++lastScore); // 연산이 된 후의 값이 출력된다
        System.out.println(lastScore++); // 연산 되기 전의 값이 출력된다
        System.out.println(lastScore); // 즉, 연산자의 위치에 따라 출력되는 값이 달라진다
        System.out.println(--lastScore);
        System.out.println(lastScore--);

        // 관계연산자 (논리값을 반환하는 연산자)
        System.out.println(1 > 3); // 1이 3보다 큰가 false
        System.out.println(1 < 3); // 1이 3보다 작은가 true
        System.out.println(1 >= 3); // 1이 3보다 크거나 같은가 false
        System.out.println(1 <= 3); // 1이 3보다 작거나 같은가 true
        System.out.println(1 == 3); // 1이 3과 같냐 false
        System.out.println(1 != 3); // 1이 3과 다르냐 true

        System.out.println("--------------day3");
        // 논리연산자
        // and(&&) 연산자 = 논리곱 : 둘 다 참일때 참
        // or(||) 연산자 = 논리합 : 둘 중에 하나라도 참이면 참
        // not(!) 연산자 = 부정 : 단항 연산자이며 논리형 값을 반대의 값으로 바꿈
        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag);  //true
        flag = (num1 > 0) && (num2 < 0);
        System.out.println(flag);      //false
        flag = (num1 > 0) || (num2 < 0);
        System.out.println(flag);      //true
        flag = (num1 < 0) || (num2 < 0);
        System.out.println(flag);      //false
        System.out.println(!flag);     //true -- not연산자는 일시적으로 그 값을 출력하는 것이지 값을 변경하지는 않는다
        System.out.println(flag);      //true

        System.out.println("-------------------------------------------");
        // 단락 회로 평가 77p
        // &&연산자에서 두 값이 거짓이면 뒤의 항은 실행되지 않고 앞의 항만 실행된다
        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 2);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 출력값이 4이면 78행의 우항이 실행되었다는 뜻이지만 실행이 되지 않았으므로 2가 출력됨
        System.out.println("================================================"); // crt+alt+l은 코드가 이쁘게 바뀜

        int result1 = num1 + 10;
        int result2 = i + 2;
        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 2);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        System.out.println("---------------------------------------------");
        // 조건연산자(삼향연산자) ? -- 조건에 따라 값을 다르게 반환한다
        // 조건문 ? 참일때 : 거짓일때 ?앞의 조건문이 참일때는 :의 앞을 거짓일때는 :의 뒤를 반환한다
        System.out.println((5 > 3) ? 10 : 20);
        int fatherAge = 45;
        int motherAge = 47;
        String result;
        result = (fatherAge > motherAge) ? "아버지 나이가 어머니 나이보다 많습니다" : "아버지 나이가 어머니 나이보다 적습니다";
        System.out.println(result);

        // 복합대입연산자
        // 연산자의 좌항에서 우항의 값을 ~~~해서 좌항에 대입합니다
        System.out.println(i);
        i = i + 2;
        System.out.println(i);
        i += 2;
        System.out.println(i);
        System.out.println("=================");
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 2;
        System.out.println(num1);
        num1 /= 10; // 나눗셈의 몫
        System.out.println(num1);
        num1 %= 2; // 나눗셈의 나머지
        System.out.println(num1);


    }
}
