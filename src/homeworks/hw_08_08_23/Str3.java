package homeworks.hw_08_08_23;

//Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.

public class Str3 {

    public static void main(String[] args) {

        String string = "Java";

        String substring = string.substring(0, string.length() / 2);

        System.out.println(substring);
    }
}
