package Day5;

public class ForPractice {
    public static void main(String[] args) {
        // 1~@까지의 합이 100이상일때 @와 100이상이 된 누산값을 출력하세요

        int n1 = 0;
        int sum = 0;

        for (; ; n1++) {
            sum += n1;
            if (sum >= 100) {
                break;
            }
        }
        System.out.printf("값은 %d이며, 총계는%d입니다.", n1, sum);
    }
}
