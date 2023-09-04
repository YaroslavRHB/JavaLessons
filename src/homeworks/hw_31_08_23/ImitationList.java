package homeworks.hw_31_08_23;

import java.util.Random;

public class ImitationList {
    private int[] list;

    public ImitationList(int size) {

        list = new int[size];
    }

    public void addElement(int value) {

        if (value == 0) {
            System.out.println("Zero not allowed");
            return;
        }

        resize();

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                list[i] = value;
                break;
            }
        }
    }

    private void resize() {

        if (list[list.length - 1] != 0) {
            int[] temp = new int[list.length * 2];

            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }

            list = temp;

        }
    }

    public void changeElementByIndex(int index, int value) {

        if (index < 0 || index > list.length - 1) {
            System.out.println("Incorrect index");
            return;
        }

        if (value == 0) {
            System.out.println("Zero not allowed");
            return;
        }

        list[index] = value;
    }

    public void deleteElementByIndex(int index) {

        if (index < 0 || index > list.length - 1) {
            System.out.println("Incorrect index");
            return;
        }

        int[] temp = new int[list.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = list[i];
        }

        for (int i = index + 1; i < list.length; i++) {
            temp[i - 1] = list[i];
        }

        list = temp;
    }

    public void increaseByIndex(int index) {

        if (index <= 0) {
            System.out.println("Incorrect index");
            return;
        }

        int[] temp = new int[list.length + index];

        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }

        list = temp;
    }

    public void decreaseByIndex(int index) {

        if (index <= 0 || index >= list.length) {
            System.out.println("Incorrect index");
            return;
        }

        int[] temp = new int[list.length - index];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = list[i];
        }

        list = temp;
    }

    public void increaseToFixedSize(int index) {

        if (index <= 0) {
            System.out.println("Incorrect index");
            return;
        }

        int[] temp = new int[index];

        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }

        list = temp;
    }

    public void decreaseToFixedSize(int index) {

        if (index <= 0) {
            System.out.println("Incorrect index");
            return;
        }

        int[] temp = new int[index];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = list[i];
        }

        list = temp;
    }

    public void outputInOrder() {

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }

    public void sortBubble() {

        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 1; i < list.length; i++) {
                if (list[i] < list[i - 1]) {
                    int temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public void addArray(int[] array) {

        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                count++;
            }
        }

        int[] temp = new int[count + array.length];

        for (int i = 0; i < count; i++) {
            temp[i] = list[i];
        }

        for (int i = 0; i < array.length; i++) {
            temp[count + i] = array[i];
        }

        list = temp;
    }

    public void removeDuplicates() {

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    deleteElementByIndex(i);
                    j--;
                }
            }
        }
    }


    public void searchFirstEntry(int value) {
        for (int i = 0; i < list.length; i++) {
            if (value == list[i]) {
                System.out.println("The first entry is: " + i);
                break;
            }
        }
    }

    public void shuffleElements() {

        Random random = new Random();

        for (int i = list.length - 1; i > 1; i--) {
            int j = random.nextInt(i);
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public void showInfo() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.length; i++) {
            sb.append(Integer.parseInt(String.valueOf(list[i])) + " ");
        }
        System.out.println(sb.toString());

    }
}
