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

    public boolean isNotDuplicate(short i, short rn, short[] rnum) {
        for (short j = 0; j < i; j++) {
            if (rn == rnum[j]) {
                return false;
            }
        }
        return true;
    }


    public short[] ready() {
        Random random = new Random();
        short[] rnum = new short[3];
        short i = 0;
        while (i < 3) {
            short rn = (short) (random.nextInt(9) + 1);
            if (isNotDuplicate(i, rn, rnum)) {
                rnum[i] = rn;
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

    public void compare(short i, short[] rnum, short[] input, Result result) {
        for (short j = 0; j < 3; j++) {
            if (i != j) {
                compareBall(rnum[i], input[j], result);
            }
            if (i == j) {
                compareStrike(rnum[i], input[j], result);
            }
        }
    }

    public void loop(short[] rnum) {
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
    }

    public void play() {
        String replay;
        do {
            short[] rnum = ready();
            loop(rnum);
            replay = insertView.restart();
        } while(replay.equals("1"));
    }

}
