package Day14;

public class MathTest {
    public static void main(String[] args) {
        double res = 1;
        int a = 2;
        int b = 10;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        System.out.println((int) res);
        // 2의 10승
        res = Math.pow(a, b);
        System.out.printf("%.0f", res);

        System.out.println(Math.sqrt(2)); //제곱근 구하기
        System.out.println(Math.abs(-3)); // 절대값
        System.out.println(Math.round(2.5)); // 반올림
        System.out.println(Math.floor(2.5)); // 내림
        System.out.println(Math.ceil(2.5));  // 올림
        System.out.println(Math.round(-2.5));  // 반올림
        System.out.println(Math.random());  // 무작위 수
        System.out.println((Math.random() * 10) + 1);
    }
}
