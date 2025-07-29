package Self_Practice;

public class nomar_operator {
    public static void main(String[] args) {
        // 연산자의 종류
        // 다항연산자 => 항이 1개인 연산자 ex) ++num
        // 이항 연산자 => 항이 두 개인 연산자 ex) num1 + num2
        // 심힝 연신자 => 항이 3개인 연산자 ex) (5>3) ? 1 : 0
        // 연산자의 우선 순위 : 단항연산자 > 이항연산자 > 삼항 연산자

        System.out.println("대입 연산자");
        // 변수에 값을 대입하는 연산자
        // 모든 연산을 다 끝낸후 결과를 변수에 대입하는 것이므로 우선순위가 가장 낮음
        // 대입연산자의 종류 : =
        int age = 24;

        System.out.println("부호연산자");
        // 부호연산자는 이항 연산자이며 부호를 나타내는 단항연산자로도 쓰임
        // 부호 연산자의 종류
        // + => 변수나 상숫값을 양수로 만듦 ex) +3
        // - => 변수나 상숫값을 음수로 만듦 ex) -3
        // 변수에 -를 사용한다고 해서 값 자체가 음수로 바뀌는 것은 아님
        int num = 10;
        System.out.println(+num);  //값 10이 그대로 출력
        System.out.println(-num);  //값 10에 -가 붙어서 -10이 출력되지만 num값이 실제로 바뀌지 않음
        System.out.println(num);   // 값 10이 그래도 출력됨

        num = -num; // num값을 음수로 바꿔서 다시 num에 대입함
        System.out.println(num); // 값 -10이 출력됨

        System.out.println("산술연산자");
        // 사칙연산에서 사용되는 연산자
        // 사칙연산자의 종류
        // + 두 항을 더한다 - 앞에 있는 항에서 뒤에 있는 항을 뺀다
        // * 두 항을 곱한다
        // / 앞에 있는 항에서 뒤에 있는 항을 나누어 몫을 구한다
        // % 앞에 있는 항에서 뒤에있는 항을 나누너 나머지를 구한다

        // 산술연산자의 우선순위
        // 곱하기 나누기가 먼저 실행되고 덧셈 뺄셈이 진행된다
        // 산술연산자를 이용하여 총점과 평균 구하기
        int mathScore = 90;
        int engScore = 70;
        int totalScore = mathScore + engScore; // 총점 구하기
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0;  // 평균구하기
        System.out.println(avgScore);
    }
}
