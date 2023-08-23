package homeworks.hw_13_08_23;

//Имеется строка, к примеру "Hello my young dog". Необходимо перевернуть строку в след. формате "godgn uo yymol leH".
//То есть после реверса длина слова равнялась изначальной длине.

public class Reverse {
    public static void main(String[] args) {

        String test = "Hello my young friend";

        String[] testArray = test.split(" ");

        String testNoSpaces = test.replaceAll(" ", "");

        StringBuilder reverse = new StringBuilder(testNoSpaces).reverse();

        StringBuilder result = new StringBuilder();

        for (String word : testArray) {
            result.append(reverse, 0, word.length()).append(" ");
            reverse.delete(0, word.length());
        }

        System.out.println(result);

    }
}
