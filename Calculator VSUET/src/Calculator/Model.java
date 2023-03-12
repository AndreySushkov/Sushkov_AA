package Calculator;

import java.util.Stack;
import java.util.Vector;

public class Model {
    /**���������� ��������� �������� ���������*/
    public double calculate (Vector<String> expression){
        Vector<String> polishExpression = polishTransformation(expression);
        double result = calculatePolishExpression(polishExpression);

        return result;
    }

    /**������� �� ��������� ������� ��������� � �������� ��������*/
    private Vector<String> polishTransformation(Vector<String> expression) {
        Vector<String> polishExpression = new Vector<>();

        Stack<String> stack = new Stack<>();
        for (String element : expression) {
            if (!isOperator(element) && !element.equals("(") && !element.equals(")")) {             //������ ��� �����
                polishExpression.add(element);
            }
            else if (isOperator(element) || element.equals("(") || element.equals(")")) {           //������ ��� �������� ��� ������
                if (stack.empty()) {
                    stack.push(element);
                    continue;
                }

                if (isOperator(element)) {
                    //����������� � �����������
                    if (determinatePriority(stack.peek()) >= determinatePriority(element)) {
                        while (!stack.empty()) {
                            if (stack.peek().equals("(")) {
                                break;
                            }

                            String op = stack.pop();
                            polishExpression.add(op);
                        }
                    }

                    stack.push(element);
                }
                else if (element.equals("(")) {
                    stack.push(element);
                }
                else if (element.equals(")")) {
                    while (!stack.empty()) {
                        if (stack.peek().equals("(")) {
                            break;
                        }

                        String op = stack.pop();
                        polishExpression.add(op);
                    }

                    //�������� ����������� ������
                    stack.pop();
                }
            }
        }

        //������������� ���������� ����������
        while (!stack.empty()) {
            String op = stack.pop();
            polishExpression.add(op);
        }

        return polishExpression;
    }

    /**���������� ��������� � �������� �������� �������*/
    private double calculatePolishExpression(Vector<String> expression) {
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < expression.size(); i++) {
            if (isOperator(expression.get(i))) {
                double y = stack.pop();
                double x = stack.pop();

                switch (expression.get(i)) {
                    case "+" -> stack.push(x+y);
                    case "-" -> stack.push(x-y);
                    case "*" -> stack.push(x*y);
                    case "/" -> stack.push(x/y);
                }
            }
            else {
                //���������� ����� � ����
                stack.push(Double.parseDouble(expression.get(i)));
            }
        }

        return stack.peek();
    }

    /**�������� �������� �� ��������*/
    private boolean isOperator(String operator) {
        String[] operators = new String[] {"+", "-", "*", "/"};
        for (String op : operators) {
            if (operator.equals(op)) {
                return true;
            }
        }

        return false;
    }

    /**����������� ���������� ���������*/
    private int determinatePriority(String operator) {
        return switch (operator) {
            case "*", "/" -> 2;
            case "+", "-" -> 1;
            default -> 0;
        };
    }
}
