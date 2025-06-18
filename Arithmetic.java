/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

import java.rmi.server.Operation;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticBase calculator = new ArithmeticBase();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = scanner.next().toUpperCase();

        try {
            operation operation = operation.valueOf(input);
            double result = calculator.calculate(num1, num2, operation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

