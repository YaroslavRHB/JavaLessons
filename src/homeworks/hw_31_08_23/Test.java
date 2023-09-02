package homeworks.hw_31_08_23;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        ImitationList list = new ImitationList(10);
        ImitationList list2 = new ImitationList(3);

        list2.addElement(3);
        list2.addElement(4);
        list2.addElement(5);


        list.addElement(5);
        list.addElement(4);
        list.addElement(1);
        list.addElement(3);
        list.addElement(8);
        list.addElement(5);
        list.addElement(3);
        list.addElement(9);

        list.shuffleElements();

        list.toString();





        }
    }
