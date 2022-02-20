import java.util.Scanner;

public class KvadratnoeUrovnenie {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения, введите значения.");
        Scanner input = new Scanner(System.in);
        double a, b, c;
        final double x1, x2;
        System.out.print("Введите значение а: ");
        a = input.nextDouble();
        System.out.print("Введите значение b: ");
        b = input.nextDouble();
        System.out.print("Введите значение c: ");
        c = input.nextDouble();
        final double discrimenant = b * b - 4 * a * c;
        if (a <= 0) {
            System.out.println("Если значение a меньше или равно 0, уровнение стает линейным");
        } else if (a > 0) {
            if (discrimenant == 0) {
                x1 = (-b) / (2 * a);
                System.out.printf("x1 = x2 = %s", x1);
            } else if (discrimenant > 0) {
                x1 = (-b + Math.sqrt(discrimenant)) / (2 * a);
                x2 = (-b - Math.sqrt(discrimenant)) / (2 * a);
                System.out.printf("Решение: " + "x1 = %s, x2 = %s", x1, x2);
            } else {
                System.out.println("Дискреминант меньше нуля, решения нет");

            }
        }
    }
}
