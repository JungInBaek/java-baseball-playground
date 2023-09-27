package baseball;

import java.util.Scanner;

public class ResultView {

    public void resultPrint(Result result) {
        short ball = result.getBall();
        short strike = result.getStrike();

        if (strike == 3) {
            System.out.println(strike + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            return;
        }
        if (ball == 0 && strike == 0) {
            System.out.print("낫싱");
        }
        if (ball > 0) {
            System.out.print(ball + "볼 ");
        }
        if (strike > 0) {
            System.out.print(strike + "스트라이크");
        }
        System.out.println();
    }

}
