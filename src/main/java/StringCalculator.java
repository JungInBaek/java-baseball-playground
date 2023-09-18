import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {

    private List<Integer> numbers;

    private List<String> operations;

    private Integer result;

    public StringCalculator() {
        this.numbers = new ArrayList<>();
        this.operations = new ArrayList<>();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String stringMathExpression = scanner.nextLine();
        String[] split = stringMathExpression.split(" ");
        for (String s : split) {
            parseMathExpression(s);
        }
    }

    private boolean parseMathExpression(String s) {
        if (s.equals("*")) {
            operations.add(s);
            return false;
        }
        if (s.equals("/")) {
            operations.add(s);
            return false;
        }
        if (s.equals("+")) {
            operations.add(s);
            return false;
        }
        if (s.equals("-")) {
            operations.add(s);
            return false;
        }
        numbers.add(Integer.parseInt(s));
        return true;
    }

    private void multiplication(Integer num1, Integer num2) {
        result = num1 * num2;
    }

    private void division(Integer num1, Integer num2) {
        result = num1 / num2;
    }

    private void add(Integer num1, Integer num2) {
        result = num1 + num2;
    }

    private void minus(Integer num1, Integer num2) {
        result = num1 - num2;
    }

    public void calculation() {
        int i = 1;
        result = numbers.get(0);
        for (String operation : operations) {
            Integer num = numbers.get(i);
            if (operation.equals("*")) {
                multiplication(result, num);
            }
            if (operation.equals("/")) {
                division(result, num);
            }
            if (operation.equals("+")) {
                add(result, num);
            }
            if (operation.equals("-")) {
                minus(result, num);
            }
            i++;
        }
    }

    public Integer output() {
        System.out.println(result);
        return result;
    }

}
