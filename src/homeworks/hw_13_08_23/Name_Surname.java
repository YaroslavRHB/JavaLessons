package homeworks.hw_13_08_23;

//Пользователь вводит имя и фамилию. Буквы могут быть в разных регистрах. "Andrey Valevskiy"
//Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем.

import java.util.regex.Pattern;

public class Name_Surname {
    public static void main(String[] args) {
        String name = "Andrey Valevskiy";
//        String template = "^[A-Z][a-z]*\\s[A-Z][a-z]*$";
        String template = "([A-Z])([a-z]*)\\s([A-Z])([a-z]*)$";
        System.out.println(Pattern.matches(template, name));
    }
}
