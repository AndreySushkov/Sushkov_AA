package Calculator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Controller {
    Model model = new Model();

    /**Получение и запись в историю результата выражения*/
    public double getResult(String expression){
        Vector<String> parsedExpression = parse(expression);
        double result = model.calculate(parsedExpression);

        writeExpression(expression, Double.toString(result));

        return result;
    }

    /**Запись выражения и ответа в историю*/
    private void writeExpression(String expression, String result) {
        try {
            FileWriter writer = new FileWriter("src/history.txt", true);
            writer.write(expression + "=" + result + "\n");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Файл для записи не найден! " + e);
        }
    }

    /**Чтение из истории выражений и ответов*/
    public Vector<String> readExpressions() {
        Vector<String> expressions = new Vector<>();
        try {
            FileReader reader = new FileReader("src\\history.txt");
            Scanner scannerReader = new Scanner(reader);

            while (scannerReader.hasNextLine()) {
                expressions.add((scannerReader.nextLine()));
            }
        } catch (IOException e) {
            System.out.println("Файл для чтения не найден! " + e);
        }

        return expressions;
    }

    /**Разбиение выражения на ЭЛЕМЕНТЫ*/
    private Vector<String> parse(String expression) {
        Vector<String> parsedExpression = new Vector<>();
        String[] vectorExpression = expression.split("");   //разбиение выражения на отдельные СИМВОЛЫ

        String digit = "";
        for (String symbol : vectorExpression) {
            //проверка на операторы и скобки
            if (isOperator(symbol) || symbol.equals("(") || symbol.equals(")")) {
                //сложение цифр в число
                if (digit != "") {
                    parsedExpression.add(digit);
                    digit = "";
                }

                parsedExpression.add(symbol);
            }
            //проверка на цифры
            else if (Character.isDigit(symbol.charAt(0)) || symbol == ".") {
                digit += symbol;
            }
        }

        //для последней цифры в выражении
        if (digit != "") {
            parsedExpression.add(digit);
        }

        return parsedExpression;
    }

    /**Проверка элемента на оператор*/
    private boolean isOperator(String operator) {
        String[] operators = new String[] {"+", "-", "*", "/"};
        for (String op : operators) {
            if (operator.equals(op)) {
                return true;
            }
        }

        return false;
    }}
