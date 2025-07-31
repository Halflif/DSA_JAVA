package Day8;

public class Student {
    // 객체란? 현실세계의 사물이나 개념을 프로그래밍적으로 표현한 것 또는
    // 그 표현을 코드로 구현해 생성된 실체(인스턴스)
    // 필드 : 객체의 상태(객체가 아는 것)
    String name;
    int math;
    int eng;
    int kor;
    String phone;

    // 메서드 : 객체의 동작, 기능
    // static으로 써서 선언을 하면 객체를 생성하지 않아도 부를 수 있는 기능
    public void goSchool() {
        System.out.println(name + " 가학교에 갑니다...");// 학생 객체가 만들어지고 학생이 가지고 있는 그 정보를 상정하는 학생의 이름을 같이 출력하고 싶다
        // 필드를 부르는데 문제가 없었다.


    }
}

// 학생이라는 객체가 생겨나는 것을 상정하고 코드를 씀
// 클래스 안에서 만들어질 인스턴스의 자체를 가리키고 싶다

