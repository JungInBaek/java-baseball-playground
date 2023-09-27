package baseball;

import java.util.Scanner;

public class InsertView {

    public short[] input() {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.nextLine();
        String[] split = strNum.split("");
        short[] num = new short[3];
        for (short i = 0; i < num.length; i++) {
            num[i] = Short.parseShort(split[i]);
        }
        return num;
    }

    public String restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

}
