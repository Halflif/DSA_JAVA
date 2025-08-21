package Day17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BufferedWriter out = null;
        String filename = null;
        String content = null;
        File file;

        // 파일명 입력 및 덮어쓰기 확인
        while (true) {
            System.out.print("파일명을 입력하세요: ");
            filename = s.nextLine();
            file = new File("C:\\workspace\\" + filename + ".txt");

            if (file.isFile()) {
                System.out.print("이미 사용중인 이름입니다. 덮어쓰시겠습니까?(Y/N): ");
                String overwrite = s.nextLine();
                if (overwrite.equalsIgnoreCase("y")) {
                    break;
                }
                continue;
            }
            break;
        }
        // 파일 스트림 생성
        try {
            out = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            System.out.println("파일을 생성할 수 없습니다.");
            e.printStackTrace();
            s.close();
            return;
        }
        // 내용 입력 및 저장
        System.out.println("내용을 입력하세요 (빈 줄 입력 시 종료):");
        while (true) {
            content = s.nextLine();
            if (content.isEmpty()) {
                System.out.println("입력을 종료합니다.");
                break;
            }
            try {
                out.write(content);
                out.newLine();
            } catch (IOException e) {
                System.out.println("파일 쓰기 중 오류 발생");
                e.printStackTrace();
            }
        }
        // 마무리
        try {
            out.close();
        } catch (IOException e) {
            System.out.println("파일 닫기 중 오류 발생");
        }
        s.close();
        System.out.println(file.getName() + " 파일이 저장되었습니다.");
    }
}
