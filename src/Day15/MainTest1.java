package Day15;

import java.util.Arrays;

public class MainTest1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        // 배열을 오름차순으로 정렬하기 위한 이중 for문 시작
        for (int i = 0; i < arr.length - 1; i++) {
            // i번째 요소를 기준으로 그 뒤의 요소들과 비교하기 위해 반복
            for (int j = i + 1; j < arr.length; j++) {
                // i 다음 요소부터 배열 끝까지 차례대로 비교
                if (arr[i] > arr[j]) {
                    int n = arr[i];// arr[i] 값을 임시 변수 temp에 저장
                    arr[i] = arr[j];    // arr[j] 값을 arr[i]에 대입
                    arr[j] = n; // temp에 저장해 둔 arr[i] 값을 arr[j]에 대입 및 교환
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        for (int n : arr) System.out.print("[" + n + "]"); //교환된 값을 출력
    }
}
