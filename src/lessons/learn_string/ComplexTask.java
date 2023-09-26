package lessons.learn_string;

/**
 * Имеется строка, к примеру "Hello my young dog".
 * Необходимо перевернуть строку в след. формате "godgn uo yymol leH".
 * То есть после реверса длина слова равнялась изначальной длине.
 */
public class ComplexTask {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        String str = "Don't speak my English";

        String replacedStr = str.replaceAll(" ", "");

        System.out.println(replacedStr);

        String s = new StringBuilder(replacedStr).reverse().toString();
        String[] words = str.split(" ");

        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            int length = word.length();
            String value = s.substring(0, length);

            builder.append(value).append(" ");
            s = s.substring(length);
        }
        System.out.println(builder);

    }
}
