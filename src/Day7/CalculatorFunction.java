//package Day7;
//
//import java.util.Scanner;
//
//public class CalculatorFunction {
//    public static void main(String[] args) {
//        while (true) {
//            printMenu();
//            System.out.println("메뉴선택 : ");
//            Scanner sc = new Scanner(System.in);
//            int select = sc.nextInt();
//            switch (select) {
//                case 1:
//                    //윤년계산기 함수 호출
//                    leapYear();
//                    break;
//                case 2: //bmi함수 호출
//                    bmiCalculation();
//                    break;
//                case 0:
//                    System.out.println("프로그램을 종료합니다");
//                    return;
//            }
//        }
//    }
//
//    /*
//     * 메뉴를 보여주는 메서드
//     * */
//    public static void printMenu() {
//        System.out.println("다기능 계산기");
//        System.out.println("1. 윤년 계산기");
//        System.out.println("2. BMI 계산기");
//        newMethod();
//    }
//
//    public static void leapYear() {
//        System.out.print("연도를 입력하세요: ");
//        int year = sc.nextDouble();
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
//            System.out.println(year + "년은 윤년입니다.");
//        else
//            System.out.println(year + "년은 윤년이 아닙니다.");
//    }
//
//    public static void bmiCalculation() {
//        System.out.print("키(cm): ");
//        double height = sc.nextInt();
//        System.out.print("몸무게(kg): ");
//        double weight = sc.nextDouble();
//        double bmi = weight / Math.pow(height / 100, 2);
//        System.out.printf("BMI: %.2f\n", bmi);
//    }
//}
