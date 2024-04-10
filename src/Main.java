import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 Задание ==========================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));

        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        System.out.println("Умножение: " + (a * b));

        System.out.println("2 задание ==========================================");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите первую строку (a): ");
        String as = scanner2.nextLine();
        System.out.print("Введите вторую строку (b): ");
        String bs = scanner2.nextLine();
        if (as.equals(bs)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        System.out.println("3 задание ==========================================");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }


    }
}