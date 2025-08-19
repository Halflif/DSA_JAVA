package Day16;

public class Student {
    //맴버 변수
    private String name;
    private int Math;
    private int Korean;
    private int Eng;

    //메서드
    // 생성자 규칙 : 메서드의 이름은 클래스와 같아야 한다
    // 기본 생성자는 파라메터를 받지 않는다
    // 생성자를 전혀 만들지 않으면 자동으로 생성된다
    // 생성자에는 void를 사용하지 않는다 즉, 리턴 타입을 명시하지 않는다
    // 생성자는 꼭 public일 필요는 없지만 값을 가져다 사용해야 하므로 왠만해서는 public으로 사용한다.
    // 외부에서 객체를 만들 필요가 없을 경우에는  private를 사용하기도 한다. EX) java.lang.Math
    // 기본 생성자에 값을 선언을 하지 않으면 null 또는 0이 들어간다.
    // 생성자를 하나라도 만들면 기본 생성자가 생기지 않으므로 기본 생성자를 수동으로 만들어줘야한다
    public Student() {
    }

    // 이거는 처음부터 파라메터를 받아서 데이터의 값이 들어있는 것
    public Student(String n, int k, int e, int m) {
        name = n;
        Korean = k;
        Eng = e;
        Math = m;
    }

    public int getKorean() {
        return Korean;
    }

    public void setKorean(int korean) {
        Korean = korean;
    }

    public int getTotal() {
        return Korean + Eng + Math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEng() {
        return Eng;
    }

    public void setEng(int e) {
        Eng = e;
    }

    @Override
    public String toString() {
        return " 이름: " + name +
                "\n" + " 국어성적 :" + Korean + "\n" + " 수학성적 :" + Math + "\n" + " 영어성적 :" +
                Eng + "\n" + " 총점:" + getTotal() + "\n";
    }
}
