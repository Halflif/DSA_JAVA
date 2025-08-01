package Self_Practice;

public class oprator02 {
    public static void main(String[] args) {
        // 증가 감소 연산자
        // 증가 감소 연산자는 다항 연산자 -> 피연산자 앞이나 뒤에 사용하며 값을 1만큼 늘리거나 줄인다
        // 증감연산자의 종류
        // ++ : 항의 값에 1을 더함 val = ++num; 먼저 num의 값이 1 증가된 두 면수 val에 대입
        // val = num++ => val변수에 기존 num값을 먼저 대입한 뒤 num의 값을 1 증가
        // -- 도 마찬가지
        // 증가 감소 연산자 실습
        int gameScore = 150;
        int lastScore1 = ++gameScore;
        System.out.println(lastScore1);

        int lastScore2 = --gameScore;
        System.out.println(lastScore2);

        //관계연산자
        // 항이 두개 이상인 이항 연산자 두개의 항 중 어느것이 더 큰지, 작은지, 같은지 등을 검사
        // 관게연산자의 종류

        // 논리연산자
        // 중학교 때의 명제랑 비슷함
        // &&(논리 곱) => 두 항이 모두 참이 경우에만 결괏값이 참
        // ||(논리 합) => 두 항 중 하나만 참이면 결과값은 참
        // !(부정) => 단항 연산자입니다. 참인 경우는 결과값을 거짓으로 바꾸고, 거짓인 경우는 참으로 바꿈

        int num = 10;
        int num2 = 20;
        boolean flag = (num > 0) && (num2 > 0);
        System.out.println(flag); //flag는 참

        flag = (num < 0) && (num2 > 0); //flag는 거짓
        System.out.println(flag);

        flag = (num < 0) || (num2 > 0);
        System.out.println(flag); //flag는 참
    }
}
