package Calculator;

import java.util.Stack;
import java.util.Vector;

public class Model {
    /**Вычисление итогового значения выражения*/
    public double calculate (Vector<String> expression){
        Vector<String> polishExpression = polishTransformation(expression);
        double result = calculatePolishExpression(polishExpression);

        return result;
    }

    /**Перевод из инфиксной нотации выражения в обратную польскую*/
    private Vector<String> polishTransformation(Vector<String> expression) {
        Vector<String> polishExpression = new Vector<>();

        Stack<String> stack = new Stack<>();
        for (String element : expression) {
            if (!isOperator(element) && !element.equals("(") && !element.equals(")")) {             //значит это ЧИСЛО
                polishExpression.add(element);
            }
            else if (isOperator(element) || element.equals("(") || element.equals(")")) {           //значит это ОПЕРАТОР или СКОБКА
                if (stack.empty()) {
                    stack.push(element);
                    continue;
                }

                if (isOperator(element)) {
                    //манипуляции с приоритетом
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

                    //удаление открывающей скобки
                    stack.pop();
                }
            }
        }

        //высвобождение оставшихся операторов
        while (!stack.empty()) {
            String op = stack.pop();
            polishExpression.add(op);
        }

        return polishExpression;
    }

    /**Вычисление выражения в обратной польской нотации*/
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
                    case "^" -> stack.push(Math.pow(x, y));
                    case "//" -> stack.push((x-x%y)/y);
                    case "%" -> stack.push(x%y);
                }
            }
            else {
                //добавление чисел в стэк
                stack.push(Double.parseDouble(expression.get(i)));
            }
        }

        return stack.peek();
    }

    /**Проверка элемента на оператор*/
    private boolean isOperator(String operator) {
        String[] operators = new String[] {"+", "-", "*", "/", "^", "//", "%"};
        for (String op : operators) {
            if (operator.equals(op)) {
                return true;
            }
        }

        return false;
    }

    /**Определение приоритета оператора*/
    private int determinatePriority(String operator) {
        return switch (operator) {
            case "^" -> 3;
            case "*", "/", "//", "%" -> 2;
            case "+", "-" -> 1;
            default -> 0;
        };
    }
}
