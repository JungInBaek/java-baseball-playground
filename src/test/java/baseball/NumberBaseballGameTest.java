package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberBaseballGameTest {

    @Test
    @DisplayName("랜덤 값 생성")
    void random() {
        // given
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame(new InsertView(), new ResultView());

        // when
        short[] actual = numberBaseballGame.ready();
        short[] expected = numberBaseballGame.ready();

        // then
        Assertions.assertThat(actual).isNotEqualTo(expected);
    }

    @Test
    @DisplayName("랜덤값 - 중복 없음")
    void randomDuplicate() {
        // given
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame(new InsertView(), new ResultView());

        // when
        short[] random = numberBaseballGame.ready();

        // expected
        Assertions.assertThat(random[0]).isNotEqualTo(random[1]);
        Assertions.assertThat(random[0]).isNotEqualTo(random[2]);
        Assertions.assertThat(random[1]).isNotEqualTo(random[2]);
    }

    @Test
    @DisplayName("compareBall() - 볼 아닐 때")
    void compareBall1() {
        // given
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();
        Result result = new Result();
        short rnum = 8;
        short input = 9;
        short expected = 0;

        // when
        numberBaseballGame.compareBall(rnum, input, result);

        // then
        Assertions.assertThat(result.getBall()).isEqualTo(expected);
    }

    @Test
    @DisplayName("compareBall() - 볼일 때")
    void compareBall2() {
        // given
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();
        Result result = new Result();
        short rnum = 8;
        short input = 8;
        short expected = 1;

        // when
        numberBaseballGame.compareBall(rnum, input, result);

        // then
        Assertions.assertThat(result.getBall()).isEqualTo(expected);
    }

    @Test
    @DisplayName("compareStrike - 스트라이크 아닐 때")
    void compareStrike1() {
        // given
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();
        Result result = new Result();
        short rnum = 8;
        short input = 9;
        short expected = 0;

        // when
        numberBaseballGame.compareStrike(rnum, input, result);

        // then
        Assertions.assertThat(result.getStrike()).isEqualTo(expected);
    }

    @Test
    @DisplayName("compareStrike() - 스트라이크일 때")
    void compareStrike2() {
        // given
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();
        Result result = new Result();
        short rnum = 8;
        short input = 8;
        short expected = 1;

        // when
        numberBaseballGame.compareStrike(rnum, input, result);

        // then
        Assertions.assertThat(result.getStrike()).isEqualTo(expected);
    }

}