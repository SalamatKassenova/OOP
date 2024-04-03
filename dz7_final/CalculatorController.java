package dz7_final;

import java.util.Scanner;

public class CalculatorController {
    private Calculator<ComplexNumber> calculator;
    private Scanner scanner;

    public CalculatorController(Calculator<ComplexNumber> calculator){
        this.calculator = calculator;
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Введите 'exit', чтобы выйти из программы" );
        while (true){
            System.out.println("Введите операцию (+, *, /) или exit, чтобы выйти из программы:");
            String operation = scanner.nextLine();
            if ("exit".equalsIgnoreCase(operation)) break;

            System.out.println("Введите первое комплексное число:");
            ComplexNumber a = readComplexNumber();

            System.out.println("Введмите второе комплексное число:");
            ComplexNumber b = readComplexNumber();

            try {
                switch (operation) {
                    case "+":
                        ComplexNumber resultAdd = calculator.add(a, b);
                        System.out.println(resultAdd);
                        Logger.log("Сложили" + a + " к " + b + ". Результат: " + resultAdd);
                        break;

                    case "*":
                        ComplexNumber resultMultiply = calculator.multiply(a, b);
                        System.out.println(resultMultiply);
                        Logger.log("Умножили" + a + " на " + b + ". Результат: " + resultMultiply);
                        break;

                    case "/":
                        ComplexNumber resultDivide = calculator.divide(a, b);
                        System.out.println(resultDivide);
                        Logger.log("Поделили" + a + " на " + b + ". Результат: " + resultDivide);
                        break;
                
                    default:
                        System.out.println("Неизвестная команда");
                        break;
                }
            } catch (ComplexDivisionByZeroException e){
                System.out.println("Error: " + e.getMessage());
                Logger.log("Error: " + e.getMessage());
            }
        }
    }

    private ComplexNumber readComplexNumber(){
        double real = scanner.nextDouble();
        double imaginary = scanner.nextDouble();
        scanner.nextLine(); //сканерит остаток строки
        return new ComplexNumber(real, imaginary);
    }

    public static void main(String[] args) {
        Calculator<ComplexNumber> complexCalculator = new ComplexCalculator(); 
        CalculatorController controller = new CalculatorController(complexCalculator);
        controller.start();
    }
}
