package Day4.Ifexample;

public class Ifexaple02 {
    public static void main(String[] args) {
        /*
         * if (조건식) {
         *  조건식이 참을 반환할 때 실행문;
         * } else if (또 다른 조건식) {
         * 또 다른 조건식이 참을 반환할 때 실행할 수행문
         * } else {
         *   위의 조건식 모두에서 거짓을 반환할 때 실행되는 수행문;
         * }
         * */
        int age = 7;
        int charge;
        charge = 1000;

        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        }
        if (age < 14) {
            charge = 1500;
            System.out.println("초등학생 입니다.");
        }
        if (age >= 8 && age < 14) {
            charge = 2000;
            System.out.println("중, 고등학생입니다.");
        }
        {
            charge = 2500;
            System.out.println("성인입니다");
        }
        System.out.println("입장료는+ charge +원 입니다.");
        int a = 9;
        int b = 32;
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        //삼항연산자 복습 선택요소가 두 가지인 간단한 조건문에서 사용
        max = (a > b) ? a : b;


    }
}
