package Self_Practice;

public class Typeconversion_Practice {
    public static void main(String[] args) {
        int num = 10; //int헝 변수 n에 정숫값 10을 대입
        double dnum = num; // int형 변수 n의 값을 double형 변수 dnum에 대입
        // 묵시적 형 변환 : 자동 형 변환
        // 명시적 형 변환 : 강제 형 변환
        /* 형변환의 기본 원칙
         *  1) 현 변환은 바이트 크기가 작은 자료형에서 큰 자료형으로 자동으로 이루어 진다
         *  2) 형 변환은 정밀하지 않은 자료형에서 더 정밀한 자료형으로 자동으로 이루어 진다
         * */
        System.out.println("묵시적 형변환");
        System.out.println("1. 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우");
        byte bNum = 10;
        int iNum = bNum; //byte형 변수 bNum값을 int형 변수 iNum에 대입함
        System.out.println(bNum);
        System.out.println(iNum);

        System.out.println("2.덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우");
        int iNum2 = 20;
        float fNum = iNum2;
        System.out.println(iNum2);
        System.out.println(fNum); //실수형인 float로 들어갈 경우 20.0으로 실수 표기

        System.out.println("3. 연산 중에 자동으로 형 변환 되는 경우");
        int iNum3 = 20;
        float fNum2 = iNum3;
        double dNum;
        dNum = fNum2 + iNum3; // fNum2 + iNum3에서 float로 형변환 후 dNum의 double로 형변환 진행
        System.out.println(dNum);

        System.out.println("묵시적 형 변환 확인하기");
        byte bNum2 = 10;
        int iNum4 = bNum2; // byte형의 값이 int 형 변수로 대입됨
        System.out.println(bNum2);
        System.out.println(iNum4);

        int iNum5 = 20;
        float fNum3 = iNum5; // int 형태의 값이 float형 변수로 대압됨
        System.out.println(iNum5);
        System.out.println(fNum3);

        double dNum2;
        dNum2 = fNum3 + iNum5;
        System.out.println(dNum2);

        System.out.println("명시적 형변환");
        // 명시적 형 변환은 뭇기적 형 변환과 반대의 경우 주로 발생
        System.out.println("바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우");
        int Inum = 10;
        byte Bnum = (byte) Inum; // 강제로 형을 바꿀려면 바꿀 형을 괄호 안에 명시해야함
        System.out.println(Inum);
        System.out.println(Bnum);

        int Inum2 = 1000;
        byte Bnum2 = (byte) Inum2;
        System.out.println(Bnum2); // 1000은 byte형의 자료를 넘었으므로 -24로 표기됨 즉, 자료의 손일이 발생

        System.out.println("더 정밀한 자료에서 덜 정밀한 자료형으로 대입하는 경우");
        double Dnum = 3.14;
        int Inum3 = (int) Dnum; // 실수 자료형 double을 정수 자료형 int로 형변환
        System.out.println(Dnum);
        System.out.println(Inum3); // 실수 부분인 소숫점 아래가 생략되고 정수 부분만 표기됨

        System.out.println("연산중 형 변환되는 경우");
        double Dnum2 = 1.2;
        float Fnum = 0.9F;

        int Inum4 = (int) Dnum2 + (int) Fnum; // 각각의 두 실수가 정수로 형변환 된 후 계산됨
        int Inum5 = (int) (Dnum2 + Fnum); // 두식수의 합이 먼저 계산되고 형변환됨
        System.out.println(Inum4);
        System.out.println(Inum5);

    }
}
