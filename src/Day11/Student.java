package Day11;

public class Student {
    private static int serialNum = 1000;

    private int korean;
    private int english;
    private int math;

    private int studentID;
    private String name;

    public Student(String name, int korean, int english, int math) {
        serialNum++;
        this.studentID = serialNum;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public static void resetSerial() {
        serialNum = 1000;
    }

    // 인스턴스 메서드로 변경
    public int getTotalScore() {
        return korean + english + math;
    }

    public double getAverage() {
        return getTotalScore() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void printResult() {
        System.out.printf(" %s (%d번)%n", name, studentID);
        System.out.printf("국어: %d, 영어: %d, 수학: %d%n", korean, english, math);
        System.out.printf("총점: %d, 평균: %.2f, 등급: %s%n%n", getTotalScore(), getAverage(), getGrade());
    }

    public void printNUM() {
        System.out.printf("학번 : %d  이름 : %s%n", studentID, name);
    }

}



