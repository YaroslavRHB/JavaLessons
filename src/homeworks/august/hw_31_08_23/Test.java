package homeworks.august.hw_31_08_23;

public class Test {
    public static void main(String[] args) {

        ImitationList list = new ImitationList(10);
        int[] array = {5, 4, 6, 8, 9, 9};

        list.addElement(5);
        list.addElement(4);
        list.addElement(1);
        list.addElement(3);
        list.addElement(8);
        list.addElement(4);


        list.changeElementByIndex(4, 5);
        list.showInfo();

        list.deleteElementByIndex(4);
        list.showInfo();

        list.increaseByIndex(5);
        list.showInfo();

        list.decreaseByIndex(5);
        list.showInfo();

        list.increaseToFixedSize(20);
        list.showInfo();

        list.decreaseToFixedSize(10);
        list.showInfo();

        list.outputInOrder();
        list.showInfo();

        list.sortBubble();
        list.showInfo();

        list.addArray(array);
        list.showInfo();

        list.removeDuplicates();
        list.showInfo();

        list.searchFirstEntry(4);
        list.showInfo();

        list.shuffleElements();
        list.showInfo();
    }
}
