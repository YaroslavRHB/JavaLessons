package homeworks.august.hw_16_08_23.shiritori;

//Shiritori

import java.util.ArrayList;

public class Shiritori {
    public static ArrayList<String> words = new ArrayList<>();
    public static boolean gameOver = false;

    public static void play(String word) {

        int num = words.size();

        if (words.isEmpty()) {

            words.add(word.toLowerCase());


        } else {

            String lastWord = words.get(num - 1);

            char lastLetterOfPreviousWord = lastWord.charAt(lastWord.length() - 1);

            char lastLetterOfWord = word.toLowerCase().charAt(0);

            if (words.contains(word) || lastLetterOfWord != lastLetterOfPreviousWord) {

                System.out.println("Game Over!");

                gameOver = true;

            } else {

                words.add(word.toLowerCase());
            }
        }
    }
}

