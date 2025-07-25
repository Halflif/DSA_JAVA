package Self_Practice;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int num1 = input.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = input.nextInt();

        System.out.print("연산 기호를 입력하세요 (+, -, *, /): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("결과: " + (num1 + num2));
                break;
            case '-':
                System.out.println("결과: " + (num1 - num2));
                break;
            case '*':
                System.out.println("결과: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    double result = (double) num1 / num2;
                    System.out.printf("결과: %.2f\n", result);
                }
                break;
            default:
                System.out.println("지원하지 않는 연산입니다.");

    }


    }
}
