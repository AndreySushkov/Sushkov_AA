package Calculator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Controller {
    Model model = new Model();

    /**��������� � ������ � ������� ���������� ���������*/
    public double getResult(String expression){
        Vector<String> parsedExpression = parse(expression);
        double result = model.calculate(parsedExpression);

        writeExpression(expression, Double.toString(result));

        return result;
    }

    /**������ ��������� � ������ � �������*/
    private void writeExpression(String expression, String result) {
        try {
            FileWriter writer = new FileWriter("src/history.txt", true);
            writer.write(expression + "=" + result + "\n");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("���� ��� ������ �� ������! " + e);
        }
    }

    /**������ �� ������� ��������� � �������*/
    public Vector<String> readExpressions() {
        Vector<String> expressions = new Vector<>();
        try {
            FileReader reader = new FileReader("src\\history.txt");
            Scanner scannerReader = new Scanner(reader);

            while (scannerReader.hasNextLine()) {
                expressions.add((scannerReader.nextLine()));
            }
        } catch (IOException e) {
            System.out.println("���� ��� ������ �� ������! " + e);
        }

        return expressions;
    }

    /**��������� ��������� �� ��������*/
    private Vector<String> parse(String expression) {
        Vector<String> parsedExpression = new Vector<>();
        String[] vectorExpression = expression.split("");   //��������� ��������� �� ��������� �������

        String digit = "";
        for (String symbol : vectorExpression) {
            //�������� �� ��������� � ������
            if (isOperator(symbol) || symbol.equals("(") || symbol.equals(")")) {
                //�������� ���� � �����
                if (digit != "") {
                    parsedExpression.add(digit);
                    digit = "";
                }

                parsedExpression.add(symbol);
            }
            //�������� �� �����
            else if (Character.isDigit(symbol.charAt(0)) || symbol == ".") {
                digit += symbol;
            }
        }

        //��� ��������� ����� � ���������
        if (digit != "") {
            parsedExpression.add(digit);
        }

        return parsedExpression;
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
    }}
