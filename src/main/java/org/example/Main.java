package org.example;

import org.example.complexInt.ComplexNumber;
import org.example.complexInt.ComplexOperation;
import org.example.logger.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Пример использования калькулятора и логгера
public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new SimpleComplexNumber(2, 3);
        ComplexNumber num2 = new SimpleComplexNumber(1, 2);

        ComplexOperation addition = new AdditionOperation();
        ComplexCalculator calculator = new ComplexCalculator(addition);

        Logger logger = new Logger();

        ComplexNumber result = calculator.calculate(num1, num2);
        logger.log("Addition Result: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
    }
}