package Self_Practice;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight;
        System.out.print("체중을 입력하세요(Kg단위) : ");
        weight = input.nextInt();

        int tall;
        System.out.print("신장을 입력하세요 (cm단위) : ");
        tall = input.nextInt();

        double BMI;
        double mTall;
        mTall = (double) (tall / 100.0); // 이미 double로 나누었으므로 (double는 삭제해도 괜찮음)
        BMI = (double) (weight / (mTall * mTall)); // 여기도 마찬가지

        if (BMI < 18.5) {
            System.out.printf("당신의 BMI는 %.2f 이며, '저체중'입니다", BMI);
        } else if (BMI >= 18.5 && BMI < 23) { //BMI < 23으로도 충분
            System.out.printf("당신의 BMI는 %.2f 이며, '정상'입니다", BMI);
        } else if (BMI >= 23 && BMI < 25) { // BMI < 25로도 충분
            System.out.printf("당신의 BMI는 %.2f 이며, '과체중'입니다", BMI);
        } else {
            System.out.printf("당신의 BMI는 %.2f 이며, '비만'입니다", BMI);
        }
    }
}
