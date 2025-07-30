package Day7.array;

public class ArrayPractice01 {

    public static void main(String[] args) {
        int[] score = {55, 60, 71, 84, 62};
        char[] grades = new char[5];
        for (int i = 0; i < score.length; i++) {
            grades[i] = (whatGrad(score[i]));
        }
        for (char g : grades) {
            System.out.printf(g + "");
        }
        System.out.println("");
        System.out.println("=====================");
        System.out.println(grades);
        System.out.println(score);
    }

    /*
     * 점수를 받아 등급을 출력해주는 메서드 whatGrade[int score]
     * @param score
     * @return 문자형 grade 결과값
     */
    public static char whatGrad(int score) {
        if (score >= 80 && score <= 100) {
            System.out.println("합격입니다");
        } else if (score >= 1 && score < 80) {
            System.out.println("불합격입니다");
        } else {
            System.out.println("입력오류입니다");
        }
        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score < 60 && score >= 1) {
            System.out.println("F");
        }
        return '퉤';
    }
}



