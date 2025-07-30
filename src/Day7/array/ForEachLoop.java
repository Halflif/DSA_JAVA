package Day7.array;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] subject = {"java", "DB", "FrontEnd" };
//        for (int i = 0; i < subject.length; i++) {
//            System.out.println(subject[i]);
//        }
        /*
         * for(자료형 각요소를가리킬변수명: 배열이름){
         *       수행문;
         * }
         * */
        for (String s : subject) {
            System.out.println(s);
        }
        for (int i = 0; i < subject.length; i++) {
            if (i == 1) {
                System.out.println(subject[i]);
            }
        }
    }
}
