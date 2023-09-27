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
    @DisplayName("compareBall()")
    void compareBall() {
        // given
        NumberBaseballGame numberBaseballGame = new NumberBaseballGame();

        // when


        // then

    }

}