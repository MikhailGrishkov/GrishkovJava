import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a>b");
        } else if(a<b){
            System.out.println("a<b");
        } else{
            System.out.println("a=b");
        }
        System.out.println("Сумма чисел = " +(a+b));
        System.out.println("Разница чисел = " +(a-b));
        System.out.println("Произведение чисел = " +(a*b));
        System.out.println("Частное чисел = " +(a/b));
    }
}

