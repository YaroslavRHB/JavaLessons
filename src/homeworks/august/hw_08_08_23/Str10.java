package homeworks.august.hw_08_08_23;

//Create a class called EmailTask2.
//Assume that email address is constructed by person's first name and followed by an underscore and last name.
//Write a program that will print out information about user based on email. Print first name, last name, and domain.
//First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
//Ex:
//  input:
//  craig_federighi@apple.com
//  Output:
//  First name: Craig
//  Last name: Federighi
//  Domain: apple

public class Str10 {
    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";
        String[] array = email.split("@");
        String[] fullName = array[0].split("_");
        String[] extension = array[1].split("\\.");

        String fn = Str10.changeName(fullName[0]);
        String ln = Str10.changeName(fullName[1]);

        char[] domain = extension[0].toCharArray();
        String dn = String.valueOf(domain);

        System.out.println("First name:\t" + fn);
        System.out.println("Last name:\t" + ln);
        System.out.println("Domain:\t" + dn);
    }

    public static String changeName(String str) {
        char[] string = str.toCharArray();
        String firstLetter = String.valueOf(string[0]).toUpperCase();
        string[0] = firstLetter.charAt(0);
        String result = String.valueOf(string);
        return result;
    }
}
