package Day14;

public class StringPractice4 {
    public static void main(String[] args) {

        String fileName = "이력서_홍길동.250814.docx";
        // 확장자는 docx 입니다.
        int Extension = fileName.lastIndexOf(".");
        System.out.println(Extension);
        if (Extension == -1) {
            System.out.println("확장자가 없습니다");
        } else {
            String ExtensionTrue = fileName.substring(Extension + 1);
            System.out.println(ExtensionTrue);
        }
        String phone = "010-1111-2222";
        int Fnum = phone.indexOf('-');
        int Nnum = phone.lastIndexOf('-');
        // '-' 기준으로 나누어 배열에 각각 저장
        // 전화번호의 '-'를 전부 '.'로 바꾸기 010.111.1111
    }
}
