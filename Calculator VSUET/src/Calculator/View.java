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
            System.out.println("�������� ����� ����:\n" +
                    "\t1) ������ ���������\n" +
                    "\t2) ���������� ������� ����������\n" +
                    "\t0) ����� �� ���������\n");

            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> solveExpression();
                case 2 -> printHistory();
                case 0 -> System.out.println("���������� ������");
                default -> {
                    System.out.println("������ �������� �� ����������! ������� ������.\n");
                }
            }
        }
    }

    private void solveExpression() {
        while (true) {
            System.out.print("������� ���������: ");
            scanner.nextLine();                         //��������, ��� �����
            String expression = scanner.nextLine();

            try {
                System.out.print("�����: ");
                System.out.println(controller.getResult(expression) + "\n");
            } catch (EmptyStackException e) {
                System.out.println("������!");
                System.out.println("������� ��������� ���������!\n");
            }

            System.out.print("������ ��������� ���������? (y/n): ");
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
        System.out.println("��������� 10 ��������� ���������:");
        Vector<String> expressions = controller.readExpressions();
        if (expressions.size() == 0) {
            System.out.println("\t�� ���� ������ ��� �� ���� ���������");
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
