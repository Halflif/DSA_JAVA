package Day17;

import java.io.File;
import java.io.IOException;

public class FileTest4 {
    public static void main(String[] args) throws IOException {
        File a = new File("c:\\workspace\\a.txt"); //없는 파일
        File b = new File("c:\\workspace"); // 있는 디렉토리
        File c = new File("."); // 현재 디렉토리
        File d = new File("c:\\workspace\\sub"); // 없는 디렉토리
        File e = new File("c:\\workspace\\main.html"); // 있는 파일

        System.out.println(a.exists()); // 파일 유무
        System.out.println(a.isFile()); // 파일로 있는지
        System.out.println(b.isDirectory()); // 디렉토리로 있는지
        System.out.println(c.getAbsolutePath()); // 절대경로 찾기 \.까지 표시
        System.out.println(c.getCanonicalPath()); // 파일 경로까지만
        System.out.println(e.getName()); // 이름만 알아내는 것
        System.out.println(e.getParent()); //부모경로 찾기
        System.out.println(e.length()); // 그 파일의 byte수 즉, 파일의 크기


        // 현재 경로에 a.txt 파일이 없으면 생성
        if (!a.isFile()) {
            a.createNewFile();
        }
        // 현재 경로에 폴더가 없으면 생성
        if (!d.isDirectory()) {
            d.mkdir();
        }
        //파일 지우기
        if (a.isFile()) {
            a.delete();
        }

    }
}
