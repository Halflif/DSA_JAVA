package Day16;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(); // 배열 하나를 만듬, 자료구조에는 객체에 저장하고 싶어서
        // 래퍼 타입 클래스로 저장
        List.add(1);
        List.add(10);
        List.add(3);  // 값을 계속 추가하면은 뒤로 계속 생성됨
        System.out.println(List.get(0));
        System.out.println(List.size());
//        System.out.println(List.get(11));
        System.out.println(List);
        // 숫자 7을 맨 뒤에 추가
        List.add(7);
        // 숫자 99를 맨 앞에 추가
        List.add(0, 99);
        System.out.println(List);
        List.set(0, 88);
        System.out.println(List); // 객체의 toString 메서드로 가져옴 Object 클래스로 부터 상속받은 기능
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        System.out.println("향상된 for문");
        for (Integer i : List) {
            System.out.println(i);
        }
    }
}

// List Set Map : 추상 클래스 또는 인터페이스라서 객체를 만들지 못함 상속시켜 하위 클래스를 생성하기 위한 중간 단계
// 부모 클래스를 보면 같은 특징을 가지기 때문에 특성을 파악 할 수 있다.
// List : 선형구조로 되어있음. 데이터를 저장할 때 순서가 있음 앞에서부터 3번째 등의 순차적인 작업이 가능함 번호로 구분하기 때문에
// 똑같은 값이 들어가도 괜찮음 즉, 순차적 선형적임
// Set : 물건을 주머니에 넣고 다닌다고 생각함 => 집어넣고 꺼낼 수만 있는 주머니인데 주머니이기 때문에 순서가 없음
// 단순히 저장했다. 들어있냐없냐 확인 정도만 가능함 => 순차적 정렬은 확인 X 한번에 넣고 빼서 사용하는 용도.
// 순서가 없기 때문에 누가 누구인지 구별이 안되어서 중복된 값이 들어갈 수 없다
// Map : DB의 표의 형태. 한 쌍으로 구성되어 있음. Key와 Value가 한 쌍으로 이루어져 있다. Key를 통해서 Value를 찾음
// Key의 데이터 타입은 자신이 정하면 되지만 보통은 String구조로 함. Map도 절대로 중복되지 않는 Key와 Value를 가짐
// 정렬, 순서 X 무조건 Key를 기준으로 찾고 저장함 => 똑같은 키로 한번 더 저장하면 값을 수정하는 것임
