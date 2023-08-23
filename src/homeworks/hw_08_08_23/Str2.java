package homeworks.hw_08_08_23;

//Вывести текст, составленный из последних букв всех слов.

public class Str2 {

    public static void main(String[] args) {

        String poem = """
                Over hill over dale\s
                Thorough bush thorough brier\s
                Over park over pale\s
                Thorough flood thorough fire\s
                """;

        StringBuilder sb = new StringBuilder();

        String[] words = poem.split(" ");

        for (String word : words) {
            sb.append(word.toCharArray()[word.length() - 1]);
        }

        System.out.println(sb);
    }
}
