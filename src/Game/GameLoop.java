package Game;

import java.util.Scanner;

public class GameLoop {
    public static void start(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n🧭 여정이 시작되었네. 명령어를 입력하시게.");
        System.out.println("🔑 '상태창' → 상태 확인 | 'exit' → 종료");

        while (true) {
            System.out.print("\n📜 입력: ");
            String input = scanner.nextLine().trim();

            if (input.equals("상태창")) {
                System.out.println("\n📊 [현재 상태]");
                hero.showStatus();
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 여정을 마치셨군. 다음에 다시 오시게.");
                break;
            } else {
                System.out.println("❓ 알 수 없는 명령입니다. '상태창' 또는 'exit'을 입력하시게.");
            }
        }
    }
}