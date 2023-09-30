package homeworks.september.hw_25_09_23.library;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    private static final User[] users = {
            new User(10, "123", "John", true),
            new User(10, "123456", "Ben", false)
    };

    public static void main(String[] args) {

        Library library = new Library(10);

        while (true) {
            if (library.isOpen()) {
                menu();
                int key = scanner.nextInt();
                try {
                    switch (key) {
                        case 1: {
                            System.out.println("Enter your firstName");
                            String firstName = scanner.next();

                            System.out.println("Enter password");
                            String password = scanner.next();

                            for (User user : users) {
                                if (user.getFirstName().equals(firstName) &&
                                        user.getPassword().equals(password)) {
                                    if (user.isAdmin()) {
                                        //call admin menu
                                    } else {
                                        //call user menu
                                    }
                                }
                            }

                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            break;
                        }
                        case 10:
                            return;
                        default:
                            return;
                    }
                } catch (Exception e) {
                    System.out.println("Exception" + e);
                }
            } else {
                System.out.println("Library is closet");
            }
        }
    }

    public static void menu() {
        System.out.println("1) Вход.\n" +
                "2) Показывать прямых родственников.\n" +
                "3) Вычислять статистику по всему дереву: количество живых.\n" +
                "4) Вычислять статистику по всему дереву: мужчин/женщин.\n" +
                "5) Вычислять статистику по всему дереву: среднее количество детей.\n" +
                "6) Вычислять статистику по всему дереву: среднюю продолжительность жизни.\n" +
                "7) Показывать прямых родственников с братьями и сёстрами, все родственники.\n" +
                "8) Показывать степень родства двух людей.\n" +
                "9) Exit.");
    }
}

