package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
[실행1]
파일명 입력 : c:\\workspace\\Hello.java
import java.util.*;
....
[실행2]
파일명 입력 : c:\\aaa\\bbb
파일이 없습니다
*/

public class FileTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일명 입력 : ");
        String fileName = sc.nextLine(); // 파일명 입력 받기

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("파일이 없습니다");
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) { // 파일 읽기
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }
}