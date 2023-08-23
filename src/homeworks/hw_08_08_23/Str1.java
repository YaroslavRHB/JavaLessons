package homeworks.hw_08_08_23;


//Declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and
//”Tomcat” for second. Write code to display all letters, which are present in the first word, but absent in the second.


public class Str1 {
    public static void main(String[] args) {

        String str1 = "Cartoon".toLowerCase();
        String str2 = "Tomcat".toLowerCase();

        for (int i = 0; i < str1.length(); i++) {

            char symbol = str1.charAt(i);

            String letter = String.valueOf(symbol);

            if (!str2.contains(letter)) {

                System.out.print(letter);
            }
        }


    }
}