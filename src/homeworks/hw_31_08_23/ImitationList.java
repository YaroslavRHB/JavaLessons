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

    public void increaseDecreaseListByIndex(int index) {

        if (list.length + index <= 0) {

            System.out.println("Incorrect index");

            return;
        }

        int[] temp = new int[list.length + index];

        if (index > 0) {

            for (int i = 0; i < list.length; i++) {

                temp[i] = list[i];

            }
        }

        if (index < 0) {

            for (int i = 0; i < temp.length; i++) {

                temp[i] = list[i];

            }
        }

        list = temp;
    }

    public void changeListToFixedSize(int index) {

        if (index <= 0) {

            System.out.println("Incorrect index");

            return;
        }

        int[] temp = new int[index];

        if (temp.length > list.length) {

            for (int i = 0; i < list.length; i++) {

                temp[i] = list[i];

            }
        }

        if (temp.length < list.length) {

            for (int i = 0; i < temp.length; i++) {

                temp[i] = list[i];

            }
        }

        list = temp;
    }

    public void outputInOrder(int index) {

        if (index != 0 && index != 1) {

            System.out.println("Index should be 1 or 0");

            return;
        }

        if (index == 0) {

            for (int i = 0; i < list.length; i++) {

                System.out.println(list[i]);

            }
        }

        if (index == 1) {

            for (int i = list.length - 1; i >= 0; i--) {

                System.out.println(list[i]);
            }
        }
    }

    public void sortBubbleList() {

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

    public void addArray(ImitationList concatArray) {

        int count = 0;

        for (int i = 0; i < list.length; i++) {

            if (list[i] != 0) {

                count++;
            }
        }

        int[] temp = new int[count + concatArray.list.length];

        for (int i = 0; i < count; i++) {

            temp[i] = list[i];

        }

        for (int i = 0; i < concatArray.list.length; i++) {

            temp[count + i] = concatArray.list[i];

        }

        list = temp;
    }

    public void removeDuplicates() {

        ImitationList temp = new ImitationList(list.length);

        temp.list = list;

        boolean isClean = false;

        while (!isClean) {

            isClean = true;

            for (int i = 0; i < temp.list.length; i++) {

                int num = temp.list[i];

                for (int j = 0; j < temp.list.length; j++) {

                    if (i != j) {

                        if (num == temp.list[j]) {

                            temp.deleteElementByIndex(j);

                            isClean = false;
                        }
                    }
                }
            }
        }

        temp.deleteElementByIndex(temp.list.length - 1);

        list = temp.list;
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

        for (int i = 0; i < list.length; i++) {

            int index = random.nextInt(i + 1);

            int num = list[index];

            list[index] = list[i];

            list[i] = num;
        }
    }


    public String toString() {

        for (int j : list) {
            System.out.print(j + " ");
        }
        return "OK";
    }
}
