package homeworks.hw_31_08_23;

public class Test {
    public static void main(String[] args) {
        ImitationList list = new ImitationList(10);
        list.addElement(5);
        list.addElement(4);
        list.addElement(1);
        list.addElement(3);
        list.addElement(8);
        list.addElement(5);
        list.addElement(3);
        list.addElement(9);
        list.addElement(5);
        list.addElement(4);
        list.deleteElementByIndex(4);
        list.toString();
        }
    }
