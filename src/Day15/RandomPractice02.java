package Day15;

import java.util.Arrays;

public class RandomPractice02 {
    public static void main(String[] args) {
        int n;
        int[] loto = new int[6];

        // 반복문에 이름 붙이는 기능
        out:
        for (int i = 0; i < 6; i++) {
            n = (int) ((Math.random() * 45) + 1);
            for (int j = 0; j < i; j++) {
                if (loto[j] == n) {
                    i--;
                    continue out;
                }
            }
            loto[i] = n;
        }
        // 다른 방식으로 정렬해보기
        for (int i = 0; i < loto.length - 1; i++) { // 마지막은 정렬 필요 X
            for (int j = i + 1; j < loto.length; j++) { //i+1값의 칸부터 배열의 끝까지 차례대로 비교
                if (loto[i] > loto[j]) { // 만약 전의 값이 뒤의 값보다 클때
                    int t = loto[i]; // 깡통에 i값 삽입
                    loto[i] = loto[j]; // 자리 교환
                    loto[j] = t; // 빈공간에 깡통에 넣어놓은 값 삽입
                    System.out.println("i 값이 " + i + "일때 배열" + Arrays.toString(loto));
                }
            }
        }
        // 최종 출력
        for (int num : loto) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
