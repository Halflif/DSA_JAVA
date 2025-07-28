package Day5;

public class ForExample {
    public static void main(String[] args) {
        // 3. for 문
        /*
         * for(초기화식; 조건식; 증감식){
         *       수행문;
         * }
         * */
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(i + "회차반복");
            System.out.println(sum);
            System.out.println("----------------");
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다");

        // for문 괄호 안의 세 요소(초기화, 조건, 증감)는 모두 생략가능하다.
        /*
         * - 초기화식 : 반복 전에 이미 초기화된 변수를 사용하는 경우 생략할 수 있다.
         * - 조건식 : 반복을 중간에 멈추고자 할때, 조건을 블록 내의 제어문을 추가하여 처리하면 조건식을 생략할 수 있다
         * - 증감식 : 증감식이 복잡하거나 다른 변수의 상태에 따라 달라질 경우, 증감 처리를 블록 안에서 직접 처리할 수 있다
         * */

        System.out.println("초기화식 생략");
        int sum1 = 0;
        int i1 = 0;
        for (; i1 <= 10; ++i1) {
            sum1 += i1;
        }
        System.out.println("1부터" + (i1 - 1) + "까지의 합은 " + sum1 + "입니다");

        System.out.println("조건식의 생략");
        int sum2 = 0;
        int i2 = 0;
        for (; ; ++i2) {
            sum2 += i2;
            if (i2 >= 10) {
                break;
            }
        }
        System.out.println("1부터" + i2 + "까지의 합은 " + sum2 + "입니다");

        System.out.println("증감식 생략");
        int sum3 = 0;
        int i3 = 0;
        for (; ; ) {
            i3++;
            sum3 += i3;
            System.out.println(i3 + "회차반복");
            System.out.println(sum3);
            System.out.println("=======================");
            if (i3 >= 5) {
                // break로 반복문 자체를 빠져나가게 함
                break;
            }
        }
        System.out.println("1부터" + i3 + "까지의 합은 " + sum3 + "입니다");
    }
}
