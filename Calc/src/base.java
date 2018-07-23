import java.util.Scanner;

public class base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double first = scan.nextDouble();
        System.out.println("Вы ввели число "+first);
        System.out.println("Введите второе число число");
        double second = scan.nextDouble();
        System.out.println("Вы ввели число "+second);
        System.out.println("Выберите тип выполняемой операции + - * /");
        double sum;
        String operation = scan.next();
        if (operation.startsWith("+")){
            sum = first+second;
            System.out.println("Сумма значений ");
            System.out.printf("%.4f",+sum);
        }
        else if(operation.startsWith("-")){
            sum = first - second;
            System.out.println("Произведение чисел равна ");
            System.out.printf("%.4f",+sum);
        }
        else if(operation.startsWith("*")) {
            sum = first * second;
            System.out.println("Произведение чисел равна ");
            System.out.printf("%.4f",+sum);
        }
        else if(operation.startsWith("/")) {
            sum = first / second;
            System.out.println("Отношение чисел равна ");
            System.out.printf("%.4f",+sum);
        }

    }
}
