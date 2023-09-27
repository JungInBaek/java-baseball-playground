import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    void calculationTest() {
        StringCalculator stringCalculator = new StringCalculator();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("2 + 3 * 4 / 2".getBytes());
        System.setIn(byteArrayInputStream);
        stringCalculator.input();
        stringCalculator.calculation();
        Integer result = stringCalculator.output();
        assertThat(result).isEqualTo(10);
    }

}