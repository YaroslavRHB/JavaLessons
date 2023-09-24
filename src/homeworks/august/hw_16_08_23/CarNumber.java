package homeworks.august.hw_16_08_23;

//Car Number

import java.util.regex.Pattern;

public class CarNumber {
    public static void main(String[] args) {

        String carNumber = "B865CE";

        String pattern = "([ABCEHKMOPTXY])\\d{3}([ABCEHKMOPTXY]){2}";

        System.out.println(Pattern.matches(pattern, carNumber));
    }
}
