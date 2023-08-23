package homeworks.hw_08_08_23;

//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them. It should look like this:
//Sam Harris => S.H
//Patrick Feeney => P.F

public class Str11 {
    public static void main(String[] args) {
        String name1 = "Sam Harris";
        String name2 = "Patrick Feeney";

        makeInitials(name1);
        makeInitials(name2);
    }

    public static void makeInitials(String str) {
        String[] fullName = str.split(" ");
        String first = String.valueOf(fullName[0].toCharArray()[0]);
        String last = String.valueOf(fullName[1].toCharArray()[0]);
        System.out.println(str + " => " + first + "." + last);
    }
}
