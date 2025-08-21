package Day16;

import java.io.FileReader;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("c\\test\\a.txt");
        } catch (IOException e) {
            System.out.println("잘못된 파일명");
        }

    }
}
