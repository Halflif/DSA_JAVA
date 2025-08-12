package Day12;

import java.util.Scanner;

public class IfTest41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("정수입력:");
        n = s.nextInt();
        if (n > 0) {
            System.out.println("양수입니다.");
        } else if (n < 0) {
            System.out.println("음수입니다");
        } else {
            System.out.println("0입니다");
        }
        switch (n) {
            case 1 -> System.out.println("1일때 처리");
        }
    }
}
