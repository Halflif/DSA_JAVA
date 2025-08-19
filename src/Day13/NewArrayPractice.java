package Day13;

public class NewArrayPractice {
    public static void main(String[] args) {
        String a;
        String b = null; // 아예 객체가 없음
        String c = ""; //글자수가 0인 멀쩡한 객체
        String d = "abc";
        String e = "abc"; //new없이 선언하는거는 값은 값이라면 주소만 주는 것
        String f = new String("abc"); // new는 무조건 하나의 heap이 생김
        String g = new String("abc"); // new는 무조건 하나의 heap이 생김

//        System.out.println(a);
        System.out.println(b);
        System.out.println(c.length());
        System.out.println(c);
        System.out.println(d == e);
        System.out.println(e);
        System.out.println(f == g); // 객채의 주소 비교
        System.out.println(f.equals(g)); // 문자열 비교
        System.out.println(g);
        System.out.println(g.equals("ABc")); // 대문자 소문자 비교하여 false
        System.out.println(g.equalsIgnoreCase("AbC")); //대소문자 무시하고 비교
        System.out.println(g.startsWith("a")); // 앞부분만 비교
        System.out.println(g.endsWith("c")); // 뒷부분만 비교
        System.out.println("g새로 선언");
        g = "Java Programming";
        System.out.println(g.charAt(1)); // 인덱스 1에 있는 문자를 반환
        System.out.println(g.indexOf('a')); // a의 위치를 반환
        System.out.println(g.lastIndexOf('a')); // 마지막 a의 위치를 반환
        System.out.println(g.substring((5))); // 5번째 이후 문자열 부터 잘라서 보여줌
        System.out.println(g.substring(5, 9)); // 5번부터 9번까지 문자열 보여줌
        System.out.println(g.concat("!!!!!!")); // 문자열의 끝부터 해당 문자 연결
        System.out.println(g);

        String s = g.substring(5); // 원본을 유지하고 s를 새로 생성
        g = g.substring(5); // g가 새로 덮어쓰기 됨
    }
}
