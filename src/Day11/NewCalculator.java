package Day11;

import java.util.Scanner;

public class NewCalculator {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    // 메뉴 호출
    public static void menu() {
        int choice;

        while (true) {
            System.out.println("1. 윤년 계산기");
            System.out.println("2. BMI 계산기");
            System.out.println("3. 사칙연산 계산기");
            System.out.println("4. 구구단 출력");
            System.out.println("5. 누산값 계산기");
            System.out.println("6. 숫자 사이의 합 계산기");
            System.out.println("7. 성적 계산기");
            System.out.println("0. 종료하기");
            System.out.print("메뉴를 선택하세요: ");
            choice = sc.nextInt();
            select(choice, sc);

            System.out.println();
        }
    }

    // 계산기 호출
    public static void select(int choice, Scanner sc) {
        switch (choice) {
            case 1: // 윤년 계산기
                printYearCal();
                break;
            case 2: // BMI 계산기
                printBMI();
                break;
            case 3: // 사칙연산 계산기
                printNormalCal();
                break;
            case 4: // 구구단 출력
                printXo();
                break;
            case 5: // 누산값 계산기
                printFlow();
                break;
            case 6: // x~y계산하기
                printXyCal();
                break;
            case 7:
                printGradeCal();
                Student.resetSerial();
                break;
            case 0:
                System.out.println("계산기를 종료합니다.");
                sc.close();
                System.exit(0);
                return;
            default:
                System.out.println("잘못된 메뉴 번호입니다. 다시 선택해주세요.");
        }
    }

    // 윤년 계산기
    public static void printYearCal() {
        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + "년은 윤년입니다.");
        else
            System.out.println(year + "년은 윤년이 아닙니다.");
    }

    // BMI계산기
    public static void printBMI() {
        System.out.print("키(cm): ");
        double height = sc.nextDouble();
        System.out.print("몸무게(kg): ");
        double weight = sc.nextDouble();
        double bmi = weight / Math.pow(height / 100, 2);
        System.out.printf("BMI: %.2f\n", bmi);
    }

    // 사칙연산 계산기
    public static void printNormalCal() {
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

    // 구구단 게산기
    public static void printXo() {
        System.out.print("출력할 단 입력: ");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }

    // 누산값 계산기
    public static void printFlow() {
        int sum = 0;
        System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다.");
        while (true) {
            int val = sc.nextInt();
            if (val == 0) break;
            sum += val;
            System.out.println("현재 누적 값: " + sum);
        }
    }

    // 숫자 사이의 합 구하기
    public static void printXyCal() {
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
    }

    // 성적 계산기
    public static void printGradeCal() {
        Student[] students = new Student[3];
        sc.nextLine();
        for (int i7 = 0; i7 < students.length; i7++) {
            System.out.printf("%d번째 학생의 이름을 입력해주세요", i7 + 1);
            String name = sc.nextLine();
            System.out.print("국어성적 : ");
            int Korean = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
            System.out.print("영어성적 : ");
            int english = sc.nextInt();
            sc.nextLine();
            System.out.print("수학성적 : ");
            int math = sc.nextInt();
            sc.nextLine();
            students[i7] = new Student(name, Korean, english, math);
        }

        System.out.println("성적결과출력==========");
        for (int i8 = 0; i8 < students.length; i8++) {
            Student student = students[i8];
            student.printResult();
        }
        ModifyGrade(students);

    }

    // 성적 계산기 오입력 수정
    public static void ModifyGrade(Student[] students) {
        System.out.println("성적을 수정하시겠습니까?");
        System.out.println("1. 예");
        System.out.println("2. 아니요");
        System.out.print("선택: ");
        int answer = sc.nextInt();
        sc.nextLine();
        if (answer == 1) {
            System.out.println("학생목록(학번과 이름)");
            for (int i8 = 0; i8 < students.length; i8++) {
                Student student = students[i8];
                student.printNUM();
            }
            System.out.println("수정할 학생의 학번을 입력해주세요");
            int targetID = sc.nextInt();
            sc.nextLine();
            Student target = null;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getStudentID() == targetID) {
                    target = students[i];
                    break;
                }
            }
            editGrade(target);
        } else {
            System.out.println("해당 학번의 학생은 존재하지 않습니다.");
        }
    }

    //학생 정보 수정 값 받기
    public static void editGrade(Student target) {
        if (target != null) {
            System.out.println("수정할 학생의 정보를 선택해주세요");
            System.out.println("1. 이름");
            System.out.println("2. 국어성적");
            System.out.println("3. 영어성적");
            System.out.println("4. 수학성적");
            int Modify = sc.nextInt();
            sc.nextLine();
            switch (Modify) {
                case 1:
                    System.out.print("새 이름: ");
                    String newName = sc.nextLine();
                    target.setName(newName);
                    break;
                case 2:
                    System.out.print("새 국어성적: ");
                    int newKor = sc.nextInt();
                    sc.nextLine();
                    target.setKorean(newKor);
                    break;
                case 3:
                    System.out.print("새 영어성적: ");
                    int newEng = sc.nextInt();
                    sc.nextLine();
                    target.setEnglish(newEng);
                    break;
                case 4:
                    System.out.print("새 수학성적: ");
                    int newMath = sc.nextInt();
                    sc.nextLine();
                    target.setMath(newMath);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
            System.out.print("수정된 학생 정보 : ");
            target.printResult();
        }
    }
}

