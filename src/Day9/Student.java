package Day9;

public class Student {
    // 필드 : 객체의 상태
    String studentName;
    int grade;
    String address;

    private int studentId;


    // 생성자 : 리턴타입을 지정하지 않는다
    // 여기서 생성자를 만드는 순가 디폴트 생성자가 없어졌으므로 여기서 추가해줘야함
    Student() {
    }

    ; // 디폴트 생성자 추가한 내용

    Student(int studentId, String studentName, int grade, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.address = address;
    }

    // 메서드 : 객체가 할 수 있는 것, 동작
    // get set 메서드
    public int getStudentId() { //
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    void greet() {
        System.out.print(studentName + "님이 인사를 합니다 : 안녕하세요.");
    }
}