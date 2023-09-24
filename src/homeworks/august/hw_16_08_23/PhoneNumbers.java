package homeworks.august.hw_16_08_23;

//Пользователь вводит телефон в формате (ххх)ххх-хх-хх.
//(ххх) должен быть таким: (095), (097), (073), (067), (099), (063).
//Проверить, чтобы 10 - ый номер был в формате (xxx)"ххх-хх-хх".
//Если пользователь вводит номер начинающийся
//на(095) или (099) ххх-хх-хх, выводить в консоль "Пользователь имеет МТС номер",
//на(097) или (067) ххх-хх-хх, выводить в консоль "Пользователь имеет Киевстар номер",
//на(073) или (063) ххх-хх-хх, выводить в консоль "Пользователь имеет Лайф номер".

import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a phone number in the following format: (xxx)ххх-хх-хх");

        String input = sc.next();

        String template = "\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}";

        if (input.matches(template)) {

            if (input.matches(("(\\(095\\)|\\(099\\))\\d{3}-\\d{2}-\\d{2}"))) {

                System.out.println("Пользователь имеет МТС номер");
            }
            if (input.matches(("(\\(067\\)|\\(097\\))\\d{3}-\\d{2}-\\d{2}"))) {

                System.out.println("Пользователь имеет Киевстар номер");
            }
            if (input.matches(("(\\(063\\)|\\(073\\))\\d{3}-\\d{2}-\\d{2}"))) {

                System.out.println("Пользователь имеет Лайф номер");
            }

        } else {

            System.out.println("You used the wrong number format");
        }
    }
}
