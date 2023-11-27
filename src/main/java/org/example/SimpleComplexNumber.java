package org.example;

import org.example.complexInt.ComplexNumber;

// Реализация интерфейса ComplexNumber
public class SimpleComplexNumber implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    // Конструктор для создания объекта комплексного числа
    public SimpleComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
