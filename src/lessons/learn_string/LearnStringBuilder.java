package lessons.learn_string;

public class LearnStringBuilder {
    public static void main(String[] args) {
        String s = "Hello";

        for (int i = 0; i < 10; i++) {
            s += i;
        }
    }
}

/**
 * iter0: i == 0; s = "Hello0", "Hello"
 * iter1: i == 1; s = "Hello01", "Hello0"
 */
