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

    public String toString() {

        for (int j : list) {
            System.out.println(j);
        }
        return "OK";
    }
}
