import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        int result = 1;
        for (int i=1; i<= n; i++){
            result = result *i;}
        System.out.println("Факториал числа n: " +result);
    }
}
