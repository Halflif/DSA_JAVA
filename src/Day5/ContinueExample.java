package Day5;

public class ContinueExample {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        // 짝수의 누산
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println("건너 뛰었을 때 i값" + i);
                continue;
            }
            System.out.println("누산한 i값" + i);
            sum += i;
        }
        System.out.printf("누산을 한 i의 값은 %d이며 총 계는 %d입니다", i - 1, sum);
    }
}
//continue if의 구문이 참이면 건너뛰어라
