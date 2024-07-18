import java.util.Scanner;

//Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
public class secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String b = scanner.nextLine();

        if (a.equals(b)){
            System.out.println("Строки идентичны");
        }else {
            System.out.println("Строки неидентичны");
        }
    }

}
