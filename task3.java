import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int result;
        char operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        number2 = scanner.nextInt();
        System.out.println("Введите операцию (+; -; *; /;): ");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case ('+') -> result = number1 + number2;
            case ('-') -> result = number1 - number2;
            case ('*') -> result = number1 * number2;
            case ('/') -> result = number1 / number2;
            default -> {
                System.out.println("Ошибка!");
                return;
            }
        }
        System.out.println("Итог: ");
        System.out.println(number1+" "+operation+" "+number2+" = "+result);
    }
}
