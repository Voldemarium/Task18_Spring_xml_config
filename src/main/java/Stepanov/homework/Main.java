package Stepanov.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = scanner.nextInt();
        System.out.print("Enter one of the operators: '+', '-', '*', '/'");

        String operator = scanner.next();
        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.print("The operator is entered incorrectly! Enter the correct value.");
            operator = scanner.next();
        }

        System.out.print("Enter the second number");
        int b = scanner.nextInt();

        switch (operator) {
            case "+" -> System.out.println(calculator.sum(a, b));
            case "-" -> System.out.println(calculator.subtract(a, b));
            case "/" -> System.out.println(calculator.divide(a, b));
            case "*" -> System.out.println(calculator.multiply(a, b));
        }
    }
}
