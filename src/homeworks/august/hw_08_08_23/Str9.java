package homeworks.august.hw_08_08_23;

//Write a program that can swap first name with last name in the email (Saperated by an underscore).
//If the email doesn't contain an underscore print the given input email.
//Ex:
//input: mike_tyson@gmail.com
//output: tyson_mike@gmail.com

public class Str9 {

    public static void main(String[] args) {

        String input = "mike_tyson@gmail.com";

        String[] array = input.split("@");

        if (array[0].contains("_")) {
            String[] name = array[0].split("_");
            StringBuilder sb = new StringBuilder();
            sb.append(name[1]).append("_").append(name[0]).append("@").append(array[1]);
            System.out.println(sb);
        } else {
            System.out.println(input);
        }
    }
}
