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
        mTall = (double)(tall/100.0);
        BMI = (double)(weight/(mTall*mTall));

        if (BMI<18.5) {
            System.out.printf("당신의 BMI는 %.1f 이며, '저체중'입니다",BMI);
        } else if (BMI>18.5 && BMI<23  ) {
            System.out.printf("당신의 BMI는 %.1f 이며, '정상'입니다",BMI);
        } else if(BMI>=23 && BMI < 25){
            System.out.printf("당신의 BMI는 %.1f 이며, '과체중'입니다",BMI);
        } else {
            System.out.printf("당신의 BMI는 %.1f 이며, '비만'입니다",BMI);
        }
    }
}
