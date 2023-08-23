package lessons.learn_string;

public class LearnString {
    public static void main(String[] args) {
        String str1 = "Hello";//object-literal
        String str2 = "Hello";//object-literal
        String str3 = new String("Hello");//object

        System.out.println(str1 == str3);
        System.out.println(str1 == str2);
    }
}
