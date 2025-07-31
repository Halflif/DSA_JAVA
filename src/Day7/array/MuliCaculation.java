package Day7.array;

import java.util.Scanner;

public class MuliCaculation {
    static Scanner sc = new Scanner(System.in);  // 모든 메서드에서 접근 가능

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("메뉴선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    loopyear();
                    break;
                case 2:
                    bmicl();
                    break;
                case 3:
                    cal();
                    break;
                case 4:
                    gu();
                    break;
                case 5:
                    nusan();
                    break;
                case 6:
                    xy();
                    break;
                case 7:
                    Grade();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("======== 메뉴 ========");
        System.out.println("1. 윤년 계산기");
        System.out.println("2. BMI 계산기");
        System.out.println("3. 사칙연산 계산기");
        System.out.println("4. 구구단 출력");
        System.out.println("5. 누산값 계산기");
        System.out.println("6. 숫자 사이의 합 계산기");
        System.out.println("7. 성적 게산기");
        System.out.println("0. 종료하기");
        System.out.println("=====================");
    }

    public static void loopyear() {
        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + "년은 윤년입니다.");
        else
            System.out.println(year + "년은 윤년이 아닙니다.");
    }

    public static void bmicl() {
        System.out.print("키(cm): ");
        double height = sc.nextDouble();
        System.out.print("몸무게(kg): ");
        double weight = sc.nextDouble();
        double bmi = weight / Math.pow(height / 100, 2);
        System.out.printf("BMI: %.2f\n", bmi);
    }

    public static void cal() {
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
    }

    public static void gu() {
        System.out.print("출력할 단 입력: ");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }

    public static void nusan() {
        int sum = 0;
        System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다.");
        while (true) {
            int val = sc.nextInt();
            if (val == 0) break;
            sum += val;
            System.out.println("현재 누적 값: " + sum);
        }
    }

    public static void xy() {
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
        System.out.printf("%d부터 %d까지의 합은 %d입니다.%n", n1, n2, total);
    }

    public static void Grade() {
        Scanner sc = new Scanner(System.in);
        String[] title = {"국어", "영어", "수학"};
        int[] scores = new int[title.length];
        int total = 0;
        char grade = 0;
        for (int i = 0; i < title.length; i++) {
            System.out.printf("%s 점수 입력: ", title[i]);
            scores[i] = sc.nextInt();
            total += scores[i];
            // 과목별 등급 계산
            int score = scores[i];
            if (score >= 90 && score <= 100) grade = 'A';
            else if (score >= 80) grade = 'B';
            else if (score >= 70) grade = 'C';
            else if (score >= 60) grade = 'D';
            else if (score >= 0) grade = 'F';
            else grade = 'X'; // 오류 처리
        }
        double avg = (double) total / title.length;
        System.out.println("\n=== 성적 결과 ===");
        System.out.println("총점: " + total);
        System.out.printf("평균: %.2f\n", avg);
        System.out.println("등급: " + grade);


    }
}


