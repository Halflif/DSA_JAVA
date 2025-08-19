package Day14;

import java.util.Arrays;

public class RandomPractice01 {
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
        // 오름차순 정렬
        for (int i = 0; i < loto.length - 1; i++) { // 마지막은 정렬 필요 X
            for (int j = 0; j < loto.length - 1 - i; j++) { // 앞 부분은 이미 정렬된거니깐 필요 X
                if (loto[j] > loto[j + 1]) {
                    int t = loto[j];
                    loto[j] = loto[j + 1];
                    loto[j + 1] = t;
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

