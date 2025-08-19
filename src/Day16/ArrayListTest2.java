package Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // int형 저장할 수 있는 리스트 생성
        ArrayList<Integer> list = new ArrayList<>();
        // 반복적으로 정수 입력 받아 리스트에 저장
        Scanner s = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("정수를 입력하세요 ");
                System.out.println("종료하고 싶다면 0을 입력하세요");
                int n = s.nextInt();
                list.add(n);
                if (n == 0) {
                    break;
                }
            }
            // 숫자가 아닌 값을 입력하면 반복 종료
        } catch (Exception e) {
            System.out.println("입력오류 : 정수만 입력이 가능합니다.");
        }
        // 전체 입력 받은 숫자들의 평균보다 큰 값들만 출력
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        int avg = sum / list.size();
        System.out.println("입력된 숫자들의 합 : " + sum);
        System.out.println("입력된 숫자들의 평균 : " + avg);
        ArrayList<Integer> GradeList = new ArrayList<>();
        for (Integer num : list) {
            if (num > avg) {
                System.out.printf("평균보다 큰 값들: %d\n ", num);
                GradeList.add(num);
            }
        }
        Collections.sort(GradeList);
        System.out.println("오름차순 정렬된 리스트: " + GradeList);

    }
}



