package lessons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        /*String text = "World";
        String template = "W.rld";//any symbol*/

/*        String text = "Warld";
        String template = "W[ae]rld";// or a or e symbols*/

       /* String text = "WArld";
        String template = "W[a-eA-E]rld";// from a to e symbols*/

        /*String text = "Wfrld";
        String template = "W[a-y&&[^fd]]rld";// from a to y symbols, exclude f and d symbols*/

        /*String text = "W7rld";
        String template = "W[0-9]rld";// from 0 to 9 symbols*/

        /*String text = "W7rld";
        String template = "W\\drld";// from 0 to 9 symbols*/
//Quantors
       /* String text = "W78rld";
        String template = "W\\d{2}rld";// must be only 2 digits*/

     /*   String text = "W78rld";
        String template = "W\\d{2,4}rld";// from 2 to 4 digits*/
/*
        String template = ".*(fun|run).*";//OR operator
        String text = "Worldrunfriend";*/

        String template = "\\(095\\)";//OR operator
        String text = "(095)";

        System.out.println(Pattern.matches(template, text));
    }
}

class LearnMatcher {
    public static void main(String[] args) {
        String str = "Hello orm world orm friend orm";

        Pattern pattern = Pattern.compile("orm");

        Matcher matcher = pattern.matcher(str);

//        System.out.println(matcher.matches());

        while (matcher.find()) {
            String group = matcher.group();

            System.out.println(group);
        }
    }
}
