package Day15;

import java.util.Arrays;

public class ArrayPractice03 {
    public static void main(String[] args) {
        double arr[] = {1.5, 3, 10.2, 33.1, 2.345};

        //선택정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                    System.out.println("선택정렬 :i 값이 " + i + "일때 배열" + Arrays.toString(arr));
                }
            }
        }
        // 버블정령
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = 0; k < arr.length - 1 - i; k++) {
                if (arr[i] > arr[k]) {
                    double s = arr[i];
                    arr[i] = arr[k];
                    arr[k] = s;
                    System.out.println("버블정렬 : i 값이 " + i + "일때 배열" + Arrays.toString(arr));
                }
            }
        }
    }
}
