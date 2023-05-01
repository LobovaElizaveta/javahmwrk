import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int Sum = 0;

        for (int i=1; i<= n; i++){
            Sum = Sum +i;}

        System.out.println("Сумма чисел: " + Sum);

    }
}
