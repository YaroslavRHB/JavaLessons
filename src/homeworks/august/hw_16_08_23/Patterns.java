package homeworks.august.hw_16_08_23;

// Создать паттерн:
// Любое количество букв, а потом две цифры и наоборот.
// 2-4 цифры, а потом 2-4 буквы и наоборот.


import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[] args) {

        String test1_1 = "djhfkjslak43";
        String test1_2 = "54gjkrsfek";

        String template1_1 = "[A-Za-z]*\\d{2}";
        String template1_2 = "\\d{2}[A-Za-z]*";

        System.out.println(Pattern.matches(template1_1, test1_1));
        System.out.println(Pattern.matches(template1_2, test1_2));


        String test2_1 = "432jhgk";
        String test2_2 = "df435";

        String template2_1 = "\\d{2,4}[A-Za-z]{2,4}";
        String template2_2 = "[A-Za-z]{2,4}\\d{2,4}";

        System.out.println(Pattern.matches(template2_1, test2_1));
        System.out.println(Pattern.matches(template2_2, test2_2));

    }
}
