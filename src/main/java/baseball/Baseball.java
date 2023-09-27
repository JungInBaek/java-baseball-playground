package baseball;

public class Baseball {

    public static void main(String[] args) {
        InsertView insertView = new InsertView();
        ResultView resultView = new ResultView();
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame(insertView, resultView);
        numberBaseballGame.play();
    }

}
