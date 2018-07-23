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
        double sum = 0;
        String operation = scan.next();
        if (operation.startsWith("+")){
            sum = first+second;
            System.out.println("Сумма значений "+sum);
        }
        else if(operation.startsWith("-")){
            sum = first - second;
            System.out.println("Разность первого и второго числа "+sum);
        }
        else if(operation.startsWith("*")) {
            sum = first * second;
            System.out.println("Произведение чисел равна " + sum);
        }
        else if(operation.startsWith("-")) {
            sum = first / second;
            System.out.println("Отношение чисел равна " + sum);
        }
    System.out.println(sum);
    }
}
