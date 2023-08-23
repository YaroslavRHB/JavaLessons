package homeworks.hw_16_08_23.shiritori;

//Shiritori

import java.util.Scanner;
import java.util.regex.Pattern;

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (!Shiritori.gameOver) {

            String template = "[A-Za-z]*";

            String word = "";

            System.out.println("Enter a word: ");

            String eWord = sc.nextLine();

            if (Pattern.matches(template, eWord)) {

                word = eWord;

                Shiritori.play(word);

            } else {

                System.out.println("You entered a wrong word");
            }
        }
        sc.close();

        System.out.println(Shiritori.words);
    }
}
