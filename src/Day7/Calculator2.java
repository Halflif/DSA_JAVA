package Day7;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("1. 윤년 계산기");
            System.out.println("2. BMI 계산기");
            System.out.println("3. 사칙연산 계산기");
            System.out.println("4. 구구단 출력");
            System.out.println("5. 누산값 계산기");
            System.out.println("6. 숫자 사이의 합 계산기");
            System.out.println("0. 종료하기");
            System.out.print("메뉴를 선택하세요: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // 윤년 계산기
                    System.out.print("연도를 입력하세요: ");
                    int year = sc.nextInt();
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        System.out.println(year + "년은 윤년입니다.");
                    else
                        System.out.println(year + "년은 윤년이 아닙니다.");
                    break;
                case 2: // BMI 계산기
                    System.out.print("키(cm): ");
                    double height = sc.nextDouble();
                    System.out.print("몸무게(kg): ");
                    double weight = sc.nextDouble();
                    double bmi = weight / Math.pow(height / 100, 2);
                    System.out.printf("BMI: %.2f\n", bmi);
                    break;
                case 3: // 사칙연산 계산기
                    System.out.print("첫 번째 숫자: ");
                    double num1 = sc.nextDouble();
                    System.out.print("두 번째 숫자: ");
                    double num2 = sc.nextDouble();
                    System.out.print("연산자 (+, -, *, /): ");
                    char op = sc.next().charAt(0);
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
                            if (num2 != 0)
                                System.out.println("결과: " + (num1 / num2));
                            else
                                System.out.println("0으로 나눌 수 없습니다.");
                            break;
                        default:
                            System.out.println("올바른 연산자를 입력하세요.");
                    }
                    break;
                case 4: // 구구단 출력
                    System.out.print("출력할 단 입력: ");
                    int dan = sc.nextInt();
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(dan + " x " + i + " = " + (dan * i));
                    }
                    break;
                case 5: // 누산값 계산기
                    int sum = 0;
                    System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다.");
                    while (true) {
                        int val = sc.nextInt();
                        if (val == 0) break;
                        sum += val;
                        System.out.println("현재 누적 값: " + sum);
                    }
                    break;
                case 6: // x~y계산하기
                    int total = 0;
                    int n3;
                    System.out.print("첫번째 숫자를 입력하세요");
                    int n1 = sc.nextInt();
                    System.out.print("두번째 숫자를 입력하세요");
                    int n2 = sc.nextInt();
                    if (n1 > n2) {
                        n3 = n1;
                        n1 = n2;
                        n2 = n3;
                    }
                    for (int i = n1; i <= n2; i++) {
                        total += i;
                    }
                    System.out.printf("%d부터 %d까지의 합은 %d입니다.", n1, n2, total);
                    break;
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 메뉴 번호입니다. 다시 선택해주세요.");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
