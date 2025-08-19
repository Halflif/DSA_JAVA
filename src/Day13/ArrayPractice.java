package Day13;

public class ArrayPractice {
    public static void main(String[] args) {

        int ar[] = new int[5];
        int ar2[];
        ar2 = new int[5];
        int ar3[] = {10, 20, 30, 40, 50};

        System.out.println(ar3);
        System.out.println(ar3[0]);
        ar3[0]++;
        System.out.println(ar3[0]);
        //    System.out.println(ar3[55]);

        for (int i = 0; i < ar3.length; i++) {
            System.out.println(ar3[i]);
        }
        System.out.println("=======향상된 for문===========");
        for (int k : ar3) {
            System.out.println(k);
        }
    }
}
