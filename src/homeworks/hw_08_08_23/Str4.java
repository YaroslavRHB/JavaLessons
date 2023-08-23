package homeworks.hw_08_08_23;

//Count chars of strings placed in the even positions in the given array. For example: array = {"Hello", "world", "from",
//"array"} the result will be 9: "Hello" length is 5 and "from" length is 4 "world" and "array" are skipped because
//they are on the odd positions.

public class Str4 {

    public static void main(String[] args) {

        String[] array = {"Hello", "world", "from", "array"};

        int count = 0;

        for (int i = 0; i < array.length; i += 2) {
            count += array[i].length();
        }
        System.out.println(count);
    }
}