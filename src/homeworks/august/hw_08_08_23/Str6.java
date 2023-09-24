package homeworks.august.hw_08_08_23;

//Дано слово. Переставить первые три и последние три буквы, сохранив порядок их следования.

public class Str6 {
    public static void main(String[] args) {

        String word = "Something";

        String str1 = word.substring(0, 3);
        String str2 = word.substring(word.length() - 3);
        String str3 = word.substring(3, word.length() - 3);

        String result = str3.concat(str2.concat(str1));

        System.out.println(result);
    }
}
