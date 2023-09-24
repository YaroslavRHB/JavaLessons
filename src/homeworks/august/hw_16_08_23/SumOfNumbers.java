package homeworks.august.hw_16_08_23;

// В строке содержутся слова и числа(с натуральными(0-9) и с десятками(11 9)).
// Необходмо выделить числа и посчитать их сумму.
// Hello 11 from 8 world 45 ->
// Hello 1 from 8 world 5 ->

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbers {
    public static void main(String[] args) {

        String test = "Hello 11 from 8 world 45";

        int sum = 0;

        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(test);

        while (matcher.find()) {

            String group = matcher.group();

            sum = sum + Integer.parseInt(group);

        }
        System.out.println(sum);
    }
}
