package Day6;

import java.util.Scanner;

public class LoopPractice02 {
    public static void main(String[] args) {
        // 두 정수를 입력받아 시작~끝 값의 합 구하기
        // 시작 숫자가 2번째 숫자보다 클 경우에도 구하기

        //변수 4개를 사용하여 하는 경우
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int n1 = s.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int n2 = s.nextInt();
        int sum = 0;
        int start, end;
        if (n1 < n2) {
            start = n1;
            end = n2;
        } else {
            start = n2;
            end = n1;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.printf("%d부터 %d까지의 합은 %d입니다.%n", start, end, sum);
    }
}