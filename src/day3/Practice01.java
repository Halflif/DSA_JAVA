package day3;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        * 예제. 타수와 안타수를 변수에 저장하고 타율을 게산하세요
        *  타수 : 10
        *  안타 : 1
        *  타율 : 0.1
        *
        *  결과예시 ( 타율이 0.345로 나왔을 때)
        *  >3할 4푼 5리
        * */
        double HIT_C = 10;
        double HIT = 1;
        double hitAvg = HIT/HIT_C;
        System.out.println(hitAvg + "할");

        // 타율계산
        int ab = 1000;
        int h = 345;
        double average;

        // 출력문
        average = (double) h/ab;
        int n1, n2, n3;
        n1 = (int) (average * 10);   //할
        n2 = (int)(average * 100) % 10;  //푼
        n3 = (int) (average * 1000) % 10; //리
        System.out.println(n1 + "할" + n2 + "푼" + n3 + "리");


        /*
         * 예제. 타수와 안타수를 변수에 저장하고 타율을 게산하세요
         *  타수 : 55555  //입력을 받도록 고칠 부분
         *  안타 : 9955  // 입력을 받도록 고칠 부분
         *  타율 : 0.179
         *  1할 7푼 9리
         * */


        // 선언 및 초기화
       // int batCount = 55555;
      //  int hitCount = 9955;


        Scanner scan = new Scanner(System.in); //표준입력장치를 입력하는 스캐너를 생성해서 scan이라 명명한 할당한 공간에 넣겠다

        int batCount, hitCount;
        System.out.print("타수:"); // println은 줄바꿈이 발생하고 print는 줄바꿈이 발생하지 않음
        batCount = scan.nextInt(); // batCount를 스캔에서 가져오는데 그 값을 Int 값으로 받겠다
        System.out.print("안타:");
        hitCount = scan.nextInt();
        double hitRate;

        // 계산
        hitRate = (double) hitCount/batCount;
        System.out.printf("타율: %.3f%n", hitRate);                 // 서식을 지정해서 출력하기
        double result = hitRate;
        int n11, n22, n33;
        n11 = (int)(hitRate*10);  //할
        n22 = (int)(hitRate*100)%10; //푼
        n33 = (int)(hitRate*1000)%10; //리
        System.out.printf("%d할 %d푼 %d리", n11, n22, n33);
        // System.out.printf("타수: %d %n", batCount);
        // System.out.printf("안타: %d %n", hitCount);
       //  System.out.printf("타율: %.3f %n", hitRate);
        // System.out.println("할푼리:" + n11 + "할" + n22 + "푼" + n33 + "리");
        // System.out.printf("%d할%d푼%d리", n11,n22,n33);
     }


}
