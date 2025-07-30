package Day7;

public class FunctionTest {
    public static void main(String[] args) {
        // 함수 ? 하나의 기능을 수행하는 코드 덩어리
        // 작업을 여러번 반복한다면 함수로 만들어두고 필요할때마다 호출해서 쓸 수 있다.
        // 전달할 때 전달 받을때는 함수 선언할 때 지정된 대로(타입과, 순서).
        /*
         * 함수로 분리하는 것의 장점
         * - 가독성 향상
         * - 재사용성 증가, 중복코드 제거
         * - 유지보수 용이성
         * - 의도명확화
         * */
        int num1 = 10;
        int num2 = 20;
//        int result =;
        int result = addNum(num1, num2);
        System.out.println(result);
        System.out.println(addNum(num1, num2));

        addNum(num1, num2);

    }

    // javadoc 주석
    /*
     *  주석 블록 안에서 특별한 태그들을 사용해 문서화 할 수 있다.
     * @param a
     * @param b
     * @return
     * */
    public static int addNum(int a, int b) {

        int result = a + b;
        return result;
    }

}

