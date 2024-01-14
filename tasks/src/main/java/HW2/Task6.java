package HW2;// К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class SimpleCalculator {
    private static final Logger lg = Logger.getLogger(SimpleCalculator.class.getName());

    public static void main(String[] args) {
        lg.log(Level.INFO, "Starting simple calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int result = 0;
        scanner.close();

        switch (operation) {
            case '+':
                result = num1 + num2;
                lg.log(Level.INFO, "Adding {0} and {1}", new Object[]{num1, num2});
                break;
            case '-':
                result = num1 - num2;
                lg.log(Level.INFO, "Subtracting {1} from {0}", new Object[]{num1, num2});
                break;
            case '*':
                result = num1 * num2;
                lg.log(Level.INFO, "Multiplying {0} and {1}", new Object[]{num1, num2});
                break;
            case '/':
                result = num1 / num2;
                lg.log(Level.INFO, "Dividing {0} by {1}", new Object[]{num1, num2});
                break;
            default:
                lg.log(Level.INFO, "Invalid operation entered: {0}", operation);
                System.out.println("Неправильная операция");
                return;
        }
        lg.log(Level.INFO, "Result: {0}", result);
        System.out.println("Результат: " + result);
    }
}
