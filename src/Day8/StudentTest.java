package Day8;

public class StudentTest {
    public static void main(String[] args) {
        Student kim = new Student();
        kim.name = "김지우";
        kim.eng = 100;
        kim.math = 100;
        kim.kor = 100;
        kim.phone = "010-1234-5678";
        System.out.println(kim.math);
        kim.goSchool();
    }
}
