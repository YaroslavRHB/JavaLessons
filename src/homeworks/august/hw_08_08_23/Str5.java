package homeworks.august.hw_08_08_23;

//Implement method hasNoneLetters. Method returns true if none of the letters in the blacklist
// are present in the phrase.
//If at least one letter from blacklist is present in the phrase return false. Comparison should be case insensitive.
//Meaning 'A' == 'a';

public class Str5 {

    public static void main(String[] args) {

        String str = "Hello world";
        String blacklist = "BPF";

        boolean check = hasNoneLetters(str, blacklist);

        System.out.println(check);
    }

    public static boolean hasNoneLetters(String str, String blacklist) {

        str = str.toLowerCase();
        blacklist = blacklist.toLowerCase();

        for (int i = 0; i < blacklist.length(); i++) {
            char symbol = blacklist.charAt(i);

            String s = String.valueOf(symbol);

            if (str.contains(s)) {
                return true;
            }
        }
        return false;
    }
}