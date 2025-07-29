package Day6;

public class LoopPractice {
    public static void main(String[] args) {

        // 1 2 3 4 5 6 7 8 9 10
        int i = 1;
        int sum = 0;
        for (; i <= 10; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.printf("까지의 합은 %d이며 i의 값은 %d입니다%n", sum, i - 1);

        // 0 2 4 6 8 10
        int i1 = 0;
        int sum1 = 0;
        for (; i1 <= 10; i1++) {
            if (i1 % 2 == 1) {
                continue;
            }
            System.out.print(i1 + " ");
            sum1 += i1;
        }
        System.out.printf("의 합은 %d이며 i의 값은 %d입니다%n", sum1, i1 - 1);

        // 1 3 5 7 9
        int i2 = 0;
        int sum2 = 0;
        for (; i2 <= 10; i2++) {
            if (i2 % 2 == 0) {
                continue;
            }
            System.out.print(i2 + "  ");
            sum2 += i2;
        }
        System.out.printf("의 합은 %d이며 i의 값은 %d입니다%n", sum2, i2 - 1);

        // 10 9 8 7 6 5 4 3 2 1
        int n1 = 10;
        int pl = 0;
        for (; n1 > 0; n1--) {
            System.out.print(n1 + " ");
            pl += n1;
        }
        System.out.printf("의 합은 %d이며, i의 값은 %d입니다%n", pl, n1 + 1);

        // 10 20 30 40 50
        int n2 = 10;
        int p2 = 0;
        for (; n2 <= 50; n2 += 10) {
            System.out.print(n2 + " ");
            p2 += n2;
        }
        System.out.printf("의 합은 %d입니다%n", p2);

        // 2 4 6 8 16 32
        int n3 = 2;
        int p3 = 0;
        for (; n3 <= 32; n3 *= 2) {
            System.out.print(n3 + " ");
            p3 += n3;
        }
        System.out.printf("의 합은 %d입니다%n", p3);

        // 1 10 100 1000 10000
        long n4 = 1;
        long p4 = 0;
        for (; n4 <= 10000; n4 *= 10) {
            System.out.print(n4 + " ");
            p4 += n4;
        }
        System.out.printf("의 합은 %d입니다%n", p4);
    }
}
