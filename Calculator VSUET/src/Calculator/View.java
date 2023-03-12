package Calculator;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Vector;

public class View {
    Controller controller = new Controller();

    Scanner scanner = new Scanner(System.in);

    public void draw() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Выберите пункт меню:\n" +
                    "\t1) Решить выражение\n" +
                    "\t2) Посмотреть историю вычислений\n" +
                    "\t0) Выйти из программы\n");

            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> solveExpression();
                case 2 -> printHistory();
                case 0 -> System.out.println("Завершение работы");
                default -> {
                    System.out.println("Данной комманды не существует! Введите другую.\n");
                }
            }
        }
    }

    private void solveExpression() {
        while (true) {
            System.out.print("Введите выражение: ");
            scanner.nextLine();                         //Поверьте, это нужно
            String expression = scanner.nextLine();

            try {
                System.out.print("Ответ: ");
                System.out.println(controller.getResult(expression) + "\n");
            } catch (EmptyStackException e) {
                System.out.println("Ошибка!");
                System.out.println("Неверно построено выражение!\n");
            }

            System.out.print("Ввести следующее выражение? (y/n): ");
            String choice = scanner.next();
            if (choice.equals("y")) {
                continue;
            }
            else {
                break;
            }
        }
    }

    private void printHistory() {
        System.out.println("Последние 10 введенных выражений:");
        Vector<String> expressions = controller.readExpressions();
        if (expressions.size() == 0) {
            System.out.println("\tНе было решено еще ни одно выражение");
        }
        else {
            for (int i = 1; i <= 10; i++) {
                if (expressions.size() >= i) {
                    System.out.println("\t" + expressions.get(expressions.size() - i));
                }
            }
        }
    }
}
