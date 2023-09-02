package homeworks.hw_31_08_23;

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

        // int[] temp = new int[list.length - 1];
        // System.arraycopy(list, 0, temp, 0, index);
        // for (int i = index + 1; i < list.length ; i++) {
        // temp[i-1] = list[i];

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

    public String toString() {

        for (int j : list) {
            System.out.println(j);
        }
        return "OK";
    }
}
