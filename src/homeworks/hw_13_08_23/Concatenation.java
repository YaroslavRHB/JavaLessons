package homeworks.hw_13_08_23;

//Соединить две строки след. вида:
//("abc", "drf") результат: ("adbrcf"),
//("ab", "drf") результат: ("adbrf"),
//("abc", "dr") результат: ("adbrc")


public class Concatenation {

    public static void main(String[] args) {
        String str1 = "ab";
        int length1 = str1.length();
        String str2 = "def";
        int length2 = str2.length();

        String result = concat(str1, str2, length1, length2);

        System.out.println(result);

    }

    public static String concat(String str1, String str2, int length1, int length2) {

        StringBuilder sb = new StringBuilder();

        int difference;

        if (length1 > length2) {
            difference = length1 - length2;
            for (int i = 0; i < difference; i++) {
                str2 = str2.concat(" ");
            }
        } else if (length2 > length1) {
            difference = length2 - length1;
            for (int i = 0; i < difference; i++) {
                str1 = str1.concat(" ");
            }
        }

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return (sb.toString()).replaceAll(" ", "");
    }
}