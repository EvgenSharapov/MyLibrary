package MVC;

import java.util.Scanner;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        while (true) {
            double a = view.getInput("Введите первое число: ");
            double b = view.getInput("Введите второе число: ");
            System.out.print("Выберите операцию (+, -, *, /) или 'exit' для выхода: ");
            Scanner scanner = new Scanner(System.in);
            String operation = scanner.next();

            try {
                switch (operation) {
                    case "+":
                        view.displayResult(model.add(a, b));
                        break;
                    case "-":
                        view.displayResult(model.subtract(a, b));
                        break;
                    case "*":
                        view.displayResult(model.multiply(a, b));
                        break;
                    case "/":
                        view.displayResult(model.divide(a, b));
                        break;
                    case "exit":
                        return;
                    default:
                        view.displayError("Неизвестная операция");
                }
            } catch (Exception e) {
                view.displayError(e.getMessage());
            }
        }
    }
}
