package homeworks.hw_08_08_23;

//Преобразовать данный текст, заменив каждую строку вида переменная=переменная+1;
// на строку вида переменная++;
//а каждую строку вида переменная=переменная–1;на строку вида переменная–– .

public class Str8 {
    public static void main(String[] args) {
        String str = "Hello count=count+1; world value=value-1;";//"Hello count++; world value--;"

        String str2 = str

                .replaceAll("count=count\\+1", "count++")
                .replaceAll("value=value-1", "value--");

        System.out.println(str2);
    }
}
