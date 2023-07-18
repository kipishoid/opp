import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите тип чисел:");
            System.out.println("1. Рациональные числа");
            System.out.println("2. Комплексные числа");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performRationalCalculations(scanner);
                    break;
                case 2:
                    performComplexCalculations(scanner);
                    break;
                case 0:
                    logger.info("Программа завершена");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте ещё раз.");
                    break;
            }
        }
    }

    private static void performRationalCalculations(Scanner scanner) {
        RationalNumber firstNumber = readRationalNumber(scanner, "Введите первое рациональное число:");
        RationalNumber secondNumber = readRationalNumber(scanner, "Введите второе рациональное число:");

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int operation = scanner.nextInt();
        RationalNumber result = null;

        switch (operation) {
            case 1:
                result = firstNumber.add(secondNumber);
                break;
            case 2:
                result = firstNumber.subtract(secondNumber);
                break;
            case 3:
                result = firstNumber.multiply(secondNumber);
                break;
            case 4:
                result = firstNumber.divide(secondNumber);
                break;
            default:
                System.out.println("Неверная операция.");
                return;
        }

        System.out.println("Результат: " + result.toString());
        logger.info("Выполнена операция с рациональными числами: {} {} {} = {}", firstNumber, getOperationSymbol(operation), secondNumber, result);
    }

    private static void performComplexCalculations(Scanner scanner) {
        ComplexNumber firstNumber = readComplexNumber(scanner, "Введите первое комплексное число:");
        ComplexNumber secondNumber = readComplexNumber(scanner, "Введите второе комплексное число:");

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int operation = scanner.nextInt();
        ComplexNumber result = null;

        switch (operation) {
            case 1:
                result = firstNumber.add(secondNumber);
                break;
            case 2:
                result = firstNumber.subtract(secondNumber);
                break;
            case 3:
                result = firstNumber.multiply(secondNumber);
                break;
            case 4:
                result = firstNumber.divide(secondNumber);
                break;
            default:
                System.out.println("Неверная операция.");
                return;
        }

        System.out.println("Результат: " + result.toString());
        logger.info("Выполнена операция с комплексными числами: {} {} {} = {}", firstNumber, getOperationSymbol(operation), secondNumber, result);
    }

    private static RationalNumber readRationalNumber(Scanner scanner, String message) {
        System.out.println(message);
        System.out.print("Введите числитель: ");
        int numerator = scanner.nextInt();
        System.out.print("Введите знаменатель: ");
        int denominator = scanner.nextInt();
        return new RationalNumber(numerator, denominator);
    }

    private static ComplexNumber readComplexNumber(Scanner scanner, String message) {
        System.out.println(message);
        System.out.print("Введите действительную часть: ");
        double realPart = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginaryPart = scanner.nextDouble();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    private static String getOperationSymbol(int operation) {
        switch (operation) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                return "";
        }
    }
}
