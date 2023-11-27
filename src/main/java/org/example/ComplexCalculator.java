package org.example;

import org.example.complexInt.ComplexNumber;
import org.example.complexInt.ComplexOperation;

// Класс, представляющий калькулятор для комплексных чисел, использующий стратегию
public class ComplexCalculator {
    private ComplexOperation operation; // Стратегия операции

    // Конструктор, принимающий стратегию операции
    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }

    // Метод для выполнения операции с комплексными числами
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return operation.perform(num1, num2);
    }
}

