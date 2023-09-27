package baseball;

public class CompareValue {

    private short random;

    private short input;

    private Result result;

    public CompareValue(short random, short input, Result result) {
        this.random = random;
        this.input = input;
        this.result = result;
    }

    public short getRandom() {
        return random;
    }

    public short getInput() {
        return input;
    }

    public Result getResult() {
        return result;
    }

}
