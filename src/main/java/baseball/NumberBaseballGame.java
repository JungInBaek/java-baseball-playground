package baseball;

import java.util.Random;

public class NumberBaseballGame {

    private InsertView insertView;

    private ResultView resultView;


    public NumberBaseballGame() {

    }

    public NumberBaseballGame(InsertView insertView, ResultView resultView) {
        this.insertView = insertView;
        this.resultView = resultView;
    }

    public boolean isNotDuplicate(int i, short rn, short[] rnum) {
        for (int j = 0; j < i; j++) {
            if (rn == rnum[j]) {
                return false;
            }
        }
        return true;
    }


    public short[] ready() {
        Random random = new Random();
        short[] rnum = new short[3];
        int i = 0;
        while (i < 3) {
            short rn = (short) (random.nextInt(9) + 1);
            if (isNotDuplicate(i, rn, rnum)) {
                rnum[i] = rn;
            }
            if (rn > 0) {
                i++;
            }
        }
        return rnum;
    }

    public void compareBall(short rnum, short input, Result result) {
        if (rnum == input) {
            result.plusBall();
        }
    }

    public void compareStrike(short rnum, short input, Result result) {
        if (rnum == input) {
            result.plusStrike();
        }
    }

    public void compare(int i, short[] rnum, short[] input, Result result) {
        for (short j = 0; j < 3; j++) {
            if (i != j) {
                compareBall(rnum[i], input[j], result);
            }
            if (i == j) {
                compareStrike(rnum[i], input[j], result);
            }
        }
    }

    public void play() {
        String replay;
        do {
            short[] rnum = ready();
            System.out.print("랜덤값 >>> ");
            for (int i = 0; i < 3; i++) {
                System.out.print(rnum[i]);
            }
            System.out.println();
            while (true) {
                short[] input = insertView.input();
                Result result = new Result();
                for (short i = 0; i < 3; i++) {
                    compare(i, rnum, input, result);
                }
                resultView.resultPrint(result);
                if (result.getStrike() == 3) {
                    break;
                }
            }
            replay = insertView.restart();
        } while(replay.equals("1"));
    }

}
