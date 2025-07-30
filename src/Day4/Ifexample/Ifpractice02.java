package Day4.Ifexample;

import java.util.Scanner;

public class Ifpractice02 {
    public static void main(String[] args) {
        // 생년과 올해를 입력받으세요
        // 태어난 해가 잫못된 값일 경우 "태어난 해는 올해보다 이전이어야 합니다"
        // 올바른 값일 경우 몇살 출력
        // 문제 2 태어난 해와 올해가 홀수인지 짝수인지
        // "태어난 해가 3의 배수이고, 올해는 5의 배수가 아니다"를 출력하는 조건문을 만드세요

        Scanner input = new Scanner(System.in);
        int dYear = 2025;
        System.out.print("출생연도를 입력하세요 : ");
        int age;
        int n1;
        int n2;
        int birth;
        int n3;
        birth = input.nextInt();
        n1 = (int) (birth % 2);
        n2 = (int) (birth % 3);
        n3 = (int) (birth % 5);
        age = (int) (dYear - birth);
        if (birth > 2025) {
            System.out.println("태어난 해는 올해보다 이전이어야 합니다");
        } else {
            System.out.printf("당신은 올해 %d살 입니다%n", age);
        }
        if (n1 == 0) {
            System.out.printf("당신이 태어난 해는 짝수 입니다%n");
        } else {
            System.out.printf("당신이 태어난 해는 홀수 입니다%n");
        }
        if (n2 == 0 && dYear % 5 != 0) {
            System.out.println("태어난 해가 3의 배수이고, 올해는 5의 배수가 아닙니다");
        }
    }
}
