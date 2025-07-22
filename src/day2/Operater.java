package day2;

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
        * 5. 논리연산자 : and or
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

        double avgScore = totalScore / (float)2;
        System.out.println(avgScore);
        System.out.println(5*3);
        System.out.println(5-3);
        System.out.println(5%2);

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
        System.out.println(1>3); // 1이 3보다 큰가 false
        System.out.println(1<3); // 1이 3보다 작은가 true
        System.out.println(1>=3); // 1이 3보다 크거나 같은가 false
        System.out.println(1<=3); // 1이 3보다 작거나 같은가 true
        System.out.println(1==3); // 1이 3과 같냐 false
        System.out.println(1!=3); // 1이 3과 다르냐 true

    }
}
