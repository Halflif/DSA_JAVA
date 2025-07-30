package Day7.array;

public class ArrayTest {
    public static void main(String[] args) {
        // 배열 : 같은 자료형을 가진 자료 여러개를 묶어서 관리
        // data_type[] name  = {data}
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(numbers);
        int[] nums = {1, 2, 3}; // 배열 선언과 초기화
        int[] nums1 = new int[3]; //베열 생성과 값은 default 값으로 초기화
        int[] numsErr;
//        numsErr = {1,2,3}; 이 문법은 자바에서 허용하지 않는 문법
//        numsErr[0] = 1; //얘도 안됨
//        int numsErr2 = new int[3] {1,2,3}; 얘도 안됨 [] 안의 숫자 또는 {} 안의 숫자를 지워야함
//        index에서 숫자는 1부터가 아니라 0부터 시작됨
        int[] numsOK;
        numsOK = new int[3]; // 배열이 생성될 때 무조건 칸 수 지정해야함
        numsOK[0] = 1;
        numsOK[1] = 2;
        numsOK[2] = 3;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
        System.out.println("배열의 길이 " + numsOK.length); // numsOK의 길이 표현
        for (int i = 0; i < numsOK.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
