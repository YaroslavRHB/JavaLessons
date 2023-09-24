package homeworks.august.hw_08_08_23;

//Дана непустая строка S и целое число N (> 0).
// Вывести строку, содержащую символы строки S, между которыми вставлено
//по N символов «*» (звездочка).

public class Str7 {

    public static void main(String[] args) {

        String word = "HELLO WORLD";

        String symbol = "*";

        int number = 3;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            sb.append(word.charAt(i));

            sb.append(symbol.repeat(number));
        }

        System.out.print(sb);
    }
}
