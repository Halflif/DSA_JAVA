package day2;

public class TypeConversion {
    public static void main(String[] args) {
        // 묵시적 형변환 말을 안해도 자동으로 바꿔주는 형변환 Implicit Conversion
        // 바이트 크기가 작은 자료형에서 크기가 큰 자료형으로 자동(묵시적으로 이루어 진다)
        // 정밀하지 않은 자료형에서 더 정밀한 자료형으로 자동으로 이루어 진다

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;
        System.out.println(iNum2);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);

        // 명시적 형 변환 Explicit Conversion
        // 묵시적 형 변환과 반대의 경우
        // 형 변환시 데이터의 손실이 발생할 수 있다
        int explicitConvINum = 1000;
        byte explicitConvBNum = (byte) explicitConvINum;
        System.out.println(explicitConvINum); // 크기가 큰 자료형에서 작은 자료형으로 대입해서 데이터 손실이 발생함(오버플로우)
        // 오버플로우는 실행하면 값이 다르게 나오지 에러가 나지 않는다는 것이 특징이다

        double dNumPI = 3.14;
        int iNum1 = (int)dNumPI;
        System.out.println(iNum1); // 실수에서 정수로 변환할 시에는 소숫점을 날리고 앞의 정수만 남긴다
                                  // 소수점 아래가 잘림 (반올림 아니고 무조건 버림)

        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int) dNum1 + (int) fNum2; // 두 실수가 각각 형변환 하여 더해짐
        int iNum4 = (int)(dNum1+fNum2); // 두 실수의 합이 먼저 계산되고 형변환 됨
        System.out.println(iNum3);
        System.out.println(iNum4);
        // 형변환과 계산의 순서에 의해 결과값이 다를 수 있다






    }


}


