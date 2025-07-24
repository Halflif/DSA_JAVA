package day3;

import java.util.Scanner;

public class Practice3A {
    public static void main(String[] args) {
        // 금액을 입력받아 최소 화폐 개수를 구한다
        /*
         * 금액 : 67340
         * 5만원 : 1
         * 1만원 : 1
         * 5천원 : 1
         * 천원 : 2
         * 500원 : 0
         * 100원 : 3
         * 50원 : 0
         * 10원 : 4
         * 67340원은 총 12개 필요
         * */
        Scanner input = new Scanner(System.in);
        int m5, m1, c5, c1, b5, b1, s5, s1, count;
        System.out.print("금액 : ");
        int value = input.nextInt();
        int innitialValue = input.nextInt();
        count = 0;

        //5만원권 계산
        m5 = value / 50000;
        count += m5;
        value %= 50000;

        //만원권 게산
        m1 =  value / 10000;
        count += m1;
        value %= 10000;

        //오천원권 계산
        c5 = value / 5000;
        count += c5;
        value %= 5000;

        //천원권 게산
        c1 = value / 1000;
        count += c1;
        value %= 1000;

        //오백원 게산
        b5 = value / 500;
        count += b5;
        value %= 500;

        //백원권 계산
        b1 = value / 100;
        count += b1;
        value %= 100;

        //50원 게산
        s5 = value / 50;
        count += s5;
        value %= 50;

        //10원 게산
        s1 = value / 10;
        count += s1;
        value %= 10;


        System.out.printf("%d %d %d %d %d %d %d %d", m5, m1, c5, c1, b5, b1, s5, s1);
        System.out.printf("%d원은 총 %d개 입니다.", value, count);
    }
}
