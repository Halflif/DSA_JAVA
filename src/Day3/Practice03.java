package Day3;

import java.util.Scanner;

public class Practice03 {
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

        // 입력받을 준비하기
        Scanner input = new Scanner(System.in);

        // 변수를 설정하기,
        int totalMoney, n1, n2, n3, n4, n5, n6, n7, n8, n9;
        System.out.print("금액 :");
        totalMoney = input.nextInt();
        // 계산해서 적용하기
        n1 = (totalMoney / 50000);
        System.out.printf("5만원 : %d%n", n1);
        n2 = (totalMoney % 50000) / 10000;
        System.out.printf("1만원 : %d%n", n2);
        n3 = ((totalMoney % 50000) % 10000) / 5000;
        System.out.printf("5천원 : %d%n", n3);
        n4 = (((totalMoney % 50000) % 10000) % 5000) / 1000;
        System.out.printf("천원 : %d%n", n4);
        n5 = (((totalMoney % 50000) % 10000) % 5000) % 1000 / 500;
        System.out.printf("500원 : %d%n", n5);
        n6 = ((((totalMoney % 50000) % 10000) % 5000) % 1000 % 500) / 100;
        System.out.printf("100원 : %d%n", n6);
        n7 = (((((totalMoney % 50000) % 10000) % 5000) % 1000 % 500) % 100) / 50;
        System.out.printf("50원 : %d%n", n7);
        n8 = ((((((totalMoney % 50000) % 10000) % 5000) % 1000 % 500) % 100) % 50) / 10;
        System.out.printf("10원 : %d%n", n8);
        n9 = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;
        System.out.printf("%d원은 총 %d개 필요", totalMoney, n9);
    }
}
