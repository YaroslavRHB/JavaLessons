package homeworks.hw_16_08_23;

//String : "a bcd 43.43 432 и л фвыа 89 .98"
//Enters the data type (one of them: char, int, double, String)

//Если будет идти подряд два символа или строка оканчивается без пробела// - Исключения???? - доп условия
//GitHub

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decomposition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String test = " a bcd 43.43 432 и фвыа р 89 .98 ";

        System.out.println("""
                Select items to extract from a string:\s
                1.Int\s
                2.Double\s
                3.Char\s
                4.String""");

        if (sc.hasNextInt()) {

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    Pattern patternInt = Pattern.compile("\\s(\\d+)\\s");
                    doMatch(patternInt, test);
                }
                case 2 -> {
                    Pattern patternDouble = Pattern.compile("(\\s\\d+)\\.(\\d+\\s)|\\s\\.\\d+\\s");
                    doMatch(patternDouble, test);
                }
                case 3 -> {
                    Pattern patternChar = Pattern.compile("\\s[A-Za-zА-Яа-я]\\s");
                    doMatch(patternChar, test);
                }
                case 4 -> {
                    Pattern patternString = Pattern.compile("(\\s[A-Za-zА-Яа-я]{2,}\\s)");
                    doMatch(patternString, test);
                }
            }
        } else {
            System.out.println("You have to enter a digit from 1 to 4");
        }
    }

    public static void doMatch(Pattern pattern, String str) {

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {

            String group = matcher.group();

            System.out.println(group);
        }
    }
}

