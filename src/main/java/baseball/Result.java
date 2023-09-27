package baseball;

public class Result {

    public Result() {}

    public Result(short ball, short strike) {
        this.ball = ball;
        this.strike = strike;
    }

    private short ball;

    private short strike;

    public short getBall() {
        return ball;
    }

    public short getStrike() {
        return strike;
    }

    public void plusBall() {
        ball++;
    }

    public void plusStrike() {
        strike++;
    }

}
