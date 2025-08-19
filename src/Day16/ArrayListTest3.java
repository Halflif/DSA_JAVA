package Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    public static void main(String[] args) {
//        // 이름 : 홍길동 국어 : 100점 수학: 90점 영어 : 80점
//        Student s1 = new Student("홍길동", 100, 80, 90);
//        Student s2 = new Student();
//        int k = s1.getKorean(); //국어점수 읽기
//        s1.setEng(100); // 영어점수 읽기
//        int t = s1.getTotal(); // 총점 읽기
//        System.out.println(s1);
        Scanner s = new Scanner(System.in);
        // 학생 3명을 입력받아 리스트에 저장하고 전부 출력
        ArrayList<Student> stu = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            //학생 이름을 입력 받아서, 국영수 점수 입력받아 Student 객체 생성하고
            System.out.print("이름을 입력하세요 :");
            String st = s.nextLine();
            System.out.println("국어 성적을 입력하세요 :");
            int kor = s.nextInt();
            System.out.println("영어 성적을 입력하세요 :");
            int eng = s.nextInt();
            System.out.println("수학 성적을 입력하세요 :");
            int math = s.nextInt();
            s.nextLine(); //버퍼비우기
            // 그 객체를 리스트에 저장
            Student student = new Student(st, kor, eng, math);
            stu.add(student);
        }
        // 전체 출력
        System.out.println(stu);
    }

}
