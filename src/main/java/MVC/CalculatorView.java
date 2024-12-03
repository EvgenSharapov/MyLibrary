package MVC;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public double getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public void displayError(String message) {
        System.out.println("Ошибка: " + message);
    }
}
